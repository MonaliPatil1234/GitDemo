package sec_16_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class class_2 {
	@AfterMethod
	public void afterevrymethod() {
		System.out.println("This will be executed after every test/method of class 2");

	}

	@Test(groups = { "Regression" })
	public void personalLoanHome() {
		System.out.println("class 2 personal Home Loan method");
	}

	@Test(dependsOnMethods = { "MobileMtd1" })
	public void personalLoanCash() {
		System.out.println("class 2 personal Loan Cash method");
	}

	@Test(timeOut = 4000)
	public void MobileMtd1() {
		System.out.println("class 2 Mobile method 1");
	}

	@Test(enabled = false)
	public void MobileMtd2() {
		System.out.println("class 2 Mobile method 2");
	}

}
