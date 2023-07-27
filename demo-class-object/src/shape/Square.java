package shape;

public class Square {
  // private final Double length = 3.0; // each object will carry this instance variable with default value and never able to change it
  // private static Double length2 = 3.0; // class variable with default value

  private Edge[] edges;

  // public Square() {
  //   this.edges = new Edge[4]; 
    
  //   this.edges[0] = new Edge(3.0d, "RED");
  //   this.edges[1] = new Edge(3.0d, "YELLOW");
  //   this.edges[2] = new Edge(3.0d, "BLACK");
  //   this.edges[3] = new Edge(3.0d, "BLUE");
    
  // }

  public Square(double length) {
    this.edges = new Edge[4]; 
    
    this.edges[0] = new Edge(length, "RED");
    this.edges[1] = new Edge(length, "RED");
    this.edges[2] = new Edge(length, "RED");
    this.edges[3] = new Edge(length, "RED");
    
  }

  public Edge[] getEdges() {
    return this.edges;
  }

  public static void main(String[] args) {
    Square s1 = new Square(5);
    // square.edges[0].color = "YELLOW"; // cannot set like this if color is private
    // System.out.println(square.edges[0].color);
    
    // YELLOW
    s1.getEdges()[0].setColor("YELLOW");
    System.out.println(s1.getEdges()[0].getColor());
  }

}
