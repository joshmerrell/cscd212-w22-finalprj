package cscd212.classes;

public abstract class ChristmasTree {
    String description = "Unknown tree type";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}