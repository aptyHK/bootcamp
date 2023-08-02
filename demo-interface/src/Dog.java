public class Dog extends GameMember implements Move, Move2 {

  // int score = 0;
  String name;

  @Override
  public void bigJump() {
    
  }

  @Override
  public void jump() {
    super.addScore(3); // super jor GameMember jump()
  }
  
  @Override
  public void up() {
    //this.score += 2;
    System.out.println("Moving up");
    super.addScore(2);
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

  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.print(); // Now both GameMember (parent) and Move (contract) have print()
    // Which print() is using?
    // Game Member print
    // Just because parent is more parent is more priorities than contract 
  }

}
