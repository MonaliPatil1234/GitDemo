package SelFeaturesLatest.ChromeDevTools;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v114.fetch.Fetch;
import org.openqa.selenium.devtools.v114.fetch.model.RequestPattern;
import org.openqa.selenium.devtools.v114.network.model.ErrorReason;

public class NetworkFailedReq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// log file ->
		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		Optional<List<RequestPattern>> pattern = Optional
				.of(Arrays.asList(new RequestPattern(Optional.of("*GetBook*"), Optional.empty(), Optional.empty())));

		devtools.send(Fetch.enable(pattern, Optional.empty()));
		devtools.addListener(Fetch.requestPaused(), request -> {
			devtools.send(Fetch.failRequest(request.getRequestId(), ErrorReason.FAILED));
		}

		);
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector("button[routerlink*='library']")).click();

	}

}
