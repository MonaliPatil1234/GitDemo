package sec_16_TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class_1 {
	@AfterTest
	public void executeLast() {
		System.out.println("This will be executed at last of the TEST in which this class 1 is mentioned");
		System.out.println("Added this new line for git understanding purpose");
		System.out.println("Same with this one");
		
	}

	@Test(groups = { "Regression" })

	// IF YOU USE EXCLUDE INSTEAD OF INCLUDE IN TESTNG3.XML FILE, ALL TESTS WILL BE
	// EXECUTED EXCEPT THE ONES //MENTIONED AS REGRESSION

	public void personalLoanCar() {
		System.out.println("class 1 personal Loan method");
		Assert.assertTrue(false);
	}

	@Test
	public void demo1() {
		System.out.println("class 1 demo1 method");
	}

	@Test
	public void MobileMtd1() {
		System.out.println("class 1 Mobile method 1");
	}

	@Test
	public void MobileMtd2() {
		System.out.println("class 1 Mobile method 2");
	}

	@BeforeTest
	public void prerequisite() {
		System.out.println("This will be executed first before the test in which this class 1is mentioned");
	}

}
