package stremu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.lang.*;

public class StremU {
    public static void main(String[] args) {
        List<Log> logs = Arrays.asList(
                new Log("Сибирская сосна", 10),
                new Log("Дуб монгольский", 30),
                new Log("Берёза карликовая", 5));
        logs.forEach(x-> System.out.println(x.toString()));
        System.out.println();
        logs.stream().filter (x->x.getCount()>7).filter(x->!"Дуб монгольский".equalsIgnoreCase(x.getType())).map(x -> x.getType()).forEach(System.out::println);
        System.out.println();
        logs.stream().map(x -> x.getType()).flatMap(x -> Arrays.stream(x.split(" "))).forEach(System.out::println);
        /*logs.stream().map(x -> x.getType()).flatMap(x -> {
            String[] split = x.split (" ");
            return (Stream<String>) Arrays.asList(split).stream();
        }).forEach(System.out::println);*/



    }

    }

