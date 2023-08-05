package stonepaperscissors;

import java.util.Scanner;

public class Game {

  private Player[] players; // 1 game should have 2 or more players relationship

  public void prepareGame() {
    this.getNoOfPlayer();
  }

  public void getNoOfPlayer() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter number of players: ");
    int noOfPlayer = scanner.nextInt();
    this.createPlayer(noOfPlayer);
  }

  public void createPlayer(int noOfPlayer) {
    players = new Player[noOfPlayer];
    for (int i = 0; i < noOfPlayer; i++) {
      if (i == 0) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter player " + (i+1) + " name: ");
        players[i] = new Player("Andy", "Player"); //scanner.nextLine(), "Player");
        // scanner.close(); 
      }
      else {
        players[i] = new Player("CPU"+ i, "CPU");
      }
    }
  }

  public void gamePlay() {
    for (int i = 0; i < players.length; i++) {
      if ("Player".equals(players[i].getPlayerType()))
        pickOption(players, i); 
      if ("CPU".equals(players[i].getPlayerType()))
        randOption(players, i);
    }
    this.compareOptions();
  }

  public void pickOption(Player[] player, int which) {
    Scanner scanner = new Scanner(System.in);
    // boolean validOption = false;
    // String choice = " ";
    // while (!validOption) {
      System.out.println("Please enter your choice (stone, paper, or scissors): ");
    //   choice = scanner.nextLine();
    //   validOption = true;
    // }
    String choice = scanner.nextLine();
    // scanner.close(); 
    players[which].setPlayerOption(choice);
  }

  public void randOption(Player[] player, int which) {
    players[which].setPlayerOption((int) (Math.random() * 3) + 1);
  }
  
  public void compareOptions() {
    String[] result = new String[players.length];
    int countStone = 0;
    int countScissors = 0;
    int countPaper = 0;
    for (int i = 0; i < players.length; i++) {
      result[i] = players[i].getPlayerOption();
      if ("paper".equals(result[i])) {
        countPaper++;
        continue;
      }
      if ("scissors".equals(result[i])) {
        countScissors++;
        continue;
      }
      if ("stone".equals(result[i]))
        countStone++;
    }

    if (countStone != 0 && countScissors != 0 && countPaper != 0) {
      System.out.println("It's a tie! please pick again~");
      this.gamePlay();
    } else if (countStone == players.length || countScissors == players.length || countPaper == players.length) {
      System.out.println("It's a tie! please pick again~");
      this.gamePlay();
    } else if (countStone != 0 && countScissors != 0) {
      for (int i = 0; i < players.length; i++) {
        if ("stone".equals(players[i].getPlayerOption()))
          System.out.println(players[i].getPlayerName() + " wins!");
      } 
    } else if (countStone != 0 && countPaper != 0) {
      for (int i = 0; i < players.length; i++) {
        if ("paper".equals(players[i].getPlayerOption()))
          System.out.println(players[i].getPlayerName() + " wins!");
      } 
    } else if (countScissors != 0 && countPaper != 0) {
      for (int i = 0; i < players.length; i++) {
        if ("sucissors".equals(players[i].getPlayerOption()))
          System.out.println(players[i].getPlayerName() + " wins!");
      }
    }
  }

  public void showPlayerStatus() {
    System.out.println("Total Players = " + players.length);
    for (int i = 0; i < players.length; i++) {
      System.out.println("Player=" + players[i].getPlayerName() + " choice=" + players[i].getPlayerOption());
    }
  }

  public static void main(String[] args) {
    Game g1 = new Game();
    g1.prepareGame();
    g1.gamePlay();
    g1.showPlayerStatus();
  }
}
