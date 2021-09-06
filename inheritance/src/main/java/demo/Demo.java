package demo;

import inheritanceexample.Bird;
import inheritanceexample.Sparrow;

public class Demo {
    public static void main(String[] args) {
        Sparrow bird = new Sparrow();
        bird.printFields();
        Sparrow bird1 = new Sparrow("Green");
        bird1.printFields();
        Sparrow bird2 = new Sparrow("Italy","Green");
        bird2.printFields();
    }
}
