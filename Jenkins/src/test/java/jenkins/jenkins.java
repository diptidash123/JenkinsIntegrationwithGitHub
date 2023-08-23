package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class jenkins {

	//public static void main(String[] args) {
	@Test
	public void main()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		System.out.println("Title: "+" "+driver.getTitle());
		System.out.println("url:"+" "+driver.getCurrentUrl());
		driver.navigate().to("https://www.amazon.in");
		driver.close();

	}

}
