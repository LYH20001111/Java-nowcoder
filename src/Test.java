import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

public class Test {
    @Before
    public void beforeMethod(){
        System.out.println("Before .... ");
    }

    @After
    public void afterMethod(){
        System.out.println("After .... ");
    }

    @org.junit.Test
    public void methodTest(){
        int result = 1 + 2;
        Assert.assertEquals(2, result);
    }
}
