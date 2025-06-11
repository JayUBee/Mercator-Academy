package Automation.Week5Day3

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object HandlingTextBox extends App{

  //Instantiating ChromeDriver for interacting with the Chrome Browser
  val driver: WebDriver = new ChromeDriver()

  //Accessing the web URL for testing
  driver.get("https://www.selenium.dev/selenium/web/web-form.html")

  val textInput: WebElement = driver.findElement(By.id("my-text-id"))
  textInput.sendKeys("Welcome to Mercator.")

  val attribute = textInput.getAttribute("value")
  println("The value has been entered: " + attribute)

  textInput.clear()
  println("The value has been cleared.")

  driver.quit()
}
