package Automation.Week4Day4

import Automation.Week5Day4.JavaScriptExecutor.{driver, submitBtn}
import org.openqa.selenium.{By, JavascriptExecutor, WebElement}
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}

import scala.jdk.CollectionConverters.CollectionHasAsScala

object AfternoonTask extends App{

  val options = new ChromeOptions()
  options.addArguments()

  val driver = new ChromeDriver(options)

  driver.get("https://www.w3schools.com/html/html_examples.asp")

  driver.findElement(By.id("accept-choices")).click()

  val button = driver.findElement(By.linkText("Examples explained"))
  button.click()

  driver.navigate().back()

  val headings = driver.findElements(By.tagName("h1"))
  println(s"The number of elements with <h1> are: ${headings.size()}")

  val links = driver.findElements(By.tagName("a"))
  println(s"The number of elements with <a> are: ${links.size()}")

  val tagsToCheck = List("p", "a", "h1", "button")

  for(tag <- tagsToCheck){
    val elements = driver.findElements(By.tagName(tag)).asScala
    println(s"There are ${elements.size} <$tag> elements on this page.")
  }

  driver.get("https://demoqa.com/")
  driver.manage().window().maximize()

  val elementsBtn: WebElement = driver.findElement(By.tagName("h5"))

  val js = driver.asInstanceOf[JavascriptExecutor]
  js.executeScript("arguments[0].scrollIntoView(true);", elementsBtn)
  js.executeScript("arguments[0].click();", elementsBtn)

  driver.findElement(By.id("item-0")).click()

  driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Tayyab Butt")



  driver.quit()

}
