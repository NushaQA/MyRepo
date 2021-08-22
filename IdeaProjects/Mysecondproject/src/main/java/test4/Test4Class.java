package test4;

import java.sql.SQLOutput;

public class Test4Class {
   /*1. Практика методов класса String
   Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
   Распечатать последний символ строки. Используем метод String.charAt().
   Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
   Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
   Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
   Найти позицию подстроки “Java” в строке “I like Java!!!”.
   Заменить все символы “а” на “о”.
   Преобразуйте строку к верхнему регистру.
   Преобразуйте строку к нижнему регистру.
   Вырезать строку Java c помощью метода String.substring()*/

    public static void main(String[] args) {
        String a = "I like Java!!!";
        Test4Class b = new Test4Class();
        anyStr(a);
        prnLast(a);
        b.compWithEnd(a);
        b.compWithStart(a);
        compStr(a);
        findStr(a);
        repStr(a);
        lowStr(a);
        upStr(a);
        subStr(a);
    }

    public static void anyStr(String str) {

        System.out.println("This method takes any string: " + "\"" + str + "\"");
    }

    public static void prnLast(String str) {
        char result = str.charAt(str.length() - 1);

        System.out.println("The last character of the string: " + "\"" + str + "\" " + "is " + result);
    }
//я использую в качестве модификатора метода просто public намеренно, что бы научиться правильно его вызывать в методе main

    public void compWithEnd(String str) {
        boolean retVal = str.endsWith("!!!");
        if (retVal) {
            System.out.println("The string: " + "\"" + str + "\"" + " ends with " + "\"" + "!!!" + "\"");
        } else System.out.println("The string: " + "\"" + str + "\"" + " does not end with " + "\"" + "!!!" + "\"");
    }
//я использую в качестве модификатора метода просто public намеренно, что бы научиться правильно его вызывать в методе main

    public void compWithStart(String str) {
        boolean retVal = str.startsWith("I like");
        if (retVal) {
            System.out.println("The string: " + "\"" + str + "\"" + " starts with " + "\"" + "I like" + "\"");
        } else
            System.out.println("The string: " + "\"" + str + "\"" + " does not start with " + "\"" + "I like" + "\"");
    }

    public static void compStr(String str) {
        boolean retVal = str.contains("Java");
        if (retVal) {
            System.out.printf("%S%n","The string: " + "\"" + str + "\"" + " contains " + "\"" + "Java" + "\"");
        } else System.out.printf("%S%n","The string: " + "\"" + str + "\"" + " does not contain " + "\"" + "Java" + "\"");
    }

    public static void findStr(String str) {
        int pos = str.indexOf("Java");
        System.out.println("The position of substring: " + "\"" + "Java" + "\"" + " in string: " + "\"" + str + "\"" + " is started from " + pos + "th character");
    }

    public static void repStr(String str) {
        String newStr = str.replaceAll("a", "o");
        System.out.print("After changing all " + "\"" + "a" + "\"");
        System.out.print(" in string " + "\"" + str + "\"" + " to " + "\"" + "o" + "\"");
        System.out.printf("%s%n"," the new string is " + "\"" + newStr + "\"");

    }

    public static void lowStr(String str) {
        String strL = str.toLowerCase();
        System.out.println("Lower case: " + "\"" + strL + "\"");
    }

    public static void upStr(String str) {
        String strU = str.toUpperCase();
        System.out.println("Upper case: " + "\"" + strU + "\"");
    }

    public static void subStr(String str) {
       System.out.println("Substring from 7 to 11 character: " + str.substring(7,11));
    }
}





