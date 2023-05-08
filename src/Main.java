import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Main {
  public static void main(String[] args) {

    //Printing Today's Date
    LocalDate date = LocalDate.now();
    System.out.println("Today's Date:" + date);

    // checking whether the year is leap or not
    System.out.println("Whether this year is Leap or not?:" + date.isLeapYear());

    //Printing the Yesterday's Date
    LocalDate yesterday = date.minusDays(1);
    System.out.println("Yesterday's date:" + yesterday);

    //Printing the Length of the current Month
    System.out.println("Length of the current month:" + date.lengthOfMonth());

    //Printing the Length of the current Year
    System.out.println("Length of the current Year:" + date.lengthOfYear());


    //Printing the Tomorrow's Day
    LocalDate tomorrow = date.plusDays(1);
    System.out.println("Tomorrow's date:" + tomorrow);

    //Getting the current day of the month
    System.out.println("Current day of the month:" + date.getDayOfMonth());

    //Getting the current day of the week
    System.out.println("Current day of the week:" + date.getDayOfWeek());

    //Getting the day of the year
    System.out.println("Current day of the Year:" + date.getDayOfYear());

    //Getting the Current time
    LocalTime localTime = LocalTime.now();
    System.out.println("Current Time:" + localTime);


    // Calculating the Age
    LocalDate pdate = LocalDate.of(2002, 01, 30);
    LocalDate now = LocalDate.now();
    Period diff = Period.between(pdate, now);

    System.out.println("I am " + diff.getYears() + " Old");

  }
}