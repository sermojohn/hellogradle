package gr.iserm.java.gradle;

import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {

    @Test
    public void testRun() {
        System.out.println("Testing application.run()...");
        new Application().run();
        Assert.assertTrue(true);
    }
}
