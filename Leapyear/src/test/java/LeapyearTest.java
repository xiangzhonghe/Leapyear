import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class LeapyearTest {
    @Test
    void test2026IsNotLeapYear() {
        assertFalse(Leapyear.isLeapYear(2026));
    }
}