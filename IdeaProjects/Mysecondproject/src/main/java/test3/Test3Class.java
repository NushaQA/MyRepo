package test3;

import java.util.Scanner;

public class Test3Class {
    public static void main(String[] args) {
        /* Task1: Создайте программу, выводящую на экран все четырёхзначные
        числа последовательности 1000 1003 1006 1009 1012 1015 */

        for (int i = 1000; i <= 9999; ) {
            System.out.println(i);
            i += 3;
        }

        /* Task2: Создайте программу, вычисляющую факториал натурального числа n,
        которое пользователь введёт с клавиатуры.
        https://javarush.ru/groups/posts/klass-scanner
        Факториал числа n — это произведение натуральных чисел от 1 до n.
        Обозначается n, произносится «эн-факториал».Например !3 = 1*2*3 */

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число:");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            long res = 1;
            if (number <= 0) {
                System.out.println("Извините, Вы ввели не натуральное число. Перезапустите программу и попробуйте снова!");
            } else {
                for (int i = 1; i <= number; i++) {
                    res = res * i;
                }
                System.out.println("Спасибо! Вы ввели число " + number);
                System.out.println("Факториал Вашего числа равен " + res);
            }
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }

        /*Task3: Выведите на экран все положительные делители натурального числа,
        введённого пользователем с клавиатуры*/
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите натуральное число:");

        if (sc1.hasNextInt()) {
            int number1 = sc1.nextInt();
            if (number1 <= 0) {
                System.out.println("Извините, Вы ввели не натуральное число. Перезапустите программу и попробуйте снова!");
            } else {
                System.out.print("Число " + number1 + " делится на : ");
                for (int j = 1; j <= number1; j++) {
                    if ((number1 % j) == 0) {
                        System.out.print(j + "; ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }

        /*Task4: Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр
        (заранее не известно сколько цифр будет в числе)*/
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите натуральное число:");

        if (sc2.hasNextInt()) {
            int number2 = sc2.nextInt();
            if (number2 <= 0) {
                System.out.println("Извините, Вы ввели не натуральное число. Перезапустите программу и попробуйте снова!");
            } else {
                int sum = 0;
                int num = number2;
                while (num > 0) {
                    sum = sum + num % 10;
                    num = num / 10;
                }
                System.out.println("Спасибо! Вы ввели число " + number2);
                System.out.println("Сумма всех цифр вашего числа равна " + sum);
            }
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }

        /*Task5:Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
        отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки)*/
        int[] a1 = new int[10];
        int c = 2;
        for (int k = 0; k < 10; k++) {
            a1[k] = c;
            c += 2;
            System.out.print(a1[k] + " ");
        }
        System.out.println();
        for (int l : a1)
            System.out.println(l);

        /*Task6:Создайте массив из всех нечётных чисел от 1 до 99,
        выведите его на экран в строку, а затем этот же массив выведите на экран тоже в строку,
        но в обратном порядке (99 97 95 93 … 7 5 3 1).*/
        int[] a2 = new int[50];
        int cc = 1;
        for (int kk = 0; kk < 50; kk++) {
            a2[kk] = cc;
            cc+=2;
            System.out.print(a2[kk] + " ");
        }
        System.out.println();
        for (int ll = a2.length-1; ll>=0; ll--)
            System.out.print(a2[ll] + " ");


    }
}


