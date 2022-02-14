package cscd212.christmasdecorator.decorator;

import cscd212.christmasdecorator.classes.ChristmasTree;

public class Star extends TreeDecorator{
    ChristmasTree christmasTree;

    public Star(ChristmasTree christmasTree){
        this.christmasTree = christmasTree;
    }
    @Override
    public double cost() {
        return 50.00 + christmasTree.cost();
    }

    @Override
    public String getDescription() {
        return christmasTree.getDescription() + ", Christmas Star";
    }
}
