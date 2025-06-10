package Automation.Week5Day2.AfternoonTasks

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

object Task2 extends App{

  println("Task 2: ")

  val driver: WebDriver = new ChromeDriver()

  println("1-")
  driver.get("https://google.com")
  println("Browser Launched! \n")

  println("2-")
  driver.navigate().to("https://demoqa.com/automation-practice-form")
  println("Navigated to Test URL! \n")

  println("3-")
  driver.navigate().to("https://example.com")
  println("Navigated to example.com")

  driver.navigate().back()
  println("Navigated Back!")

  driver.navigate().forward()
  println("Navigated forward!")

  driver.navigate().refresh()
  println("Refreshed current page! \n")

  println("4-")
  driver.manage().window().maximize()
  println("Window maximized.")

  driver.manage().window().minimize()
  println("Window minimized. \n")

  println("5-")
  println("Page source up to 500 characters: \n" + driver.getPageSource.take(500))
  //val src = driver.getPageSource
  //println(src)

  driver.close()
  println("Current window closed.")
  driver.quit()
  println("Session ended.")
}
