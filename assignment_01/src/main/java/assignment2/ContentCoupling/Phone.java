package assignment2.ContentCoupling;

public class Phone
{
    public int Price;
    public String model;


    public void main(String[] args)
    {
        Phone phone =new Phone();
        phone.Price=20;
    }
}
//In content coupling one module can modify the data of another module. IN this example in main we are modifying the data of the Phone class.