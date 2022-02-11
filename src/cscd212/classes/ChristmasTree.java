package cscd212.classes;

public abstract class ChristmasTree {
    String description = "Unknown type of tree";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}