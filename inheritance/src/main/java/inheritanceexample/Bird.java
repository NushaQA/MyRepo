package inheritanceexample;

public abstract class Bird {
    protected String color;

    protected Bird() {

    }

    protected Bird(String color) {

        this.color = color;
    }

    protected abstract void eat(String food);

    public void fly() {

        System.out.println("Bird is flying");
    }
}
