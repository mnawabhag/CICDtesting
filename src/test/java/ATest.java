import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ATest {
    @Test
    void testGetName() {
        A a = new A();
        assertEquals("Automation", a.getName());
    }
}

