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
   Вырезать строку Java c помощью метода String.substring()
   2. Список студентов
   Создать строку, используя форматирование: Студент [Фамилия] получил [оценка] по [предмету].
   Форматирование и вывод строки на консоль написать в отдельном методе, который принимает фамилию, оценку и название предмета в качестве параметров.
   Выделить под фамилию 15 символов, под оценку 3 символа, под предмет – 10.
   Пример вывода:
   Студент Иванов            получил 5   по Математике
   Студент Петрова         получил 4   по Физике
   Студент Сидорова        получил 3   по Программированию
   3. Слово с минимальным числом символов
   Найти слово, в котором число различных символов минимально. Слово может содержать буквы и цифры.
   Если таких слов несколько, найти первое из них.
   Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".*/

    public static void main(String[] args) {
        String a = "I like Java!!!";
        Test4Class b = new Test4Class();
        String[][] arr = {{"Иванов", "5", "Математике"}, {"Петров", "4", "Физике"}, {"Сидоров", "3", "Программированию"}};
        String text = "ffffff abc f ccc 1234 jkjk";
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
        formatPrn(arr);
        minChar(text);

    }

    //Задача 1
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
            //захотелось поэксперементировать с System.out.printf
            System.out.printf("%S%n", "The string: " + "\"" + str + "\"" + " contains " + "\"" + "Java" + "\"");
        } else
            System.out.printf("%S%n", "The string: " + "\"" + str + "\"" + " does not contain " + "\"" + "Java" + "\"");
    }

    public static void findStr(String str) {
        int pos = str.indexOf("Java");
        System.out.println("The position of substring: " + "\"" + "Java" + "\"" + " in string: " + "\"" + str + "\"" + " is started from " + pos + "th character");
    }

    public static void repStr(String str) {
        String newStr = str.replaceAll("a", "o");
        System.out.print("After changing all " + "\"" + "a" + "\"");
        System.out.print(" in string " + "\"" + str + "\"" + " to " + "\"" + "o" + "\"");
        System.out.printf("%s%n", " the new string is " + "\"" + newStr + "\"");

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
        System.out.println("Substring from 7 to 11 character: " + str.substring(7, 11));
    }

    //Задача 2
    public static void formatPrn(String[][] arr) {
        String specifier = "Студент %-15s получил %-3s по %-10s%n";
        for (int i = 0; i < 3; i++) {
            String fs = String.format(specifier, arr[i][0], arr[i][1], arr[i][2]);
            System.out.print(fs);
            // можно сделать это короче System.out.format(specifier, arr[i][0], arr[i][1], arr[i][2]);
        }
    }

    //Задача 3
    public static void minChar(String text) {
        String[] words = text.split(" ");
        int[] minChar = new int[words.length];
        int min = Integer.MAX_VALUE;
        int k = 0;
        char charStart;
        char[] wordCurrent;

        //нахожу количество различющихся симоволов для каждого слова
        for (String word : words) {
            charStart = word.charAt(0);
            wordCurrent = word.toCharArray();
            minChar[k] = 0;

            for (int i = 0; i < wordCurrent.length; i++) {
                if (wordCurrent[i] != charStart) {
                    minChar[k]++;
                }
            }
            k++;
        }

       //нахожу минимальное количество различющихся симоволов
        for (int j = 0; j < minChar.length; j++) {

            min = Math.min(min, minChar[j]);
        }
        //нахожу индекс слова с минимальным числом различющихся символов
        for (int i = 0; i < minChar.length; i++) {
            if (minChar[i] == min) {
               k = i;
               break;
            }
        }
        System.out.printf("Слово с минимальным числом различающихся символов из последовательности %s - это %s", text, words[k]);
    }

}






