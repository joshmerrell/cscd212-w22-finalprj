package cscd212.christmasdecorator.classes;

import cscd212.christmasdecorator.decorator.BoredEmoji;
import cscd212.christmasdecorator.decorator.LaughingEmoji;
import cscd212.christmasdecorator.decorator.SmileEmoji;
import cscd212.christmasdecorator.decorator.Star;

public class Main {
    public static void  main(String args[]){
        ChristmasTree palm1 = new PalmTree();
        System.out.printf("%s (no decorations) cost: $%.2f\n", palm1.getDescription(), palm1.cost());

        ChristmasTree palm2 = new PalmTree();
        palm2 = new LaughingEmoji(palm2);
        palm2 = new BoredEmoji(palm2);
        palm2 = new Star(palm2);
        System.out.printf("%s costs $%.2f\n", palm2.getDescription(), palm2.cost());


        ChristmasTree palm3 = new PalmTree();
        palm3 = new LaughingEmoji(palm3);
        palm3 = new BoredEmoji(palm3);
        palm3 = new SmileEmoji(palm3);
        palm3 = new Star(palm3);
        System.out.printf("%s costs $%.2f\n\n", palm3.getDescription(), palm3.cost());


        ChristmasTree pine1 = new PineTree();
        System.out.printf("%s (no decorations) cost: $%.2f\n", pine1.getDescription(), pine1.cost());


        ChristmasTree pine2 = new PineTree();
        pine2 = new SmileEmoji(pine2);
        pine2 = new Star(pine2);
        System.out.printf("%s costs $%.2f\n", pine2.getDescription(), pine2.cost());

        ChristmasTree pine3 = new PineTree();
        pine3 = new Star(pine3);
        System.out.printf("%s costs $%.2f\n", pine3.getDescription(), pine3.cost());


    }
}
