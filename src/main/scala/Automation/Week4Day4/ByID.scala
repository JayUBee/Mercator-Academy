package Automation.Week4Day4

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver, WebElement}

object ByID extends App{

  //Instantiating ChromeDriver for interacting with the Chrome Browser
  val driver: WebDriver = new ChromeDriver()

  //Accessing the web URL for testing
  driver.get("https://proleed.academy/exercises/selenium/selenium-element-id-locators-practice-form.php")

  val emailAddress: WebElement = driver.findElement(By.id("email"))
  emailAddress.sendKeys("customer@test.com")
  println("Email Address entered - Passed")

  val password: WebElement = driver.findElement(By.id("password"))
  password.sendKeys("TestPassword123")
  println("Password entered - Passed")

  driver.quit()

}
