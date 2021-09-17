package literature.demo;

import literature.Book;
import literature.LiteratureUtil;
import literature.Magazine;
import literature.interfaces.Printable;
//import static literature.interfaces.Printable.*;


public class Demo {
    public static void main(String[] args) {
        Printable magazine = new Magazine();
        Printable book = new Book();
        Printable[] printArray = new Printable[]{magazine, book};
        LiteratureUtil litUtil = new LiteratureUtil(printArray);
        litUtil.printLiterature();
        Magazine.printMagazines(printArray);
        Book.printBooks(printArray);

    }
}
