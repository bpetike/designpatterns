package creational.builder;

public abstract class SandwichBuilder {
    protected Sandwich sandwich;

    public Sandwich getSandwich()
    {
        return sandwich;
    }

    public void createNewSandwich()
    {
         sandwich = new Sandwich();
    }

    public abstract void prepareBread();
    public abstract void applyMeatAndCheese();
    public abstract void applyVegetables();
    public abstract void addCondiment();
}
