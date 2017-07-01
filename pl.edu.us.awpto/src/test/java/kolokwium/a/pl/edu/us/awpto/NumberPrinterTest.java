package kolokwium.a.pl.edu.us.awpto;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberPrinterTest
{
	@Test(expected = RuntimeException.class)
	 public void testExceptionIsThrown() {
		NumberPrinter num = new NumberPrinter(null,null);
		num.printNumbers(0);
	 }

	
	
}