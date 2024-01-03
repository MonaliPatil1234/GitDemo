package sec_16_TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class class_3 {
	@Test
	public void WebLogin() {
		System.out.println("class 3 Web Login method");
	}

	@Test(groups = { "Regression" })
	public void mobileLogin() {
		System.out.println("class 3 mobile Login");
	}

	@Test
	@Parameters({ "URL" })
	public void MobileMtd1(String urlname) {
		System.out.println("class 3 Mobile method 1");
		System.out.println(urlname);
	}

	@Test
	public void MobileMtd2() {
		System.out.println("class 3 Mobile method 2");
	}

}
