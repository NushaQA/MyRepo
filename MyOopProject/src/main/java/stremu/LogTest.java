package stremu;
import lombok.extern.flogger.Flogger;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.stream.Stream;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import java.util.logging.Logger;



public class LogTest {
    private static Log log;
    private final static Logger LOGGER = Logger.getLogger(LogTest.class.getName());
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

    @ParameterizedTest()
    @MethodSource("stringIntAndListProvider")

    public void testToString (String type, int count, String expectedType){
        log = new Log (type, count);
        assertEquals(expectedType, log.toString());
     }

    static Stream<Arguments> stringIntAndListProvider(){
        return Stream.of(
                arguments ("Сибирская сосна", 10,"Сибирская сосна", 10),
                arguments("Дуб монгольский", 30,"Дуб монгольский", 30)
        );

    }

    @Test
    void abortedTest(){
        assumeTrue("abc".contains("Z"));
        fail ("test failed");
    }

    @Test
    @DisplayName("A failed  \uD83D\uDE09 test")
    void failingTest () {
        fail ("test failed");
    }

    @Test
    void timeoutExceeded() {
        // The following assertion fails with an error message similar to:
        // execution exceeded timeout of 10 ms by 91 ms
        assertTimeout(ofMillis(102), () -> {
            // Simulate task that takes more than 10 ms.
            List<Log> logs = Arrays.asList(
                    new Log("Сибирская сосна", 10),
                    new Log("Дуб монгольский", 30),
                    new Log("Берёза карликовая", 5),
            new Log("Сибирская сосна", 10),
                    new Log("Дуб монгольский", 30),
                    new Log("Берёза карликовая", 5),
            new Log("Сибирская сосна", 10),
                    new Log("Дуб монгольский", 30),
                    new Log("Берёза карликовая", 5));
            logs.forEach(x-> System.out.println(x.toString()));

            Thread.sleep(100);
        });
    }

    @Test
    @Disabled("Not implemented yet")
    void testShowSomething() {

    }

    @Test
    void lambdaExpressions() {
        assertTrue(Arrays.asList(1, 2, 3)
                .stream()
                .mapToInt(i -> i)
                .sum() > 5, () -> "Sum should be greater than 5");
    }

    @Test
    void groupAssertions() {
        int[] numbers = {0, 1, 2, 3, 4};
        assertAll("numbers",
                () -> assertEquals(numbers[0], 0),
                () -> assertEquals(numbers[3], 3),
                () -> assertEquals(numbers[4], 4)
        );
    }

        @AfterAll
    static void tearDownAll(){
            LOGGER.setLevel(Level.SEVERE);
            LOGGER.severe("Info Log");
            LOGGER.warning("Info Log");
            LOGGER.info("Info Log");
            LOGGER.finest("Really not important");
        //logger.log(Level.ALL,"@AfterAll - executed after all test methods.");
            //System.out.println("@AfterAll - executed after all test methods.");

    }

}
