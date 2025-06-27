package Automation.Week7Day1

import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}

object AlertsHandling extends App {

  val options = new ChromeOptions
  options.addArguments("--headless")

  val driver: WebDriver = new ChromeDriver(options)

  driver.get("https://the-internet.herokuapp.com/javascript_alerts")

  driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click()


  driver.quit()
}
