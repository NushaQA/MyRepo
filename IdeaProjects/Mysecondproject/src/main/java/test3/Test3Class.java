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
    }
}


