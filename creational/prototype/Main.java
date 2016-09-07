package creational.prototype;

public class Main {
    public static void main(String[] args) {
	Registry reg = new Registry();
	Movie aMovie = (Movie) reg.createItem("Movie");
	System.out.println(aMovie);
	aMovie.setTitle("Star Wars");
	System.out.println(aMovie);
    }
}
