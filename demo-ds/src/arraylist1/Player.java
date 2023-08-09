package arraylist1;

public interface Player {
  
  int totalScore();

  public static void fillThePocket(Pocket pocket) {

    while (!(pocket.isFull())) {
      // Random a ball
      pocket.add(Ball.random());
    }

    // if (pocket.isFull())
    //   pocket.removeFirstBall();
    // pocket.add();
  }
}
