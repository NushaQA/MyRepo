package stremu;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;


public class LogTest {
    private static Log log;

  /*  @BeforeAll
    public static void setUp(){
        log = new Log ("Береза", 12);
    }

    @Test
    public  void testGetter(){
        assertEquals("Береза", log.getType());
        assertEquals(12, log.getCount());
    }*/

    @ParameterizedTest()
    @MethodSource("stringIntAndListProvider")

    public  void testGetter(String type, int count, String expectedType, int expectedCount){
        log = new Log (type, count);
        assertEquals(expectedType, log.getType());
        assertEquals (expectedCount, log.getCount());
    }

    static Stream<Arguments> stringIntAndListProvider(){
        return Stream.of(
                arguments ("Сибирская сосна", 10,"Сибирская сосна", 10),
                arguments("Дуб монгольский", 30,"Дуб монгольский", 30)
        );

    }

}
