package assignment2.ControlCoupling;

public class War
{
    public void attack()
    {
        System.out.println("Attack");
    }
    public void defend()
    {
        System.out.println("Defend");
    }
    public void attackStrategy(int attackType)
    {
        switch(attackType)
        {
            case 1: attack();
            break;
            case 2: defend();
            break;
            default:break;
        }
    }
}
//attack type parameter passed from Attack option class controls the flow of War class.