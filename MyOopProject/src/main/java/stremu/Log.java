package stremu;

import lombok.Getter;
import lombok.Setter;

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

}
