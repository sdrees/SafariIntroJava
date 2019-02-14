package datestuff;

//import static datestuff.Date.isLeapYear;

public class TryMyDate {
  public static void main(String[] args) {
    System.out.println("Year 2000 is a leap year? " + Date.isLeapYear(2000));
    System.out.println("Year 1900 is a leap year? " + Date.isLeapYear(1900));
    System.out.println("Days in feb 2000? " + Date.daysInMonth(2, 2000));
    System.out.println("Days in feb 1900? " + Date.daysInMonth(2, 1900));

    System.out.println("Jan 1, 2000 was day number "
        + Date.dayOfWeek(1, 1, 2000));
    System.out.println("Mar 1, 2000 was day number "
        + Date.dayOfWeek(1, 3, 2000));
    System.out.println("Mar 1, 2019 is day number "
        + Date.dayOfWeek(1, 3));
  }
}
