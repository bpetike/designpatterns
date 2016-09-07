package creational.builder;

public class SandwichMaker {
    private SandwichBuilder builder;

    public SandwichMaker(SandwichBuilder builder) {
	this.builder = builder;
    }
    
    public void BuildSandwich()
    {
        builder.createNewSandwich();
        builder.prepareBread();
        builder.applyMeatAndCheese();
        builder.applyVegetables();
        builder.addCondiment();
    }
    
    public Sandwich getSandwich()
    {
	return builder.getSandwich();
    }
}
