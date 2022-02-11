package cscd212.classes;

import cscd212.decorator.BoredEmoji;
import cscd212.decorator.LaughingEmoji;
import cscd212.decorator.SmileEmoji;
import cscd212.decorator.Star;

public class Main {
    public static void  main(String args[]){
        ChristmasTree christmasTree = new PalmTree();
        System.out.println(christmasTree.getDescription() + " $" + christmasTree.cost());

        ChristmasTree christmasTree2 = new PineTree();
        System.out.println(christmasTree.getDescription() + " $" + christmasTree.cost());

        ChristmasTree christmasTree3 = new PalmTree();
        christmasTree3 = new LaughingEmoji(christmasTree3);
        christmasTree3 = new BoredEmoji(christmasTree3);
        christmasTree3 = new Star(christmasTree3);
        System.out.println(christmasTree.getDescription() + " $" + christmasTree.cost());

        ChristmasTree christmasTree4 = new PineTree();
        christmasTree4 = new SmileEmoji(christmasTree4);
        christmasTree4 = new Star(christmasTree4);
        System.out.println(christmasTree.getDescription() + " $" + christmasTree.cost());
    }
}
