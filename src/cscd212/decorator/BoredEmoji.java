package cscd212.decorator;
import cscd212.classes.ChristmasTree;
public class BoredEmoji extends TreeDecorator{
    ChristmasTree christmasTree;
    
    public BoredEmoji(ChristmasTree christmasTree){
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
