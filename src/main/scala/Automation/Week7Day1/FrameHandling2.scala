package Automation.Week5Day3

import Automation.Week5Day3.HandlingFrames.driver
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}
import org.openqa.selenium.{By, WebDriver}

object FrameHandling2 extends App{

  val options = new ChromeOptions
  options.addArguments("--headless")

  val driver: WebDriver = new ChromeDriver(options)
  driver.get("https://the-internet.herokuapp.com/nested_frames")

  driver.switchTo().frame("frame-top")
  println("You are on top frame.")

  driver.switchTo().frame(1)
  println("you are on middle frame (in the top frame).")

  driver.switchTo().defaultContent()

  val bottomFrame = driver.findElement(By.name("frame-bottom"))
  driver.switchTo().frame(bottomFrame)
  println("You are on bottom frame. \n")
  val bottomText = driver.findElement(By.tagName("body")).getText
  println("Bottom Text: " + bottomText)





  driver.quit()

}
