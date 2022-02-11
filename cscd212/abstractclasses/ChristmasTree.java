package cscd212.abstractclasses;

public abstract class ChristmasTree {
    String description = "Unknown type of tree";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
    //public String decorate() {
        //return null;
    }