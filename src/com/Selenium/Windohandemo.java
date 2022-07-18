package com.Selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windohandemo {
	public static void main(String[] args) throws Throwable{
		 System.setProperty("webdriver.chrome.driver", "C:\\aaakhilproject\\julypractice\\Selenium\\DRiver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://www.leafground.com/");
		 driver.manage().window().maximize();
		 
		 //window handling
		 
		 WebElement e=driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[1]"));
		 e.click();
		 
		 Actions a=new Actions(driver);
		 //1st window
		 
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_PAGE_DOWN);
		 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 driver.navigate().back();
		 
		 
		 //2nd window
		 Thread.sleep(200);
		 WebElement e1=driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[2]"));
		 e1.click();
		 Thread.sleep(200);
		 
		 r.keyPress(KeyEvent.VK_PAGE_DOWN);
		 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 Thread.sleep(200);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 driver.navigate().back();
		
		 //3rd window
		 Thread.sleep(200);
		 WebElement e2=driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[3]"));
		 a.contextClick(e2).build().perform();
		 Thread.sleep(200);
		 r.keyPress(KeyEvent.VK_PAGE_DOWN);
		 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 driver.navigate().back();
		 
		 
		 //get window handle
		 
		 String m=driver.getWindowHandle();
		 System.out.println(m);
		 System.out.println("********");
		 
		
		 
		 //Size
		 int size=driver.getWindowHandles().size();
		 System.out.println("size of window handles:"+size);
		 
		 
		 //get window handles
		 //get window handles
		 Set<String> m1=driver.getWindowHandles();
		 System.out.println(m1);
		 
		 //get the curnt url
		 List<String> l=new ArrayList<String>(m1);
		 driver.switchTo().window(l.get(1));
		 System.out.println(driver.getCurrentUrl());
		 
		 driver.switchTo().window(l.get(0));
		
		 
		 //close
		 driver.close();
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

}}
