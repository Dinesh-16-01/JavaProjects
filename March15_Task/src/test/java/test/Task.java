package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Task {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@data-action='sign in']")).click();
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		driver.findElement(By.xpath("//span[text()='For my personal use']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Dinesh");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("DK");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Select dropDownMonth = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		dropDownMonth.selectByValue("1");
		driver.findElement(By.xpath("//input[@id='day']")).sendKeys("01");
		}
}



