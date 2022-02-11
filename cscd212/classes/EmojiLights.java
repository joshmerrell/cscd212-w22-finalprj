package cscd212.classes;
import cscd212.abstractclasses.ChristmasTree;

public class EmojiLights extends TreeDecorator {
    public EmojiLights(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithEmoji();
    }

    private String decorateWithEmoji() {
        return " with Emoji Lights";
    }
}

