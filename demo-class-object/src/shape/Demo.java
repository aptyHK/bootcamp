package shape;

import java.util.Arrays;

public class Demo {
  
  public static void main(String[] args) {
    Square s1 = Square.of(5);
    Square s2 = Square.of(10);
    // square.edges[0].color = "YELLOW"; // cannot set like this if color is private
    // System.out.println(square.edges[0].color);
    
    // YELLOW
    // s1.getEdges()[0].setColor("YELLOW"); // can't do now getEdges() has been set to private
    // System.out.println(s1.getEdges()[0].getColor());

    // s1.modifyEnlarge(20);
    // // System.out.println(String.valueOf(s1.edges[0].getLength())); // // can't do now as edges() array has been set to private

    // System.out.println(s1.getEdge(1).getLength()); 
    // // a get edge method has been created in square class
    // // I got the address of the edge 1 of square s1 by s1.getEdge(1)
    // // so I can call the method in Edge class to do what I want

    s1.setEdges(new Edge[4]);
    s1.printSquareInfo();
  }
}
