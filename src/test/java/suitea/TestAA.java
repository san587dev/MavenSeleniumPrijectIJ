package suitea;

import org.testng.annotations.Test;

public class TestAA {
    @Test
    public void testAA() throws InterruptedException {
        System.out.println("Starting AA");
        Thread.sleep(3000);
        System.out.println("Ending AA");
    }
}
