package inheritanceexample;

public class Sparrow extends Bird {
    private String country;

    public Sparrow() {

    }

    public Sparrow(String color) {

        super(color);
    }

    public Sparrow(String country, String color) {

        super(color);
        this.country = country;

    }

    @Override
    public void eat(String food) {

        System.out.println("Поели " + food);
    }

    public void printFields() {

        System.out.println("Sparrow " + country + " " + color);
    }
}
