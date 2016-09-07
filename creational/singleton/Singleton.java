package creational.singleton;

import java.time.LocalDateTime;

public class Singleton {
    private Singleton instance = null;
    private LocalDateTime creationTime;
    
    private Singleton()
    {
	this.creationTime = LocalDateTime.now();
    }

    public Singleton getInstance() {
        if (instance == null)
        {
            synchronized(Singleton.class)
            {
        	if (instance == null)
        	{
        	    instance = new Singleton();
        	}
            }
        }
        return instance;
    }


    public LocalDateTime getCreationTime() {
        return creationTime;
    }
    
}
