package literature;

import literature.interfaces.Printable;

public class Book implements Printable {

    public static void printBooks(Printable[] printable) {
        for (Printable x : printable) {
            if (x instanceof Book) {
                System.out.println("The list of books");
            }
        }
    }

    public void print (){
        System.out.println(Printable.PrintText + "books");
    }


}
