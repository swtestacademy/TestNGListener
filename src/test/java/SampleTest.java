import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


/**
 * Created by ONUR on 11.12.2016.
 */
public class SampleTest extends BaseTest{

    //@Test(retryAnalyzer = Retry.class)
    @Test
    public void test1() {
        //Fail Scenario
        assertEquals(2+2,5,"Addition Problem! 2+2 must be 4!\n");
    }

    //@Test(retryAnalyzer = Retry.class)
    @Test
    public void test2() {
        //Fail Scenario
        assertEquals(2+2,7,"Addition Problem! 2+2 must be 4!\n");
    }

/*    @Test
    public void test1() {
        System.out.println("I am in test1 test method and it will pass.");
    }

    @Test(expectedExceptions=RuntimeException.class)
    public void test2() {
        System.out.println("I am in test2 test method and it will fail.");
    }

    @Test
    public void test3() {
        throw new SkipException("Skipping the test3 test method!");
    }

    private int i=0;
    @Test(successPercentage=60, invocationCount=5)
    public void test4() {
        i++;
        System.out.println("test4 test method, invocation count: " + i);
        if (i == 1 || i == 2) {
            System.out.println("test4 failed!");
            Assert.assertEquals(i, 8);
        }
    }*/

}
