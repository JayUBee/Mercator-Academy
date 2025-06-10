package Automation.Week5Day2.AfternoonTasks

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

object Task1 extends App {

  println("Task 1: ")

  val driver: WebDriver = new ChromeDriver()
  driver.get("https://google.com")
  println("Browser Launched!")
  driver.navigate().to("https://demoqa.com/browser-windows")
  println("Navigated to Test URL!")

  println("Page title: " + driver.getTitle)
  println("Current URL: " + driver.getCurrentUrl)

  driver.close()
  println("Current window closed.")
  driver.quit()
  println("Session ended.")


}
