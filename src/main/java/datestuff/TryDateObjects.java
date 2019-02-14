package datestuff;

public class TryDateObjects {
  public static void main(String[] args) {
//    int myBirthDay = 20;
//    int myBirthMonth = 3;
//    int myBirthYear = 1995;
//
//    int yourB...

//    Date myBirthday = new Date();
//    myBirthday.day = 20;
//    myBirthday.month = 3;
//    myBirthday.year = 1995;

    Date myBirthday = new Date(20, 3, 1995);
//    System.out.println("Day of week of myBirthday is "
//        + Date.dayOfWeek(myBirthday));
    System.out.println("Day of week of myBirthday is "
        + myBirthday.dayOfWeek());

//    System.out.println("My birthday is on " + Date.getDay(myBirthday));
    System.out.println("My birthday is on " + myBirthday.getDay());
  }
}
