package com.devskiller.selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.WebDriver;



public class SeleniumExecutor {

  private final WebDriver driver;

  public SeleniumExecutor(WebDriver driver) {
    
 
    this.driver = driver;
  }

  public String extractHeader(String xpath) {
	  WebElement webElement = driver.findElement(By.xpath("//*[contains(@class, 'container')]/h1"));
	  String headerText= webElement.getText();
	  return headerText;
  }

  public String clickTheButtonAndExtractLink() {
	  driver.findElement(By.xpath("//*[contains(@class, 'container')]/button")).click();
	  WebElement webElement = driver.findElement(By.xpath( "//*[contains(@class, 'container')]/a"));
	  String extractedUrl = webElement.getAttribute("href");
	  return extractedUrl;
  }

  public String extractHeader() {
	  WebElement webElement = driver.findElement(By.xpath("//*[contains(@class, 'container')]/h1"));
	  String headerText= webElement.getText();
	  return headerText;
  }
  

	  


}

