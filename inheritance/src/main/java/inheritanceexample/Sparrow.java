package inheritanceexample;

public class Sparrow extends Bird {
    private String country;

    public Sparrow(String color) {

        super(color);
    }

    public Sparrow(String country, String color) {
        this.country = country;
        super.color = color;
    }

    @Override
    public void eat(String food) {
        System.out.println("Поели " + food);
    }

    public void printFields() {
        System.out.println("sparrow " + country + " " + color);
    }
}
