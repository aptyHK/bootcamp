package shape;

public class Square {
  // private final Double length = 3.0; // each object will carry this instance variable with default value and never able to change it
  // private static Double length2 = 3.0; // class variable with default value

  private Edge[] edges;

  // what if you final the Edge[] array
  // -> final the address of the object reference "edges"
  // -> so I can't set a new edges array (when you do setter, this.edges = edges), it will give a new address which equal to change the whole array that contain the 4 edges of this object
  // after it had been constructed 

  // public Square() {
  //   this.edges = new Edge[4]; 
    
  //   this.edges[0] = new Edge(3.0d, "RED");
  //   this.edges[1] = new Edge(3.0d, "YELLOW");
  //   this.edges[2] = new Edge(3.0d, "BLACK");
  //   this.edges[3] = new Edge(3.0d, "BLUE");
    
  // }

  // constructor is good to handle something user do not want to handle when create this object
  //e.g. user: "I just want to create a square, I don't care about edge", but you would think edge is nessasary
  // so you won't ask user to create new edges too when create a square, you would do it for user
  private Square(double length) { 
    if (length <= 0.0) {
      length = 1.0d;
    }

    int id = 0;
    this.edges = new Edge[4]; // [null, null, null, null]
    this.edges[0] = new Edge(++id, length, "RED");
    this.edges[1] = new Edge(++id, length, "RED");
    this.edges[2] = new Edge(++id, length, "RED");
    this.edges[3] = new Edge(++id, length, "RED");
    //resetId();
    // there are total 5 objects created in this constructor:
    // the array, and the 4 edges
    // the 1st ball carry an array
    // and each slot of the array carry the object reference of the edge 1 2 3 4  
  }

  // when I set constructor to private, no one can call constructor
  // but i can set a valueof method, user can do the input, and then create a new square through the method
  // which I can set different input parameter to let user create a square
  public static Square of(double length) { 
    return new Square(length);
  }

  public Edge getEdge(int edgeId) {
    return this.edges[edgeId - 1];
  }

  private Edge[] getEdges() { // to prevent user access this method
    return this.edges;
  }

  public void setEdges(Edge[] edges) {
    this.edges = edges;
  }

  public void modifyEnlarge(int length) {
    for (int i = 0; i < 4; i++) {
      this.getEdges()[i].setLength(length);
    }
  }

  public void modifyColor(int edgeId, String color) {
      this.getEdges()[edgeId].setColor(color);
  }

  public void printSquareInfo() {
    // System.out.println("Square=" + squareId);
    for (int i = 0; i < 4; i++) {
      System.out.print("edge=" + this.getEdge(i+1).getId());
      System.out.print(" length=" + this.getEdge(i+1).getLength());
      System.out.print(" color=" + this.getEdge(i+1).getColor());
      System.out.println("");
    }
  }

  // public static void main(String[] args) {
  //   Square s1 = new Square(5);
  //   Square s2 = new Square(10);
  //   Square s3 = new Square(15);
  //   // square.edges[0].color = "YELLOW"; // cannot set like this if color is private
  //   // System.out.println(square.edges[0].color);
    
  //   // YELLOW
  //   s1.getEdges()[0].setColor("YELLOW");
  //   //System.out.println(s1.getEdges()[0].getColor());

  //   s1.modifyEnlarge(20);
  //   //System.out.println(String.valueOf(s1.edges[0].getLength()));

  //   //s1.printSquareInfo();

  //   // getEdges() ->
  // }

}
