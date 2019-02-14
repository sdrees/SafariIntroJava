package datestuff;

public class TryHoliday {
  public static void showDate(Date d) {
    System.out.println("The date is " + d);
  }
  public static void main(String[] args) {
    Date d = new Date(1, 1, 2000);
    Holiday h = new Holiday(1, 1, 2000, "NYE");
    showDate(d);
    showDate(h);
  }
}
