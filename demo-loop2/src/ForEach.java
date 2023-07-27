import java.util.Arrays;

public class ForEach {
  public static void main(String[] args) {

    // for-each
    int[] arr = new int[] {200, 100, 3, 4};
    // for (Type Element : Dataset)
    for (int x : arr) {
      // System.out.println("for-each: hello, x=" + x);
      // System.out.println(arr[0]); // but you can still access element by index
      // modify
      arr[0] = 8;
    }

    int[] arr2 = new int[] {1, 4, 10, 13, 20, 0, 2};
    // {1,4,10,13,20,0}
    for (int i = arr2.length / 2; i < arr2.length; i++) {
      if (i > arr2.length - 1) {
        break;
      }
      // System.out.println("for-each: hello");
      // System.out.println("" + arr2[i] + arr2[arr2.length - i - 1]);
    }

    // limit for for-each
    // i) for-each do not have stop condition/ counter in loop signature
    // ii) because of missing index, so you can't do something different in different iteration

    //
    String[] strs = new String[] {"hello", "world"};
    for (String str : strs) {
      // System.out.println("for-each" + strs);
    }

    // Integer, Character (Wrapper class)
    Character[] chars = new Character[] {'L', 'a', '!', '('};
    for (Character c : chars) {
      System.out.println(c);
    }

    String s2 = "Hello world ! I am Vincent";

    String[] strings = s2.split("");
    for (String str : strings) {
      // System.out.println(str);
    }

    s2 = "Hello world ! I am Vincent ";

    // toCharArray() approach
    char[] chars1 = s2.toCharArray();
    String temp = "";

    for (int i = 0; i < s2.length(); i++) {

      if (chars1[i] == ' ' || i == s2.length() - 1) {
        if (i == s2.length() - 1) {
          temp += chars1[i];
        }
        // System.out.println(temp);
        temp = "";
        continue;
      }
      temp += chars1[i];
    }

    // substring approach
    // ...

    // System.out.println(Arrays.toString(mySplitSubStrings(s2)));

    int spaceCount = 0;
    String str = s2.trim();
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {
        spaceCount++;
      }
    }

    // vincent's aapproach

    String[] result = new String[spaceCount + 1];
    Arrays.fill(result, ""); // assign "" to all element
    int startIndex = 0;
    int index = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {
        result[index] = str.substring(startIndex, i);
        index++;
        startIndex = i + 1;
      } else if (i == str.length() - 1) {
        result[index] = str.substring(startIndex, str.length());
      }
    }

    System.out.println(Arrays.toString(result));

   int[] datas = new int[] {50, 100, 200};
   for (int x : datas) {
    System.out.println(x);
   }
  
  }
  



  public static void mySplitSubStrings(String str) {

    int[] spaceIndex =
        new int[str.length() - str.replaceAll(" ", "").length() + 1];
    int lastIndex = -1;

    for (int i = 0; i < spaceIndex.length; i++) {
      spaceIndex[0] = 0;
      lastIndex = str.indexOf(' ', lastIndex + 1);
      // spaceIndex[i + 1] = lastIndex;
      // System.out.println(spaceIndex[i]);
    }

    String[] strArr = new String[spaceIndex.length];
    // for (int i = 0; i < spaceIndex.length; i++) {
    // strArr[i] = str.substring(spaceIndex[i], spaceIndex[i+1]);
    // System.out.println(strArr[i]);
    // }
  }

  // Vincent's substring
  // public static String[] SplitSubStrings(String str) {

  // int spaceCount = 0;
  // for (int i = 0; i < str.length(); i++);
  // spaceCount++;

  // String[] result = new String[spaceCount + 1];
  // int startIndex = 0;
  // int index = 0;
  // for (int i = 0; i < str.length(); i++) {
  // if (str.charAt(i) == ' ') {
  // result[index] = str.substring(startIndex, i);
  // index++;
  // startIndex = i + 1;

  // }
  // }
  // return result;
  // }
}

