create database sqlex4;
show databases;
use sqlex4;

create table players (
	player_id integer not null unique,
    group_id integer not null
);

create table matches (
	match_id integer not null unique,
    first_player integer not null,
    second_player integer not null,
    first_score integer not null,
    second_score integer not null
);

insert into players values 
	(20, 2),
    (30, 1),
    (40, 3),
    (45, 1),
    (50, 2),
    (65, 1)
;

select * from players;

insert into matches values (1, 30, 45, 10, 12);
insert into matches values (2, 20, 50, 5, 5);
insert into matches values (13, 65, 45, 10, 10);
insert into matches values (5, 30, 65, 3, 15);
insert into matches values (42, 45, 65, 8, 4);
;

-- compute the winner in each group 
-- winner = score max within the group, if more than 1, return lowest id

-- write a sql query 
-- each record contain id of the group and id of the winner of the group 
-- order by id of the group asc 

with firstsum as (
	select first_player, sum(first_score) as fssum
    from matches
    group by first_player
), secondsum as (
	select second_player, sum(second_score) as secsum
    from matches
    group by second_player
), totalscoreforplayerinbothside as (
	select first_player as bothside_player, f.fssum + s.secsum as bothsum
	from firstsum f, secondsum s 
	where f.first_player = s.second_player
), totalscoreforplayeronlyonfirst as (
	select first_player, f.fssum
    from firstsum f
    where not exists (
	select 1
    from matches m1
    where f.first_player = m1.second_player
)
), totalscoreforplayeronlyonsecond as (
	select second_player, s.secsum
	from secondsum s
	where not exists (
		select 1
		from matches m1
		where s.second_player = m1.first_player
	)
), nomatchplayer as (
	select distinct p.player_id, 0
	from players p, matches m
	where not exists (
			select 1
			from matches m1
			where p.player_id = m1.first_player
	) and not exists (
			select 1
			from matches m2
			where p.player_id = m2.second_player
	)
), joinallside as (
	select first_player as player_id, fssum as total_score
	from totalscoreforplayeronlyonfirst f
	union all
	select *
	from totalscoreforplayeronlyonsecond s
	union all
	select *
	from totalscoreforplayerinbothside b
    union all
    select * from nomatchplayer n
)

select group_id, player_id
from (select ROW_NUMBER() OVER (PARTITION BY p.group_id ORDER BY j.total_score desc) as ROW_ID, p.group_id, p.player_id, j.total_score
from joinallside j, players p
where j.player_id = p.player_id) as partitioned
where partitioned.ROW_ID = 1
;


