package demo;

import org.testng.annotations.Test;

public class Day2 {
	@Test
	public void test4()
	{
		System.out.println("test 4");
	}
	@Test
	public void test5()
	{
		System.out.println("test 5");
	}
	@Test(priority=0)
	public void test6()
	{
		System.out.println("test 6");
	}

}
