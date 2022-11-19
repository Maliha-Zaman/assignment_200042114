package assignment2.DataCoupling;

public class AreaOfReactangle
{
    public int height;
    public int width;
    public int Area;
    public AreaOfReactangle(int height,int width)
    {
        this.height=height;
        this.width=width;
    }
    public void CalculateArea(int height,int width)
    {

        Area= height*width;
        System.out.println(Area);
    }

}
// the input values of height and width from main function are passed into the CalculateArea method thus we are getting data Coupling.
// passing value in method
