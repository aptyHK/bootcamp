public class Cat extends GameMember implements Move {

  // int score = 0;
  String name;

  @Override
  public void bigJump() {
    
  }

  @Override
  public void up() {
    // this.score += 2;
    System.out.println("Moving up");
    super.addScore(1);
  }

  public void jump() {
    super.addScore(4);
  }

  @Override
  public void down() {

  }

  @Override
  public void left() {

  }

  @Override
  public void right() {

  }

}


