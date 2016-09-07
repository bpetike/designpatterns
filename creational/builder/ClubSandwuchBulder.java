package creational.builder;

public class ClubSandwuchBulder extends SandwichBuilder {

    @Override
    public void prepareBread() {
	sandwich.setBread(BreadType.WHITE);
	sandwich.setToasted(true);
    }

    @Override
    public void applyMeatAndCheese() {
	sandwich.setMeat(MeatType.TURKEY);
	sandwich.setCheese(CheeseType.SWISS);
    }

    @Override
    public void applyVegetables() {
	sandwich.addVegetable("Tomato");
	sandwich.addVegetable("Onion");
	sandwich.addVegetable("Lettuce");
    }

    @Override
    public void addCondiment() {
	sandwich.setCondiment(Condiment.MAYONNAISE);
    }

}
