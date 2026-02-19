import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingletonExecutionTest {
    @Test
    void testSingletonInstance() {
        SingletonExecution instance1 = SingletonExecution.getInstance();
        SingletonExecution instance2 = SingletonExecution.getInstance();
        assertNotNull(instance1);
        assertSame(instance1, instance2);
    }
}

