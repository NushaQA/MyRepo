package literature;

import literature.interfaces.Printable;

public class LiteratureUtil {
    private Printable[] printArr;

    public LiteratureUtil(Printable[] printArr){
        this.printArr = printArr;
    }

    public void printLiterature () {
        for (Printable p: printArr) {
            p.print();
        }
    }

}
