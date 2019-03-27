package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Jars\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver(); 
	driver.get("https://google.com");
	
	
}

}
