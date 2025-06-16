package Automation.Week4Day4

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver, WebElement}

object MorningTask extends App{

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://www.selenium.dev/selenium/web/web-form.html")

  val textInput: WebElement = driver.findElement(By.id("my-text-id"))
  textInput.sendKeys("Tayyab")

  val password: WebElement = driver.findElement(By.name("my-password"))
  password.sendKeys("12345!")

  val textArea:WebElement = driver.findElement(By.name("my-textarea"))
  textArea.sendKeys("This is a test comment.")

  driver.quit()
}
