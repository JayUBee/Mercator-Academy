package Automation.Week5Day4

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, JavascriptExecutor, WebDriver}


object AfternoonTasks extends App{

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://cosmocode.io/automation-practice-webtable/")

  val js = driver.asInstanceOf[JavascriptExecutor]

  val countries = driver.findElement(By.id("countries"))

  val rows = driver.findElements(By.tagName("tr"))



  for (i <- 1 until rows.size) {
    val cell = rows.get(i).findElements(By.tagName("td"))
    println(cell.get(1).getText)
    js.executeScript("arguments[0].style.backgroundColor = 'pink'", rows.get(i))
  }





  driver.quit()
}
