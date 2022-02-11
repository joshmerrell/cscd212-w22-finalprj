package cscd212.decorator;

import cscd212.classes.ChristmasTree;

public class LaughingEmoji extends TreeDecorator  {
    ChristmasTree christmasTree;

    public LaughingEmoji(ChristmasTree christmasTree){
        this.christmasTree = christmasTree;
    }
    @Override
    public double cost() {

        return 10.87 + christmasTree.cost();
    }

    @Override
    public String getDescription() {

        return christmasTree.getDescription() + ", Laughing Emoji Ornament";
    }
}
