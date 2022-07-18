package com.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo {
	public static void main(String[] args) throws Throwable{
		 System.setProperty("webdriver.chrome.driver", "C:\\aaakhilproject\\julypractice\\Selenium\\DRiver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://www.leafground.com/pages/Alert.html");
		 driver.manage().window().maximize();
		 
		 WebElement aler=driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		  aler.click();
		  Thread.sleep(100);
		  
		  Alert a=driver.switchTo().alert(); //for ok
		  Thread.sleep(100);
		  a.accept();
		  
		  WebElement a2=driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		  a2.click();
		  Alert ak=driver.switchTo().alert();
		  Thread.sleep(100);
		  ak.dismiss(); //for cancel
		  
		  WebElement a3= driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		  a3.click();
		  
		  Alert a4=driver.switchTo().alert();
		  a4.sendKeys("akhil");  //for text alert
		  Thread.sleep(100);
		  a4.accept();
		  
		  
		  
		  

}}
