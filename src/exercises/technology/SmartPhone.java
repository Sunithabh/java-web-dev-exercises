package exercises.technology;


//For a parent class add 3 properties, 2 methods, and a constructor.
//For a child class add at least 1 additional property and 1 additional method.
public class SmartPhone extends Computer{  //child class
    //Already contains the make, model, processor, and storageSize fields due to inheritance

    //Contains a field that the Computer class does not.
    private double weight;  // weight in grams

    //Already contains the Make, Model, Processor, and StorageSize properties.
    public SmartPhone(String make, String modelName, double processorSpeed, double storageSize, double weight){
        super(make, modelName, processorSpeed, storageSize);
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    public String isHeavy(){
        if (weight > 200){
            return getModelName() + " is Heavy";
        }else {
            return getModelName() + " is not Heavy";
        }
    }

}
