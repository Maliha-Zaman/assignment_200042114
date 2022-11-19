package assignment2.StampCoupling;

public class Iphone {
    public  String model;
    public int price;
    public String camera;
    public Iphone(Mobile mobile)
    {
        this.model= mobile.model;
        this.price= mobile.price;
        this.camera=camera;
    }

}
//-->an object of Mobile class is passed into the constructor of Iphone class. Iphone class is highly dependent on Phone class.
// this is called stamp coupling.
