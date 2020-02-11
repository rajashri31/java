import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringAvgTest {
    @Test
    public void testAvgWhole1(){
        String[] arr = {"one","five","nine"};
        StringAvg avgFun = new StringAvg();
        String avg = avgFun.FindAvg(arr);
        assertEquals("five", avg);
    }

    @Test
    public void testAvgWhole2(){
        String[] arr = {"zero","nine","two","five"};
        StringAvg avgFun = new StringAvg();
        String avg = avgFun.FindAvg(arr);
        assertEquals("four", avg);
    }

    @Test
    public void testAvgDecimal(){
        String[] arr = {"one","four"};
        StringAvg avgFun = new StringAvg();
        String avg = avgFun.FindAvg(arr);
        assertEquals("two", avg);
    }

    @Test
    public void testAvgZero(){
        String[] arr = {"zero","zero"};
        StringAvg avgFun = new StringAvg();
        String avg = avgFun.FindAvg(arr);
        assertEquals("zero", avg);
    }

    @Test
    public void testEmptyInput(){
        String[] arr = new String[0];
        StringAvg avgFun = new StringAvg();
        String avg = avgFun.FindAvg(arr);
        assertEquals("NA", avg);
    }

    @Test
    public void testGreaterThanNine(){
        String[] arr = {"eleven"};
        StringAvg avgFun = new StringAvg();
        String avg = avgFun.FindAvg(arr);
        assertEquals("NA", avg);
    }

}