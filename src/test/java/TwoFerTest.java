import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class TwoFerTest {
    @Test
    public void testFizz(){
        TwoFer twofer = new TwoFer();
        String output = twofer.FizzBuzz(9);
        assertEquals("Fizz", output);
    }

    @Test
    public void testBuzz(){
        TwoFer twofer = new TwoFer();
        String output = twofer.FizzBuzz(10);
        assertEquals("Buzz", output);
    }

    @Test
    public void testFizzBuzz(){
        TwoFer twofer = new TwoFer();
        String output = twofer.FizzBuzz(15);
        assertEquals("FizzBuzz", output);
    }

    @Test
    public void testPass(){
        TwoFer twofer = new TwoFer();
        String output = twofer.FizzBuzz(17);
        assertEquals("17", output);
    }

}