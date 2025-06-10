package Automation.Week5Day2

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object BrowserMethods extends App {

  //Instantiating ChromeDriver for interacting with the Chrome Browser
  val driver: WebDriver = new ChromeDriver()

  //Accessing the web URL for testing
  driver.get("https://www.selenium.dev/selenium/web/web-form.html")

  driver.manage().window().maximize()

  driver.navigate().to("https://the-internet.herokuapp.com")

  driver.navigate().back()

  driver.navigate().forward()

  driver.navigate().refresh()

  driver.close()

  //driver.quit()

}
