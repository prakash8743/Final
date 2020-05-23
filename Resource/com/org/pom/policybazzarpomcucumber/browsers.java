package com.org.pom.policybazzarpomcucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browsers 
{
public static WebDriver driver;
public static WebDriver driving(String d)
{
if(d.equalsIgnoreCase("chrome"))
{
System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Selenium\\Driver\\chromedriver.exe");
driver=new ChromeDriver();	
}
if(d.equalsIgnoreCase("firefox"))
{
System.setProperty("webdriver.gecko.driver","E:\\Selenium\\Selenium\\Driver\\geckodriver.exe");
driver=new FirefoxDriver();	
}
else
{
System.out.println("No Browser Present");	
}
driver.get("https://www.policybazaar.com/");
return driver;
}
public void text(WebElement txt,String msg)
{
txt.sendKeys(msg);	
}
}
