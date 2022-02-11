package cscd212.classes;
import cscd212.abstractclasses.ChristmasTree;

public class TreeDecorator extends ChristmasTree {
    private ChristmasTree tree;

    public TreeDecorator(ChristmasTree tree) {
        this.tree = tree;
    }

    @Override
    public String decorate() {
        return tree.decorate();
    }
}
