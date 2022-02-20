package cscd212.christmasdecorator.decorator;

import cscd212.christmasdecorator.classes.ChristmasTree;

public class SmileEmoji extends TreeDecorator {
    ChristmasTree christmasTree;

    public SmileEmoji(final ChristmasTree christmasTree){
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
