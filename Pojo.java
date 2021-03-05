package com.testng.PojoDemo;

import org.openqa.selenium.WebDriver;

public class Pojo {

	private WebDriver driver;
	private String filePath; 

	public WebDriver getDriver() {
		return driver;
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getFilePath() {
		return filePath;
	}
	
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	public Pojo() {
		// Pojo Construtor
	}
}
