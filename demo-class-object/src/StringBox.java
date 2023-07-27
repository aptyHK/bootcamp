import shape.Circle;

public class StringBox { // StringBox -> a class
  private String string; // String -> also a class

  // one student can reg many subject
  // one subject can reg by many students

  // Constructor, getter, setter
  public StringBox() {

  }

  public StringBox(String string) {
    // if (string == null) {
    //   this.string = "";
    // }
    this.string = string;
  }

  public String getString() {
    return this.string;
  }

  public void setString(String string) {
    this.string = string;
  }

  public StringBox append(String str) {
    this.string = this.string.concat(str);
    return this;
  }

  public static StringBox append(String str, String str2) {
    return new StringBox(str + str2);
  }

  public StringBox insert(int idx, String s) {
    // String left = this.string.substring(0, idx);
    // String right = this.string.substring(idx, this.string.length());
    // this.string = left.concat(s).concat(right);
    if (idx < 0 || idx > this.string.length()) {
      return this;
    }
    if (s == null || "".equals(s)) { //*** don't do if s.equals("") and s is null, the program can compile but with get error
      return this;
    }
    // if (str != null && str.equals(str2)) { // if want to compare 2 strings

    // }

    this.string = this.string.substring(0, idx) + s + this.string.substring(idx);
    return this;
  }

  public String toString() {
    return this.string;
  }



  public char[] toCharArray() {
    char[] chars = new char[this.string.length()];
    for (int i = 0; i < chars.length; i++) {
      chars[i] = this.string.charAt(i);
    }
    return chars;
  }

  public static void main(String[] args) {
    StringBox s = new StringBox(); // empty constructor
    StringBox s2 = new StringBox();
    s.setString("Java");
    System.out.println(s.append("Python")); // suppose JavaPython
    System.out.println(s.append("JavaScript").append("HTML").toString()); // s.(do something)+return the object->(do something)+return the objects.toString()
    System.out.println(s.getString());
    
    s2.setString("Hello");
    System.out.println(s2.getString());
    System.out.println(s2.insert(3, "bbbbbb").append("!!!!!!").toString());

    String str;
    //str.append("a");

    String s11 = "10";
    System.out.println(Integer.valueOf(s11));

    String testNull = null;
    // testNull.equals(""); // *** null.method won't work!!!!
    String s99 = StringBox.append("Hello", "World").toString();
    // left: normal string
    // right: call createNewWith2Ele method under class StringBox -> use constructor to create 
    //        a new StringBox object and return it -> make the StringBox object to a string -> 
    //        assign to the left
    s2.append("test toCharArray");
    char[] oochar = s2.toCharArray();
    System.out.println(String.valueOf(oochar));
  }
}
