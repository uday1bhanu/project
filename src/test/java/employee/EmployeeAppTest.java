package employee;

import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeAppTest {
    @Test public void testEmployeeAppHasAGreeting() {
        EmployeeApp classUnderTest = new EmployeeApp();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}