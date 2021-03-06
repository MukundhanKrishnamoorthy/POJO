package com.testng.PojoDemo;

import org.openqa.selenium.WebDriver;

public class Pojo {
	
	// VARIABLE DECLARATIONS
	private WebDriver driver;
	private String Chromepath;
	private String Firefoxpath;
	private String Edgepath;

	
	// GETTERS AND SETTERS METHOD DECLARATIONS
	
	// WEBDRIVER GETTER & SETTER
	public WebDriver getDriver() {
		return driver;
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	// CHROMEPATH GETTER & SETTER
	public String getChromepath() {
		return Chromepath;
	}

	public void setChromepath(String chromepath) {
		Chromepath = chromepath;
	}

	// FIREFOX GETTER & SETTER
	public String getFirefoxpath() {
		return Firefoxpath;
	}

	public void setFirefoxpath(String firefoxpath) {
		Firefoxpath = firefoxpath;
	}

	// EDGEPATH GETTER & SETTER
	public String getEdgepath() {
		return Edgepath;
	}

	public void setEdgepath(String edgepath) {
		Edgepath = edgepath;
	}
	
	public Pojo() {
		// Pojo Construtor
	}
}
