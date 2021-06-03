package exercises.technology;

// Create an abstract class, AbstractEntity, that contains the behavior for assigning and accessing
// such a unique ID for each class that extends it.
// Add this class to your program above, and add AbstractEntity to the class hierarchy in the correct place.
public class AbstractEntity {
    private int id;
    private static int nextId = 1;

    public AbstractEntity(){
        id = nextId;
        nextId++;
    }

    //Custom equals method
    @Override
    public boolean equals(Object o){   // Two objects are equal if they have the same id.
        if(this == o)
            return true;
        if(!(o instanceof AbstractEntity)) return false;
        AbstractEntity computer = (AbstractEntity) o;
        return getId() == computer.getId();
    }
    public int getId(){
        return id;
    }

}
