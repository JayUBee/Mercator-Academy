package Automation.Week5Day3

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver}

object HandlingFrames extends App{

  val driver: WebDriver = new ChromeDriver()
  driver.get("https://the-internet.herokuapp.com/nested_frames")

  driver.switchTo().frame("frame-top")
  driver.switchTo().frame("frame-middle")

  //by ID
  val middleText = driver.findElement(By.id("content")).getText
  println("Middle text: " + middleText)

  driver.switchTo().defaultContent()
  //to go back to main page

  //by Index
  driver.switchTo().frame(1)
  val bottomText = driver.findElement(By.tagName("body")).getText
  println("Bottom Text: " + bottomText)

  driver.switchTo().defaultContent()


  val frameTop = driver.findElement(By.name("frame-top"))
  driver.switchTo().frame(frameTop)
  driver.switchTo().frame("frame-left")
  val leftText = driver.findElement(By.tagName("body")).getText
  println("Left text: " + leftText)

  driver.switchTo().defaultContent()



  driver.quit()

}
