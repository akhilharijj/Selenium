package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framedemo {
	public static void main(String[] args) throws Throwable{
		 System.setProperty("webdriver.chrome.driver", "C:\\aaakhilproject\\julypractice\\Selenium\\DRiver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://www.leafground.com/pages/frame.html");
		 driver.manage().window().maximize();
		 
		 driver.switchTo().frame(0);
		 
		 WebElement ah=driver.findElement(By.id("Click"));
		 Thread.sleep(200);
		 
		 ah.click();
		 
		String s1= driver.findElement(By.id("Click")).getText();
		 System.out.println(s1);
		 
		driver.switchTo().defaultContent();
		 driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		 WebElement ha=driver.findElement(By.id("Click1"));
		 ha.click()	;	
		 Thread.sleep(200);
		 
		 String s2= driver.findElement(By.id("Click1")).getText();
		 System.out.println(s2);
		 
		
		 

}}
