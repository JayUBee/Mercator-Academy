package Automation.Week7Day2

import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver

object TryCatchFinally extends App{

  val driver: WebDriver = new ChromeDriver()

  try {
    driver.get("https://demoqa.com/automation-practice-form")

    val element = driver.findElement(By.id("NonExistentElement"))
    element.click()
  } catch {
    case e: NoSuchElementException =>
      println("Caught NoSuchElementException: " + e.getMessage)
  }

  try {
    val arr = Array(1, 2, 3)
    println(arr(5))
  } catch {
    case e: NoSuchElementException =>
      println("Caught NoSuchElementException: Element not found - " + e.getMessage)
    case e: ArrayIndexOutOfBoundsException =>
      println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage)
  } finally {
    println("Closing browser...")
    driver.quit()
  }
}
