package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\aaakhilproject\\julypractice\\Selenium\\DRiver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("9080802216");
		
		WebElement passwrd=driver.findElement(By.id("pass"));
		passwrd.sendKeys("myowngodshivan00");
		
		//WebElement log=driver.findElement(By.id("loginbutton"));
		////log.click();
		
		//xpath
		WebElement log=driver.findElement(By.xpath("//button[@name='login']"));
		log.click();
		
		//String s=driver.findElement(By.id("email")).getAttribute("name");
		//System.out.println(s);
		// String s=log.getText();
		 //System.out.println(s);
						
		
		driver.close();
		
		
	}

}
