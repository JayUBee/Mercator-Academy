package Automation.Week6Day1

import Automation.Week6Day1.ScreenCapture.driver
import org.openqa.selenium.{By, OutputType, TakesScreenshot, WebDriver}
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}
import org.openqa.selenium.io.FileHandler
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}

import java.io.File
import java.text.SimpleDateFormat
import java.time.Duration
import java.util.Date

object AfternoonTaskMVP extends App {

  val options = new ChromeOptions()
  options.addArguments("--headless")

  val driver: WebDriver = new ChromeDriver(options)
  driver.get("https://the-internet.herokuapp.com/login")

  driver.findElement(By.id("username")).sendKeys("tomsmith")
  driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!")
  driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click()

  val explicitWait = new WebDriverWait(driver, Duration.ofSeconds(3))
  explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("flash")))

  val flashText = driver.findElement(By.id("flash"))
  println("Login status: " + flashText.getText)

  def takeScreenshot(): Unit = {
    val srcFull: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
    FileHandler.copy(srcFull, new File("/Users/tayyab.butt/Documents/screenshots/TestResult.png"))
  }
  takeScreenshot()

  val errorCode = if (flashText.getText.contains("secure")){"success"}
  else if(flashText.getText.contains("invalid")) {"failure"}

  val timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date())
  val srcTimestamp: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
  val fileName = s"${timeStamp}_${errorCode}"
  FileHandler.copy(srcTimestamp, new File(s"/Users/tayyab.butt/Documents/screenshots/$fileName.png"))

  try {
    val timeStamp = new SimpleDateFormat("yyyyMMdd-" + errorCode).format(new Date())
    val srcTimestamp: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
    FileHandler.copy(srcTimestamp, new File(s"/Users/tayyab.butt/Documents/screenshots/TestResult_$timeStamp.png"))
  }
  catch {
    case e: IllegalArgumentException => println("cannot customize date format," +
      " please store errorCode in a separate val. \n" + e.getMessage)
      //e.printStackTrace()
  }
  finally {
    if(driver != null){
      driver.quit()
    }
  }



  driver.quit()
}
