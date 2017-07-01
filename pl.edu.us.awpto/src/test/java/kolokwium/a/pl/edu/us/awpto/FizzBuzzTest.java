package kolokwium.a.pl.edu.us.awpto;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class FizzBuzzTest
{	
	 private int fInput;
	 private String fExpected;	 
	    
	 public FizzBuzzTest(int input, String expected) {
		 fInput= input;
	     fExpected= expected;
	 }
	 @Parameters
	 public static Collection<Object[]> data() {
	 Object[][] data = new Object[][] { { 2, "2" }, { 3, "Fizz" },{5,"Buzz" },{15, "FizzBuzz"} };
	 return Arrays.asList(data);
	 }
	 @Test
	 public void test() {
		 FizzBuzz buz = new FizzBuzz();
		 assertEquals(fExpected, buz.calculate(fInput));

	 }
	
	
	
}