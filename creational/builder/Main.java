package creational.builder;

public class Main {

    public static void main(String[] args) {
	SandwichMaker sandwichMaker = new SandwichMaker(new ClubSandwuchBulder());
	sandwichMaker.BuildSandwich();
	Sandwich mySandwich = sandwichMaker.getSandwich();
	System.out.println(mySandwich);
	
    }

}
