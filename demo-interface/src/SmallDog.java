public class SmallDog extends Dog {
  // jump()
  @Override
  public void jump() { // this is contract from class dog
    super.addScore(5); // super jor Dog jump
  }

  public static void main(String[] args) {
    SmallDog smallDog = new SmallDog();
    smallDog.jump(); // + 5
    System.out.println(smallDog.getScore()); // 5, the getScore() is from GameMember
    smallDog.up(); // + 2, the up() is from Dog
    System.out.println(); // 7
  }
  
}
