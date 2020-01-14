package test.com.sergo.edf;

import com.sergo.edf.AppStarter;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class AppStarterTest {
    @Test
    public void testAppHasAGreeting() {
        AppStarter classUnderTest = new AppStarter();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
