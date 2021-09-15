package literature.demo;

import literature.Book;
import literature.Magazine;
import literature.interfaces.Printable;


public class Demo {
    public static void main(String[] args) {
        Printable magazine = new Magazine();
        Printable book = new Book();
        Printable[] printArray = new Printable[]{magazine, book};
        for (Printable x: printArray) {
            x.print();
        }
        Magazine.printMagazines(printArray);
        Book.printBooks(printArray);


    }
}
