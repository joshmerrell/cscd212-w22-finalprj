package cscd212.classes;
import cscd212.abstractclasses.ChristmasTree;

public class PineTree extends TreeDecorator {
    public PineTree() {
        description = "Pine Tree";
    }

    public double cost(){
        return 59.99;
    }
}

