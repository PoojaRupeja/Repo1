package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoClass {
	int a=100, b=29;

	@Test
	
	public void add()
	{
		System.out.println("Addition");
		Assert.assertEquals(129, a+b);
	}
	@Test
	public void subt()
	{
		System.out.println("Subtraction");
		Assert.assertEquals(71, a-b);
	}

}
