package assignment1;
import java.time.DateTimeException;
import java.util.Arrays;
import java.util.List;

public class Calender_Date
{
  List<Integer> Month_30 = Arrays.asList(4,6,9,11);
  List<Integer> Month_31 = Arrays.asList(1,3,5,7,8,10,12);

  Calender calender;
  public Calender_Date(int day, int month, int year) throws DateTimeException, Exception_in_Date {
      if(Month_31.contains(month)){
          if( day<1||day>31)
          {
              throw new Exception_in_Date("Incorrect date");
          }
          this.calender = new Month_31(day,month,year);
      }
      else if(Month_30.contains(month)){
          if(day<1||day>30)
          {
              throw new Exception_in_Date("Incorrect date");
          }
          this.calender = new Month_30(day,month,year);
      }
      else if(month == 2)
      {
          if( day<1||day>29)
          {
              throw new Exception_in_Date("Incorrect date");
          }
          this.calender = new February(day, year);
      }
      else
      {
          throw new Exception_in_Date("Incorrect Month");
      }

  }

    public  String print_next_date(){
        calender.nextDay();
        return calender.getDay() + "-" + calender.getMonth() + "-" + calender.getYear();
    }

}

