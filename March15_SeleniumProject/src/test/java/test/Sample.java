package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement pwd = driver.findElement(By.xpath("//input[@ng-model='Password']"));
		String type = pwd.getAttribute("type");
		if(type.equals("password"))
		{
			System.out.println("Password field");
		}else
		{
			System.out.println("text Field");
		}
		
		
	}
	

}