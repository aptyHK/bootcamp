package linkedlist;

public class LinkedList1 {
  // The bottom of ArrayList is array
  // But the bottom of LinkedList is LinkedList

  String str;
  LinkedList1 node;

  public LinkedList1() {

  }

  public LinkedList1(String str) {
    this.str = str;
  }

  public void setStr(String str) {
    this.str = str;
  }

  public void setNode(LinkedList1 node) {
    this.node = node;
  }

  public LinkedList1 getNode() {
    return this.node;
  }

  public String getStr() {
    return this.str;
  }

  public static void main(String[] args) {
    LinkedList1 ll = new LinkedList1();
    ll.setStr("Head");
    ll.setNode(new LinkedList1("Body"));

    ll.getNode().setNode((new LinkedList1("Tail")));

    LinkedList1 head = ll;
    String string = "";
    while(head.getNode() != null) {
      string += head.getStr();
      head = head.getNode(); // object reference
    }
  }
}
