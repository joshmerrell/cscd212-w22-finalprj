package cscd212.classes;

public abstract class SalesObject {
    private double cost;
    private String description;
    public double getCost() {
        return this.cost;
    }
    protected void setCost(double cost) {
        this.cost = cost;
    }
    public String getDescription() {
        return this.description;
    }
    protected void setDescription(String description) {
        this.description = description;
    }
}
