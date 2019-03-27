package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	
	
@Test
public static void test112() {
	System.setProperty("webdriver.chrome.driver", "D:\\Jars\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver(); 
	driver.get("https://google.com");
	
	
}

}
