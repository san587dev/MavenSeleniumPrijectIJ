package suiteb;

import org.testng.annotations.Test;
import testbase.TestBase;

public class TestB extends TestBase {

    @Test
    public void testB() throws InterruptedException {
        log("Starting B");
        Thread.sleep(3000);
        log("Ending B");
    }
}
