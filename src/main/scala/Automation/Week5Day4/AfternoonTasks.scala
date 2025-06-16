package Automation.Week5Day4

import Automation.Week5Day4.explicitWait.driver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import org.openqa.selenium.{By, JavascriptExecutor, WebDriver}

import java.time.Duration


object AfternoonTasks extends App{

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://cosmocode.io/automation-practice-webtable/")

  val js = driver.asInstanceOf[JavascriptExecutor]

  val countries = driver.findElement(By.id("countries"))

  val rows = driver.findElements(By.tagName("tr"))

  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))
  println("Implicitly waited 10 seconds.")

  val explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10))


  for (i <- 1 until rows.size) {
    val cell = rows.get(i).findElements(By.tagName("td"))
    println(cell.get(1).getText)
    js.executeScript("arguments[0].style.backgroundColor = 'pink'", rows.get(i))
     }
  val germany = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"countries\"]/tbody/tr[66]/td[2]/strong")))






  driver.quit()
}
