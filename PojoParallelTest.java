/*
 * package com.testng.PojoDemo;
 * 
 * import java.io.File; import java.io.IOException; import java.util.Iterator;
 * import java.util.Set; import org.apache.commons.io.FileUtils; import
 * org.openqa.selenium.By; import org.openqa.selenium.OutputType; import
 * org.openqa.selenium.TakesScreenshot; import org.openqa.selenium.WebDriver;
 * import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.edge.EdgeDriver; import
 * org.openqa.selenium.firefox.FirefoxDriver; import
 * org.testng.annotations.BeforeMethod; import
 * org.testng.annotations.Parameters;
 * 
 * 
 * public class PojoParallelTest {
 * 
 * @Parameters("browser")
 * 
 * @BeforeMethod public void setUp(WebDriver driver, String browser) {
 * 
 * if(browser.equalsIgnoreCase("chrome")) {
 * System.out.println("Inside ChromeTest Method");
 * System.setProperty("webdriver.chrome.driver",
 * "D:\\Drivers\\chromedriver.exe"); driver = new ChromeDriver(); }
 * 
 * else if(browser.equalsIgnoreCase("firefox")) {
 * System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
 * System.out.println("Inside FireFoxTest Method"); driver = new
 * FirefoxDriver(); }
 * 
 * else if(browser.equalsIgnoreCase("edge")) {
 * System.setProperty("webdriver.edge.driver", "D:\\Drivers\\msedgedriver.exe");
 * System.out.println("Inside Edge Method"); driver = new EdgeDriver(); } }
 * 
 * public void amazon(WebDriver driver) throws IOException, InterruptedException
 * { // Navigating to Amazon Website driver.get("https://www.flipkart.com/");
 * driver.manage().window().maximize();
 * 
 * // Entering the input search text WebElement searchInputBar =
 * driver.findElement(By.xpath("//input[@name='q' and @type='text']"));
 * searchInputBar.sendKeys("iPhone 12");
 * 
 * // Searching the input text using search icon WebElement searchIcon =
 * driver.findElement(By.xpath("//button[@class='L0Z3Pu' and @type='submit']"));
 * searchIcon.click();
 * 
 * // Selecting the first result of iPhone 12 WebElement result =
 * driver.findElement(By.linkText("ADD TO CART")); result.click();
 * 
 * // Switching to result window String parentHandle = driver.getWindowHandle();
 * Set<String> allHandles = driver.getWindowHandles();
 * 
 * Iterator<String> itr = allHandles.iterator(); while (itr.hasNext()) { String
 * nextWindow = itr.next();
 * 
 * if (!parentHandle.equals(nextWindow)) { driver.switchTo().window(nextWindow);
 * 
 * WebElement cartButton =
 * driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
 * cartButton.click();
 * 
 * 
 * WebElement closePopUp =
 * driver.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']"));
 * closePopUp.click();
 * 
 * 
 * Thread.sleep(3000);
 * 
 * // Taking screenshot TakesScreenshot pic = ((TakesScreenshot) driver); File
 * scrshot = pic.getScreenshotAs(OutputType.FILE); File destFile = new
 * File("D:\\Flipkart_POJO.png"); FileUtils.copyFile(scrshot, destFile); } } } }
 */