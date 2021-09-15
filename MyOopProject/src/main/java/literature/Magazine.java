package literature;

import literature.interfaces.Printable;

public class Magazine implements Printable {

    public static void printMagazines(Printable[] printable) {
        for (Printable x : printable) {
            if (x instanceof Magazine) {
                System.out.println("The list of magazines");
            }
        }
    }

    public void print (){
        System.out.println(Printable.PrintText + "magazines");


    }
}
