package assignment1;

 public class Calender {
    public int day;
    public int month;
    public int year;

    Calender(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

     public int lastDayOfMonth;


     public void setLastDayOfMonth(int day_mon) {
         this.lastDayOfMonth = day_mon;
     }

    public void nextDay() {
        if (day == lastDayOfMonth)
        {
            day = 0;

            if (month == 12)
            {
                month = 1;
                year++;
            }
            else
            {
                month++;
            }
        }
        day++;
    }


}




