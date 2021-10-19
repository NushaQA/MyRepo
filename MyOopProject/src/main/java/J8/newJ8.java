package J8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class newJ8 {

      public static void main(String[] args) {
          long count = Arrays.asList(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).stream().filter(w -> w > 0).count();
          System.out.println(count);

        List<Integer> list1 = Arrays.asList(10, 15, 16); //Integer i = new Integer (10); List.of (i,15,16);
        list1.set(1,11);
        list1.forEach(System.out::println);
        Integer i = 4; //boxing
        int a = i; //unboxing
          Integer.toString(10); //casting int to String
        System.out.println(a);
          System.out.println(i);

        /*ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach((System.out::println));
        numbers.forEach (n-> {
            System.out.println(n);*/

    }

}
