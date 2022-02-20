package cscd212.christmasdecorator.decorator;
import cscd212.christmasdecorator.classes.ChristmasTree;

public class BoredEmoji extends TreeDecorator{
    ChristmasTree christmasTree;

    public BoredEmoji(final ChristmasTree christmasTree){
        this.christmasTree = christmasTree;
    }
    @Override
    public double cost() {
        return 25.00 + christmasTree.cost();
    }

    @Override
    public String getDescription() {
        return christmasTree.getDescription() + ", Bored Emoji Ornament";
    }
}
