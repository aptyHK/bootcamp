import java.util.Scanner;

public class JavaQuest3IfVersion {
  public static void main(String[] strings) {

    Scanner s = new Scanner(System.in);
    System.out.println("Please enter month: ");
    int inMonth = s.nextInt();
    System.out.println("Please enter year: ");
    int inYear = s.nextInt();
    String monthName = "Unknown";
    int numOfDays = 0;
    
    if (inMonth == 1) {
      monthName = "January";
      numOfDays = 30;
    } else if (inMonth == 2) {
      monthName = "February";
      numOfDays = 28;
      if (inYear % 4 == 0 && inYear % 100 != 0 || inYear % 400 == 0) {
        numOfDays = 29;
      }
    } else if (inMonth == 3 ) {
      monthName = "March";
      numOfDays = 31;   
    } else if (inMonth == 4) {
      monthName = "April";
      numOfDays = 30;   
    } else if (inMonth == 5) {
      monthName = "May";
      numOfDays = 31;   
    } else if (inMonth == 6) {
      monthName = "June";
      numOfDays = 30;   
    } else if (inMonth == 7) {
      monthName = "July";
      numOfDays = 31;   
    } else if (inMonth == 8) {
      monthName = "August";
      numOfDays = 31;   
    } else if (inMonth == 9) {
      monthName = "September";
      numOfDays = 30;   
    } else if (inMonth == 10) {
      monthName = "October";
      numOfDays = 31;   
    } else if (inMonth == 11) {
      monthName = "November";
      numOfDays = 30;   
    } else if (inMonth == 12) {
      monthName = "December";
      numOfDays = 31;   
    } else {
      System.out.println("Please enter a valid month!");
    }

    System.out.println("The month and year entered: " + monthName + " " + inYear + " and number of days in the month is: " + numOfDays);
  }
}
