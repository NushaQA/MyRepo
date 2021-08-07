package test2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Test2Class {
    public static void main(String[] args) {
/*
Задача 1.
Во многих странах для измерения небольших размеров используется не только
единица длины «сантиметр», но и такая единица,
как «дюйм» (1 дюйм = 2.54 сантиметра).
Выведите в консоль 10 см,равное размеру в дюймах,
и затем 25 дюймов,но в сантиметрах.

Задача 2.
Подрабатывая в течение года, Вася собрал себе определенную сумму на поездку за границу,
а родители добавили ему от себя еще некоторую сумму.
Выведите в консоль сколько денег есть у Васи на отпуск (в евро) если:
Вася заработал 5000 грн,Родители добавили-5000,
курс евро 1 евро = 28 грню

Задача 3.
Если x любое положительное двузначное число
Выведите на екран его десятки и еденицы (2 числа)
разделенные знаком «пробел», но в обратном порядке.
То есть для числа 45 будет выведено на экран 5 4.

Задача 4.
Если x любое положительное двузначное число
Выведите на екран его в «полном виде»: напри­мер,
для числа 34 это будет выглядеть как 30+4.

Задача 5.
Назовем весом числа сумму его цифр.
Если x любое положительное двузначное число
Выведите на екран его «вес».

Задача 6.(со звездочкой)
Назовем «степенью четности» числа количество четных цифр в нем.
Например, для числа 4612 степень четности равна 3
(в его составе три четных цифры -4, 6 и 2).
Если x любое положительное двузначное число,
выведите на экран его «степень четности».


Задача 7.
Если x любое число,выведите на экран одно из следующих сообщений:
Положительное, или Отрицательное, или Ноль, -в зависимости от значения числа.

Задача 8.
Если x любое число,
если оно как минимум трехзначное и положительное,
уменьшает его на 1 и выводит на экран.

Задача 9.
Если x любое положительное двузначное число выведите на экран что больше:
само это число или произве­дение его цифр. 
 */
        //Task1
        int myInt1 = 10;
        double myDouble1 = myInt1 / 2.54d;
        System.out.println("Task1: 10 sm equals " + (float) myDouble1 + " inc");
        float myFloat1 = 25;
        System.out.println("Task1: 25 inch equals " + myFloat1 * 2.54 + " sm");

        //Task2
        float vasyaIncome = (5000.0f + 5000.0f) / 28.0f;
        System.out.println("Task2: Vasya income equals: " + vasyaIncome + " EUR");

        //Task3
        int x = 45;
        System.out.println("Task3: for number 45 the quantity of units: " + x % 10 + " and the quantity of dozens: " + x / 10);

        //Task4
        int y = 34;
        System.out.println("Task4: number 34 in its entirety: " + y / 10 * 10 + "+" + y % 10);

        //Task5
        int z = 47;
        System.out.println("Task5: the weight of number 47  is the sum of its digits: " + (z / 10 + z % 10));

        //Task6 - all digits are even
        int l1 = 88;
        int a1 = 2;
        if ((l1 % 10 % 2 == 0) && (l1 / 10 % 2 == 0)) {
            System.out.println("Task6: the degree of evenness of number " + l1 + " is " + a1);
        } else if ((l1 % 10 % 2 == 0) || (l1 / 10 % 2 == 0)) {
            --a1;
            System.out.println("Task6: the degree of evenness of number " + l1 + " is " + a1);
        } else if (!(l1 % 10 % 2 == 0) && !(l1 / 10 % 2 == 0)) {
            --a1;
            --a1;
            System.out.println("Task6: the degree of evenness of number " + l1 + " is " + a1);
        }
        //Task6 - all digits are odd
        int l2 = 93;
        int a2 = 2;
        if ((l2 % 10 % 2 == 0) && (l2 / 10 % 2 == 0)) {
            System.out.println("Task6: the degree of evenness of number " + l2 + " is " + a2);
        } else if ((l2 % 10 % 2 == 0) || (l2 / 10 % 2 == 0)) {
            --a2;
            System.out.println("Task6: the degree of evenness of number " + l2 + " is " + a2);
        } else if (!(l2 % 10 % 2 == 0) && !(l2 / 10 % 2 == 0)) {
            --a2;
            --a2;
            System.out.println("Task6: the degree of evenness of number " + l2 + " is " + a2);
        }
        //Task6 - one digit is even and another is odd
        int l3 = 74;
        int a3 = 2;
        if ((l3 % 10 % 2 == 0) && (l3 / 10 % 2 == 0)) {
            System.out.println("Task6: the degree of evenness of number " + l3 + " is " + a3);
        } else if ((l3 % 10 % 2 == 0) || (l3 / 10 % 2 == 0)) {
            --a3;
            System.out.println("Task6: the degree of evenness of number " + l3 + " is " + a3);
        } else if (!(l3 % 10 % 2 == 0) && !(l3 / 10 % 2 == 0)) {
            --a3;
            --a3;
            System.out.println("Task6: the degree of evenness of number " + l3 + " is " + a3);
        }

        //Task7
        int r = 2;
        if (r == 0) {
            System.out.println("Task7: your number " + r + " is 0");
        } else if (r > 0) {
            System.out.println("Task7: your number " + r + " > 0");
        } else if (r < 0) {
            System.out.println("Task7: your number " + r + " < 0");
        }

        //Task8
        float d = 3845.7f;
        float dd = d;
        int a5 = 0;
        if (d > 0) {
            while ((int) d != 0) {
                d = (int) d / 10;
                ++a5;
            }
            if (a5 >= 3) {
                System.out.println("Task8: your number " + dd+ " minus 1 equals: " + (dd-1));
            } else {
                System.out.println("Task8: your number is less then three-digit");
            }

        } else {
            System.out.println("Task8: your number is <0");
        }

        //Task9
        int xx = 72;
        int yy = xx>((xx/10)*(xx%10))?xx:((xx/10)*(xx%10));
        System.out.println("Task9: "+ yy);


    }
}
