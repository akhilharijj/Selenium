package com.Selenium;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimensdemo {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\aaakhilproject\\julypractice\\Selenium\\DRiver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//dimension
		Dimension d=new Dimension(500, 500);
		driver.manage().window().setSize(d);
		
		
		//point
		Point p=new Point(200, 250);
		driver.manage().window().setPosition(p);
		//get
		driver.get("https://www.facebook.com/login/");
		//get title
		String title=driver.getTitle();
		System.out.println("get title:"+title);
		
		//get curnt url
		String curnturl=driver.getCurrentUrl();
		System.out.println("get crnt url:"+curnturl);
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("9080802216");
		
		WebElement passwrd=driver.findElement(By.id("pass"));
		passwrd.sendKeys("myowngodshivan00");
		
		
		WebElement log=driver.findElement(By.xpath("//button[@name='login']"));
		log.click();
		
		//Take screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\aaakhilproject\\julypractice\\Selenium\\Screenshot\\pp1.png");
		FileUtils.copyFile(src, des);

}
}
