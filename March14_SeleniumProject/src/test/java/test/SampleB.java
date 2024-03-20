package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleB {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		if(url.equals("https://demo.automationtesting.in/Register.html"))
		{
			System.out.println("Url field");
		}else
		{
			System.out.println("not url Field");
		}
		
		
	}
	

}