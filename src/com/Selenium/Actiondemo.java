package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiondemo {
	public static void main(String[] args) throws Throwable{
		 System.setProperty("webdriver.chrome.driver", "C:\\aaakhilproject\\julypractice\\Selenium\\DRiver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		// driver.get("https://www.selenium.dev/downloads/");
		 driver.get("http://www.leafground.com/pages/drop.html");
		 driver.manage().window().maximize();
		 
		//WebElement r=driver.findElement(By.xpath("//a[@href='https://github.com/SeleniumHQ/selenium/releases/download/selenium-4.2.0/IEDriverServer_Win32_4.2.0.zip']"));
		
		 WebElement r=driver.findElement(By.id("draggable"));
		 WebElement r1=driver.findElement(By.id("droppable"));
		Actions a= new Actions (driver);
		//a.click(r).build().perform();
		Thread.sleep(200);
		a.dragAndDrop(r, r1).build().perform();
		//a.clickAndHold(r).moveToElement(r1).release(r1).build().perform();

}}

