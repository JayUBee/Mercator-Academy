package Automation.Week5Day1

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver, WebElement}

object CssSelector extends App{

  //Instantiating ChromeDriver for interacting with the Chrome Browser
  val driver: WebDriver = new ChromeDriver()

  //Accessing the web URL for testing
  driver.get("https://proleed.academy/exercises/selenium/selenium-element-id-locators-practice-form.php")

  val emailAddress: WebElement = driver.findElement(By.xpath("//*[@id = \"email\"]"))
  emailAddress.sendKeys("customer@test.com")
  println("Email Address entered - Passed")

  val password: WebElement = driver.findElement(By.cssSelector("body > main > div > form > div > div:nth-child(1) > label:nth-child(2) > input"))
  password.sendKeys("TestPassword123")
  println("Password entered - Passed")



 // driver.quit()

}
