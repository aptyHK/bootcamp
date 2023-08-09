package arraylist1;

import java.util.ArrayList;
import java.util.Random;

public class Pocket {
  ArrayList<Ball> balls; // attribute // balls = new ArrayList<>(), can also do here

  public Pocket() {
    balls = new ArrayList<>(); // < if do this part in contructor, it will do at runtime
  }

  public boolean isFull() {
    return this.balls.size() >= 5;
  } 

  public void add(Ball ball) {
    // if number of ball > 5, remove the 1st (idx = 0), and add
    if (balls.size() >= 5) 
      this.balls.remove(0);
    this.balls.add(ball);// run-time error

  }

  public void removeFirstBall () {
    this.balls.remove(0); // first occurrence
  }

  public void remove (int ballId) {// overloading
    for (Ball b : this.balls) {
      if (b.getId() == ballId) // primitive == 
        this.balls.remove(b);
        return; // remove the first one and return
    }
  }

  public int getSize() {
    return this.balls.size();
  }
  
  @Override 
  public String toString() {
    StringBuilder sb = new StringBuilder("[");
    for (Ball b : this.balls) {
      sb.append(b.toString());
      sb.append(",");
    }
    sb.append("]");
    return sb.toString();
  }

  public int totalScore() {
    int sum = 0;
    for (Ball b : this.balls) {
      sum += b.getScore();
    }
    return sum;
  }
}
