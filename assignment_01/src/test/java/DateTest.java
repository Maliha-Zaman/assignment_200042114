
import assignment1.Calender_Date;
import assignment1.Exception_in_Date;
import org.testng.annotations.Test;

public class DateTest {
    @Test
    public void Test1() throws Exception_in_Date{

        Calender_Date date = new Calender_Date(28,02,2020);
        System.out.println(date.print_next_date());
    }
    @Test
    public void Test2() throws Exception_in_Date{
        Calender_Date date = new Calender_Date(28,12,2012);
        System.out.println(date.print_next_date());
    }
    @Test
    public void Test3() throws Exception_in_Date {
        Calender_Date date = new Calender_Date(1,1,2022);
        System.out.println(date.print_next_date());
    }

    @Test
    public void Test4() throws Exception_in_Date{

        Calender_Date date = new Calender_Date(31,12,2022);
        System.out.println(date.print_next_date());
    }

    @Test
    public void Test5() throws Exception_in_Date{
        Calender_Date date = new Calender_Date(29,02,2020);
        System.out.println(date.print_next_date());
    }

    @Test
    public void Test6() throws Exception_in_Date{
        Calender_Date date = new Calender_Date(30,04,2021);
        System.out.println(date.print_next_date());
    }

    @Test
    public void Test7() throws Exception_in_Date{
        Calender_Date date = new Calender_Date(31,01,2022);
        System.out.println(date.print_next_date());
    }

    @Test
    public void Test8() throws Exception_in_Date{
        //28th day of february on leap year
        Calender_Date date = new Calender_Date(28,02,2020);
        System.out.println(date.print_next_date());
    }


}
