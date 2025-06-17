package Automation.Week6Day1

import org.openqa.selenium.{By, NoSuchElementException, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}

import java.time.Duration

object ExceptionHandling extends App{

  val driver: WebDriver = new ChromeDriver()

  try {
    driver.get("https://the-internet.herokuapp.com/dynamic_loading/1")
    val explicitWait = new WebDriverWait(driver, Duration.ofSeconds(3))
    explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")))
  }
  catch {
    case e :  NoSuchElementException => println("Element not found! ")
    e.printStackTrace()
    case e : Exception => println("Print any exception. \n" + e.getMessage)
    e.printStackTrace()
  }
  finally {
    if (driver != null){
      driver.quit()
    }
  }

  driver.quit()

}
