import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BTest {
    @Test
    void testGetAName() {
        B b = new B();
        assertEquals("Automation", b.getAName());
    }
}

