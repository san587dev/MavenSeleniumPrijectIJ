package suiteb;

import org.testng.annotations.Test;
import testbase.TestBase;

public class TestBB extends TestBase {

    @Test
    public void testBB() throws InterruptedException {
        log("Starting BB");
        Thread.sleep(3000);
        log("Ending BB");
    }

}
