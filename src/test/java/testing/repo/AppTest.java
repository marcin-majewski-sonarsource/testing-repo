/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package testing.repo;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test
    public void testForSonarqube(){
        App app = new App();
        assertEquals("Hello `world1.", app.getGreeting());
    }

}
