public abstract class GameMember {

  private int score;

  public int getScore() {
    return this.score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public void addScore(int score) {
    this.score += score;
  }

  public void print() {
    System.out.println("Game Member print");
  }

  public abstract void up();

  public abstract void down();

  public abstract void left();

  public abstract void right();

  public static void upOnce(GameMember... members) { // multiple arguement
    for (GameMember member : members) {
      member.up(); // dog/ cat objects
    }
  }

    public static void moveOnce(Move[] members) {
    for (Move member : members) {
      member.jump(); // dog/ cat objects
    }
  }

  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();
    GameMember.upOnce(dog, cat);//
    System.out.println(dog.getScore());
    System.out.println(cat.getScore());

    Move[] members = new Move[] {dog, cat};
    GameMember.moveOnce(members);
    System.out.println(dog.getScore());
    System.out.println(cat.getScore());

    // as dog and cat had implement Move
    // Can apply Interface Move default instance method
    dog.print(); // I am Java 8 default method, from the default print() from Move
    cat.print(); // I am Java 8 default method from the default print() from Move
    // static method (from Interface Move)
    System.out.println(Move.concat("abc", "def")); // abcdef

    Cow cow = new Cow();
    cow.print(); // Hello print at Cow now, is calling print() on Cow

  }

}
