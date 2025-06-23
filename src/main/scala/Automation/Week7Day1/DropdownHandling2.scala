package Automation.Week7Day1

import Automation.Week5Day3.HandlingDropDown.driver
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}
import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.support.ui.Select

object DropdownHandling2 extends App{

  val options = new ChromeOptions
  options.addArguments("--headless")

  val driver: WebDriver = new ChromeDriver(options)
  driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select")

  driver.switchTo().frame("iframeResult")

  val dropDown = driver.findElement(By.name("cars"))

  val select = new Select(dropDown)
  select.selectByVisibleText("Opel")

  select.selectByIndex(3)

  select.selectByValue("saab")

  driver.quit()

}
