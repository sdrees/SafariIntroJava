package datestuff;

public class Holiday extends Date {
  private String name;
  public Holiday(int day, int month, int year, String name) {
    super(day, month, year);
    this.name = name;
  }

  @Override
  public String toString() {
    return "Holiday: " + super.toString() + ", name=" + this.name;
  }
}
