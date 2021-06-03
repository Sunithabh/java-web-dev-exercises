package exercises.technology;


//For a parent class add 3 properties, 2 methods, and a constructor.
//For a child class add at least 1 additional property and 1 additional method.
public class Computer extends AbstractEntity{   //parent class

    // Adding fields/properties
    private String make;  //which company
    private String modelName;
    private double processorSpeed;
    private double storageSize;

    //Adding constructors
    public Computer(String make, String modelName, double processorSpeed, double storageSize){
        super();
        this.make = make;
        this.modelName = modelName;
        this.processorSpeed = processorSpeed;
        this.storageSize = storageSize;   // in GB
    }

    public String getMake(){
        return make;
    }
    public String getModelName(){
        return modelName;
    }
    public double getStorageSize(){
        return storageSize;
    }
    public void setStorageSize(double storageSize){
        if(storageSize > this.getStorageSize()){
            throw new IllegalArgumentException("Exceeding the maximum storage limit");
        }
        this.storageSize = storageSize;
    }
    public double getProcessorSpeed(){
        return processorSpeed;
    }
    public void setProcessorSpeed(double processorSpeed){
        if(processorSpeed > this.getProcessorSpeed()){
            throw new IllegalArgumentException("Exceeding the maximum speed limit");
        }
        this.processorSpeed = processorSpeed;
    }

    //Methods//

    // increase the processor speed
    public void increaseProcessorSpeed(double x){
       this.setProcessorSpeed(this.getProcessorSpeed() + x);
    }

    // Increase the storage size
    public void addStorageSize(double storageSize){
        this.setStorageSize(this.getStorageSize() +storageSize);
    }



}
