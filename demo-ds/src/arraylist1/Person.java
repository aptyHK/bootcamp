package arraylist1;

public class Person implements Player {

  Pocket[] pockets;

  public Person() {
    pockets = new Pocket[] {new Pocket(), new Pocket()};
  }

  @Override
  public int totalScore() {

    return this.getLeftPocket().totalScore()
        + this.getRightPocket().totalScore();
  }

  public Pocket getLeftPocket() {
    return this.pockets[0];
  }

  public Pocket getRightPocket() {
    return this.pockets[1];
  }
  public static void main(String[] args) {
    Person person = new Person();
    Player.fillThePocket(person.getLeftPocket());
    Player.fillThePocket(person.getRightPocket());
    System.out.println(person.getLeftPocket().getSize()); // 5
    System.out.println(person.getRightPocket().getSize()); // 5

    Person person2 = new Person();
    Player.fillThePocket(person2.getLeftPocket());
    Player.fillThePocket(person2.getRightPocket());

    System.out.println("p1 toatl score: " + person.totalScore());
    System.out.println("p1 left ball details: " + person.getLeftPocket().toString());
    System.out.println("p1 right ball details: " + person.getRightPocket().toString());
  }
}
