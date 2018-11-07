
public class DrinkCoffee
{

    public DrinkCoffee()
    {
    }

    public static void drinkCoffee(Cup cup)
    {
        if (!cup.isEmpty())
        {
            cup.takeOneSip();
            drinkCoffee(cup);
        }
    }

    public static void main(String[] args)
    {
        Cup cup = new Cup();

        drinkCoffee(cup);
        System.out.println("Done drinking");

        Cup mug = new Cup();

        while (!mug.isEmpty())
        {
            mug.takeOneSip();
        }
    }
}
