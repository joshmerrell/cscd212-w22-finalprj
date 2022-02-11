package cscd212.decorator;

import cscd212.classes.ChristmasTree;

public class SmileEmoji extends TreeDecorator {
    ChristmasTree christmasTree;

    public SmileEmoji(ChristmasTree christmasTree){
        this.christmasTree = christmasTree;
    }

    @Override
    public double cost() {
        return 15.00 + christmasTree.cost();
    }

    @Override
    public String getDescription() {
        return christmasTree.getDescription() + ", Smile Emoji Ornament";
    }
}
