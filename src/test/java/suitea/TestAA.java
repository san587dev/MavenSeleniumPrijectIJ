package suitea;

import org.testng.annotations.Test;
import testbase.TestBase;

public class TestAA extends TestBase {
    @Test
    public void testAA() throws InterruptedException {
        log("Starting AA");
        softAssert.assertEquals("Text1","Text");
        softAssert.assertEquals("Title1", "Title");
        Thread.sleep(3000);
        log("Ending AA");
        softAssert.assertAll();
    }
}
