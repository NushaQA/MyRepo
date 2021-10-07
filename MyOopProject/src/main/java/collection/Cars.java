package collection;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Cars {

    private String carSegment; // A-segment minini cars; B-segment small cars; C-segment medium cars etc
    private String carMark; //Renault Twizy; Ford Fiesta; Audi A3;

    public Cars (String carSegment,String carMark) {
        setCarSegment(carSegment);
        setCarMark(carMark);
    }

    @Override
    public String toString() {
        return "Car_classification: " +
                "carSegment=" + carSegment +
                ", carMark=" + carMark;
    }
}
