package Automation.Week5Day3.AfternoonTasks

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver}

object AfternoonTaskEXT extends App {

  val driver: WebDriver = new ChromeDriver()

  println("1-")
  driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php")

  driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[1]/button")).click()
  println("Simple alert triggered.")

  val alert1 = driver.switchTo().alert()
  alert1.accept()
  println("Simple alert accepted. \n")

  driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[3]/button")).click()
  println("Confirmation alert triggered.")

  val alert2 = driver.switchTo().alert()
  alert2.dismiss()
  println("Confirmation alert dismissed. \n")

  driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[4]/button")).click()
  println("Prompt alert triggered.")
  val alert3 = driver.switchTo().alert()
  println("Prompt text: " + alert3.getText)
  alert3.sendKeys("Tayyab")
  println("Response: Tayyab")
  alert3.accept()
  println("Prompt alert accepted. \n \n")


  println("2-")
  driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe")




  driver.quit()


}
