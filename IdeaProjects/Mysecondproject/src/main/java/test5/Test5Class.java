package test5;

public class Test5Class {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String str = "принтянрjояk";
        sumOffAllEvenNumbers(array);
        sumOffAllEvenIndexes(array);
        lookForFirstChar(str);
        lookForLastChar(str);

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

    public static void lookForFirstChar(String str) {
        char[] charArray;
        charArray = str.toCharArray();
        int numberPlace = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'я') {
                numberPlace = i + 1;
                System.out.println("Первая буква \"я\" стоит под " + numberPlace + " номером в строке " + "\"" + str + "\"");
                break;
            }
        }
    }

    public static void lookForLastChar(String str) {
        char[] charArray;
        charArray = str.toCharArray();
        int numberPlace = 0;
        for (int i = charArray.length - 1; i > -1; i--) {
            if (charArray[i] == 'я') {
                numberPlace = i + 1;
                System.out.println("Последняя буква \"я\" стоит под " + numberPlace + " номером в строке " + "\"" + str + "\"");
                break;
            }
        }
    }


}
