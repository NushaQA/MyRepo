package stremu;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class Log {
    private String type;
    private int count;

    public Log (String type, int count){
        setType(type);
        setCount(count);
    }
@Override
    public String toString (){
        return getType();
}

   /* List<Log> logs = Arrays.asList(
            new Log("Сибирская сосна", 10),
            new Log("Дуб монгольский", 30),
            new Log("Берёза карликовая", 5));
logs.forEach(x-> System.out.println(x.toString()));
        System.out.println();
        logs.stream().filter (x->x.getCount()>7).filter(x->!"Дуб монгольский".equalsIgnoreCase(x.getType())).map(x -> x.getType()).forEach(System.out::println);
        System.out.println();
        logs.stream().map(x -> x.getType()).flatMap(x -> Arrays.stream(x.split(" "))).forEach(System.out::println);*/


}
