package Automation.Week5Day3

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object HandlingButtonAndLinks extends App {

  //Instantiating ChromeDriver for interacting with the Chrome Browser
  val driver: WebDriver = new ChromeDriver()

  //Accessing the web URL for testing
  driver.get("https://www.selenium.dev/selenium/web/web-form.html")

  driver.manage().window().maximize()

  val button: WebElement = driver.findElement(By.cssSelector("[type = \"submit\"]"))

  if(button.isEnabled){
    println("Button text: " + button.getText)
    button.click()
    println("Button is enabled and clicked.")
  }
  else {
    println("Button is not enabled")
  }

  //Handling HyperLinks

  driver.get("https://www.selenium.dev/")

  val myLink = driver.findElement(By.linkText("Documentation"))

  val myLinkURL = myLink.getAttribute("href")

  println("Link href: " + myLinkURL)



  driver.quit()
}
