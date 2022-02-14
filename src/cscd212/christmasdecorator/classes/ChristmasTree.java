package cscd212.christmasdecorator.classes;

public abstract class ChristmasTree {
    String description = "Unknown tree type";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}