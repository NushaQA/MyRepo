package test5;

public class Test5Class {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sumOffAllEvenNumbers(array);
        sumOffAllEvenIndexes(array);

    }
/*
Есть массив с интами.Вывести на екран все числа или индексы которые удовлетворяют условию.
1. Найти суммы всех четных элементов массива.
2. Найти сумму индексов четных элементов массива.

Стринг:
- решаем через массив чаров:
    1. выясните, под каким номером встроке стоит первая буква я.
   2. выясните, под каким номером встроке стоит последняя буква я.
 */

    public static void sumOffAllEvenNumbers(int[] array) {
        int sumEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sumEven += array[i];
                System.out.print(array[i] + ", ");
            }
        }
       System.out.println("\nСумма всех четных элементов массива равна: " + sumEven);
    }

    public static void sumOffAllEvenIndexes(int[] array) {
        int sumEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sumEven += i;
                System.out.print(i + ", ");
            }
        }
        System.out.println("\nСумма индексов всех четных элементов массива равна: " + sumEven);
    }


}
