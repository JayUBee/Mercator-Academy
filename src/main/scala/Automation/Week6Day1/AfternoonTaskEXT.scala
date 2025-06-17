package Automation.Week6Day1

import Automation.Week6Day1.ScreenCapture.driver
import org.openqa.selenium.{By, OutputType, WebDriver}
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}
import org.openqa.selenium.io.FileHandler

import java.io.File

object AfternoonTaskEXT extends App{

  val options = new ChromeOptions()
  options.addArguments("--headless")

  val driver: WebDriver = new ChromeDriver(options)
  driver.get("https://the-internet.herokuapp.com/tables")

  val table1 = driver.findElement(By.id("table1"))
  println("Table 1 located. \n")
  println("Sorting by amount due...")

  driver.findElement(By.xpath("//*[@id=\"table1\"]/thead/tr/th[4]")).click()
  val element = driver.findElement(By.id("table1")) // Locate the element by its name (update if needed)
  val srcElement: File = element.getScreenshotAs(OutputType.FILE)  // Capture only that element
  FileHandler.copy(srcElement, new File("/Users/tayyab.butt/Documents/screenshots/Table_Screenshots/Ascending_TableResult.png"))
  println("Table 1 in ascending order of amount due, captured.")

  driver.findElement(By.xpath("//*[@id=\"table1\"]/thead/tr/th[4]")).click()
  val element2 = driver.findElement(By.id("table1")) // Locate the element by its name (update if needed)
  val srcElement2: File = element2.getScreenshotAs(OutputType.FILE)  // Capture only that element
  FileHandler.copy(srcElement2, new File("/Users/tayyab.butt/Documents/screenshots/Table_Screenshots/Descending_TableResult.png"))
  println("Table 1 in descending order of amount due, captured.")

  driver.quit()
}
