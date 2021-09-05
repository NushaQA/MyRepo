package inheritanceexample;

public class demo {
    public static void main (String[] args){

        Sparrow bird = new Sparrow();
        bird.printFields();
        Sparrow bird1 = new Sparrow("Green");
        bird1.printFields();
        Sparrow bird2 = new Sparrow("Green", "Ukraine");
        bird2.printFields();

    }
}
