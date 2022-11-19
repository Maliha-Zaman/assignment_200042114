package assignment1;

public class February extends Calender
{
    February(int day, int year){
        super(day, 2, year);
        if(((this.year % 4 == 0) && (this.year % 100!= 0)) || (this.year%400 == 0))
        {
            this.setLastDayOfMonth(29);
        }
        else
        {
            this.setLastDayOfMonth(28);
        }
    }

}
