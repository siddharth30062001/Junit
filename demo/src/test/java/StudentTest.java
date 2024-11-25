import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentTest {

    Student student;

    @BeforeEach
    public void setUp(){
        student=new Student();
        student.addStudent("amit");
        student.addStudent("sumit");
        student.addStudent("aman");
    }

    @Test
    public void count(){
    assertEquals(3, student.countStudent());
    }

    @Test
    public void remove() {
        assertEquals(true, student.removeStudent("amit"));
    }
    
    @Test
    public void removeAll(){
        assertEquals(0, student.removeAll());
    }
}
