package collection;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Cars> CarsArrayList = new ArrayList <Cars> ();
        Cars myCar1 = new Cars ("A", "Smart ForTwo");
        Cars myCar2 = new Cars ("A", "Renault Twizy");
        Cars myCar3 = new Cars ("B", "Ford Fiesta");
        Cars myCar4 = new Cars ("B", "Kia Rio");
        Cars myCar5 = new Cars ("C", "Honda Civic");
        Cars myCar6 = new Cars ("C", "Volswagen Golf");
        Cars myCar7 = new Cars ("D", "Alfa Romeo");
        Cars myCar8 = new Cars ("D", "Lexus IS");
        CarsArrayList.add (myCar1);
        CarsArrayList.add (myCar2);
        CarsArrayList.add (myCar3);
        CarsArrayList.add (myCar4);
        CarsArrayList.add (myCar5);
        CarsArrayList.add (myCar6);

        System.out.println("The first element of ArrayList:");
        System.out.println(CarsArrayList.get(0).toString());//вывод на экран первого элемента

        System.out.println("The initial ArrayList:");
        for (Cars c: CarsArrayList) {
            System.out.println(c.toString()); //вывод на экран всех элементов
        }

        CarsArrayList.add(CarsArrayList.size(), myCar7); //добавление последнего элемента
        CarsArrayList.add(CarsArrayList.size()-1, myCar8); //добавление предпоследнего элемента

        System.out.println("The renewed ArrayList:");
        for (Cars c: CarsArrayList) {
            System.out.println(c.toString()); //снова вывод на экран всех элементов
        }
    }
}
