package retrydependents;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class RerunTestsInAClassWhenATestFailsTest {
    @Test
    public void testStep_1() {
        System.out.println("Test 1 starting.");
        System.out.println("Test 1 passed.");
    }

    @Test
    public void testStep_2() {
        System.out.println("Test 2 starting.");
        System.out.println("Test 2 passed.");
    }

    @Test
    public void testStep_3() {
        System.out.println("Test 3 starting.");
        System.out.println("Test 3 failed.");
        fail("Test 3 failed.");
    }
}
