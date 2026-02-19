import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    @Test
    void testStudentGettersAndSetters() {
        Student student = new Student("John", 90, 2);
        assertEquals("John", student.getName());
        assertEquals(90, student.getMarks());
        assertEquals(2, student.getCount());

        student.setName("Jane");
        student.setMarks(95);
        student.setCount(3);
        assertEquals("Jane", student.getName());
        assertEquals(95, student.getMarks());
        assertEquals(3, student.getCount());
    }
}

