package exercises.technology;


//For a parent class add 3 properties, 2 methods, and a constructor.
//For a child class add at least 1 additional property and 1 additional method.
public class Laptop extends Computer {  //child class
    //Already contains the make, model, processor, and storageSize fields due to inheritance

    //Contains a field that the Computer class does not.
    private double screenSize;    //screen size in inches.
    public Laptop(String make, String modelName, double processorSpeed, double storageSize, double screenSize){
        super(make, modelName, processorSpeed,  storageSize);
        this.screenSize = screenSize;
    }
    //Already contains the Make, Model, Processor, and StorageSize properties.

    public double getScreenSize(){
        return screenSize;
    }

    public String display(double screenSize) {
        if(screenSize > 15) {
            return getModelName() + " is quite big with a screen size of " + screenSize;
        } else {
            return getModelName() + " is small with a screen size of " + screenSize;
        }
    }

}
