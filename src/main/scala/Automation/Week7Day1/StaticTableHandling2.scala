package Automation.Week7Day1

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}

object StaticTableHandling2 extends App{

  val options = new ChromeOptions
  options.addArguments("--headless")

  val driver: WebDriver = new ChromeDriver(options)

  driver.get("https://www.w3schools.com/html/html_tables.asp")

  val rows = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[position()>1]"))

  for (i <- 0 until rows.size()){

    val cols = rows.get(i).findElements(By.tagName("td"))

    val rowText = cols.toArray.map(_.asInstanceOf[org.openqa.selenium.WebElement].getText).mkString(" | ")

    println("Row " + (i+1) + ": " + rowText)
  }

}
