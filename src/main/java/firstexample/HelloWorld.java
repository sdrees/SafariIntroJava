package firstexample;

import java.util.ArrayList;
import java.util.List;

/*
  543  cd src/main/java/
  546  ls firstexample/
  547  javac -version
  548  javac -d output firstexample/*.java
  552  java -cp output firstexample.HelloWorld
 */
public class HelloWorld {
  public static void main(String [] args) {
    System.out.println("Hello World!");

    // Strongly, statically typed...
    // Numbers: int, long, float, double
    // int range +/- 2 billion..
    // declare with TYPE name ... optional initialization
    int x = 99;
    System.out.println("x is " + x);
    var y = 100; // inferred int. Cannot change later!!!
//    y = 3.14;

    boolean b = true; // also false, lower case
    if (b) {
      System.out.println("b is true");
    } else {
      System.out.println("b is false");
    }
    if (y > x) {
      System.out.println("y is greater");
    } else {
      System.out.println("x is greater or equal");
    }

    int counter = 0;
    while (counter < 3) {
      System.out.println("Value of counter is " + counter++);
//      counter = counter + 1;
//      counter += 1; // also -= *= /= and some others...
//      counter++; // also counter--, ++counter, --counter
    }
    for (int counter2 = 0; counter2 < 2; counter2++) {
      System.out.println("counter2 is " + counter2);
    }

//    for (;;) {
//      System.out.println("forever....");
//    }

//    String  names[]; // C-style array brackets are legal, but not common
//    String  names[] = { "Fred", "Jim", "Sheila" };
//    String  names[] = new String[]{ "Fred", "Jim", "Sheila" };
    String  names[] = new String[3];
    names[0] = "Fred";
    names[1] = "Jim";
    names[2] = "Shiela";
    System.out.println("The first name in the array is " + names[0]);
    String [] bigger = new String[4];
    System.arraycopy(names, 0, bigger, 0, 3);
    names = bigger;
    names[3] = "Alice";
    System.out.println("fourth item is " + names[3]);

    //java.awt.List ll; // longhand name for unimported, or ambiguous...
//    List<Object> namesL = new ArrayList<>();
    List<String> namesL = new ArrayList<>();
    namesL.add("Fred");
    namesL.add("Jim");
    namesL.add("Sheila");
//    namesL.add(0, Double.valueOf(3.14));
    String nZero = namesL.get(0);
    System.out.println("First name in list is " + namesL.get(0));
    System.out.println("List is " + namesL);
  }
}
