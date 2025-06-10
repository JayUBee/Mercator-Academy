package Automation.tinkering

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object FaceBook extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://chatgpt.com/")



  val textArea: WebElement = driver.findElement(By.xpath("//*[@id=\"prompt-textarea\"]/p"))
  textArea.sendKeys("I am testing automation on chatGPT, this message is send through scala code, no response needed.")



}
