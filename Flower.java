package HomeworkOne;

public class Flower
{
    // All instance variables
    String name;
    int petals;
    float price;

    // Constructor that creates the class with all instance variables being initialized
    public Flower(String name, int petals, float price)
    {
        this.name = name;
        this.petals = petals;
        this.price = price;
    }

    // Setters that manipulate instance variables
    public void setFlower(String name)
    {
        this.name = name;
    }

    public String getFlower()
    {
        return name;
    }

    public void setPetals(int petals)
    {
        this.petals = petals;
    }

    // Getters that return the instance variable
    public int getPetals()
    {
        return petals;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }

    public float getPrice()
    {
        return price;
    }
}
