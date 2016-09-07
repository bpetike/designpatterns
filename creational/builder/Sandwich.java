package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private BreadType bread;
    private MeatType meat;
    private CheeseType cheese;
    private boolean toasted;
    private Condiment condiment;

    private List<String> vegetables;
    
    public Sandwich() {
	vegetables = new ArrayList<>();
    }
    
    public BreadType getBread() {
        return bread;
    }

    public MeatType getMeat() {
        return meat;
    }

    public CheeseType getCheese() {
        return cheese;
    }

    public boolean isToasted() {
        return toasted;
    }

    public Condiment getCondiment() {
        return condiment;
    }
    
    public List<String> getVegetables() {
        return vegetables;
    }

    public void setBread(BreadType bread) {
        this.bread = bread;
    }

    public void setMeat(MeatType meat) {
        this.meat = meat;
    }

    public void setCheese(CheeseType cheese) {
        this.cheese = cheese;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public void setCondiment(Condiment condiment) {
        this.condiment = condiment;
    }

    public void setVegetables(List<String> vegetables) {
        this.vegetables = vegetables;
    }
    
    public void addVegetable(String vegetable)
    {
	this.vegetables.add(vegetable);
    }

    @Override
    public String toString() {
	return "Sandwich [bread=" + bread + ", meat=" + meat + ", cheese=" + cheese + ", toasted=" + toasted
		+ ", condiment=" + condiment + ", vegetables=" + vegetables + "]";
    }
    
}
