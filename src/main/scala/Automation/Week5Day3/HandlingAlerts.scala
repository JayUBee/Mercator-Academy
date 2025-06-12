package Automation.Week5Day3

import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver

object HandlingAlerts extends App{

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://the-internet.herokuapp.com/javascript_alerts")

  //SIMPLE ALERT
  driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click()

  val alert1 = driver.switchTo().alert()
  println("Alert Text: " + alert1.getText)
  alert1.accept()
  println("Test Passed for Simple Alert.")

  //CONFIRMATION ALERT
  driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click()

  val alert2 = driver.switchTo().alert()
  alert2.dismiss()
  println("Confirmation Alert Passed")

  //PROMPT ALERT
  driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click()

  val alert3 = driver.switchTo().alert()
  println("Alert Text: " + alert3.getText)
  alert3.sendKeys("Welcome!")
  println("Prompt written: Welcome!")
  alert3.accept()
  println("Test Passed for Prompt Alert.")

  driver.quit()

}
