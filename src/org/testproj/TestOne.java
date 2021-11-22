package org.testproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOne {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\Sele7pm\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
//		int a = 0;
		
//		WebElement textFace = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
//		String text = textFace.getText();
//		System.out.println(text);
//		
//		System.out.println("****************");
//		
		WebElement partialText = driver.findElement(By.xpath("//p[contains(text(),'We undertake ')]"));
		System.out.println(partialText.getText());
		
//		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
//		userName.sendKeys("anand");
//		
//		String attribute = userName.getAttribute("value");
//		System.out.println(attribute);
		
	}

}
