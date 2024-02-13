package SelFeaturesLatest.ChromeDevTools;

import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v114.fetch.Fetch;
import org.openqa.selenium.devtools.v114.fetch.model.RequestPattern;

public class NetworkMocking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// log file ->
		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		//Optional<Integer> int1 = Optional.empty();
		Optional<List<RequestPattern>> pattern = Optional.empty();
		Optional<Boolean> bool = Optional.empty();
		//Optional<String> str = Optional.empty();
		// Optional<List<HeaderEntry>> hd = Optional.empty();
		devtools.send(Fetch.enable(pattern, bool));
		devtools.addListener(Fetch.requestPaused(), request -> {
			if (request.getRequest().getUrl().contains("shetty")) {
				String newUrl = request.getRequest().getUrl().replace("=shetty", "=BadGuy");
				devtools.send(Fetch.continueRequest(request.getRequestId(), Optional.of(newUrl),

						Optional.of(request.getRequest().getMethod()), Optional.empty(), Optional.empty(),
						Optional.empty()));

			} else {
				devtools.send(Fetch.continueRequest(request.getRequestId(), Optional.of(request.getRequest().getUrl()),

						Optional.of(request.getRequest().getMethod()), Optional.empty(), Optional.empty(),
						Optional.empty()));

			}

		});
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector("button[routerlink*='library']")).click();
		System.out.println(driver.findElement(By.cssSelector("p")).getText());
	}

}
