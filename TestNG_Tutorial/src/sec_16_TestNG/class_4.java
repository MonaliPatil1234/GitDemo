package sec_16_TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class class_4 {
	@Parameters({ "URL", "Username/APIKey" })
	@Test
	public void WebLoginAPI(String urlname, String key) {
		System.out.println("class 4 Web Login API method");
		System.out.println(urlname);
		System.out.println(key);
	}

	@Test
	public void mobileLoginAPI() {
		System.out.println("class 4 mobile Login API method");
	}

	@Test
	public void RESTAPI() {
		System.out.println("class 4 mobile REST API method");
		Assert.assertTrue(false);

	}

	@Test(groups = { "Regression" })
	public void MobileMtd1() {
		System.out.println("class 4 Mobile method 1");
	}

	@Test(dataProvider = "getData")
	public void MobileMtd2(String username, String password) {
		System.out.println("class 4 Mobile method 2");
		System.out.println(username);
		System.out.println(password);
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("THis will be executed at last of the suite");

	}

	@BeforeSuite
	public void beforesuite() {
		System.out.println("This will be executed at very first before any other test/class in the suite");

	}

	@BeforeMethod
	public void beforeevrymethod() {
		System.out.println("This will be executed before every test/method class 4");

	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("This will be executed before any test/method of class 4");

	}

	@AfterClass
	public void afterclass() {
		System.out.println("This will be executed after all the tests/methods of class 4");

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		// 1st row data set
		data[0][0] = "firstsetUsername";
		data[0][1] = "firstsetpassword";
		// 2nd row data set
		data[1][0] = "secondsetUsername";
		data[1][1] = "secondsetpassword";
		// 3rd row data set
		data[2][0] = "thirdsetUsername";
		data[2][1] = "thirdsetpassword";
		return data;
	}

}
