package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<>();
    
    public Registry()
    {
	loadItems();
    }
    
    public Item createItem(String tyoe)
    {
	Item item = null;
	try {
	    item = (Item) items.get(tyoe).clone();
	} catch (CloneNotSupportedException e) {
	    e.printStackTrace();
	}
	return item ;
    }

    private void loadItems() {
	Movie movie = new Movie();
	movie.setTitle("300");
	movie.setPrice(14.99);
	movie.setRuntime(113);
	movie.setUrl("file://C:/ncore/movies/300");
	items.put("Movie", movie);
	
	Book book = new Book();
	book.setTitle("Clean Code");
	book.setPrice(39.99);
	book.setUrl("n/a");
	book.setNumberOfPages(624);
	items.put("Book", book);
    }
}
