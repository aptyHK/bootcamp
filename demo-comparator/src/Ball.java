public class Ball { //implements Comparable<Ball> {
  int id;
  Color color;

  public Ball(int id, Color color) {
    this.id = id;
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  // Please write a new sorting
  // Yellow come first, if color same, id ascending order
  // if not Yellow, id descedning order
  // @Override
  // public int compareTo(Ball ball) {
  //     if (this.getColor() == Color.YELLOW && ball.getColor() == Color.YELLOW)
  //       return ball.id < this.id ? 1 : -1;

  //     if (this.getColor() == Color.YELLOW || ball.getColor() == Color.YELLOW)
  //       return ball.getColor() == Color.YELLOW ? 1 : -1;

  //     if (this.getColor() != Color.YELLOW && ball.getColor() != Color.YELLOW)
  //       return ball.id > this.id ? 1 : -1;
    
  //     return 1;
  //     // ball.getColor() == Color.YELLOW ? 1 : -1;
    
  //  // return ball.getColor() != Color.YELLOW && ball.id < this.id ? 1 : -1;
  // }

  // @Override
  // public int compareTo(Ball ball) {
  //   return ball.id > this.id ? 1 : -1;
  // }

  @Override
  public String toString(){
    return "[Color=" + color + ", id=" + this.id + "]";
  }
}
