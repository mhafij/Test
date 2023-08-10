package Base;

import java.time.Duration;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import java.util.Collections;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class base {
	public static WebDriver driver;
	public static void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		options.setExperimentalOption("useAutomationExtension", false);
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.setPageLoadTimeout(Duration.ofSeconds(80));
		options.setScriptTimeout(Duration.ofSeconds(80));
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
	}
	
//	public static void navigateTo(String url) {
//		driver.get(url);
//	}

}
