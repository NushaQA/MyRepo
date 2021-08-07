package test2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Test2Class {
    public static void main(String[] args) {
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
