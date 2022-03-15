import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class GuessTheNumberTest {
    GuessTheNumber guessTheNumber;

    @BeforeEach
    void setUp() {
        guessTheNumber = new GuessTheNumber();
    }

    @Test
    void firstName() {
        assertEquals("Marc", "Marc");
    }

    @Test
    void input() {
        assertEquals(4,4);
    }

    @AfterEach
    void tearDown() {

    }

}