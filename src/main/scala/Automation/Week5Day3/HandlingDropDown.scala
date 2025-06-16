package Automation.Week5Day3

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.{By, WebDriver}

object HandlingDropDown extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select")

  driver.switchTo().frame("iframeResult")

  val dropDown = driver.findElement(By.name("cars"))

  val select = new Select(dropDown)

  select.selectByVisibleText("Opel")
  println("Selected by visible text: " + select.getFirstSelectedOption.getText)

  select.selectByValue("volvo")
  println("Select by Value: " + select.getFirstSelectedOption.getText)

  select.selectByIndex(3)
  println("Select by index: " + select.getFirstSelectedOption.getText)

  driver.quit()

}
