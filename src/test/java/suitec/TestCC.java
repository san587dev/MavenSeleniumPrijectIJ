package suitec;

import org.testng.Assert;
import org.testng.annotations.Test;
import testbase.TestBase;

public class TestCC extends TestBase {

    @Test
    public void testCC() throws InterruptedException {
        log("Starting CC");
        Thread.sleep(3000);
        log("Ending CC");
        //Assert.fail("Some Error");
    }
}
