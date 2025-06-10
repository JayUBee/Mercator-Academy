package Automation.Week5Day2.AfternoonTasks

import org.openqa.selenium.{By, JavascriptExecutor, Point, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object Task3 extends App{

  val driver: WebDriver = new ChromeDriver()

  println("1-")
  driver.get("https://google.com")
  println("Browser Launched! \n")

  println("2-")
  driver.navigate().to("https://demoqa.com/automation-practice-form")
  println("Navigated to test URL!")

//  driver.manage().window().setPosition(new Point(0,0))
//  driver.manage().window().maximize()
//  println("Position set to (0,0) and window maximized. \n")

  println("3-")
  val firstName: WebElement = driver.findElement(By.id("firstName"))
  println("First Name located!")

  val submitBtn: WebElement = driver.findElement(By.cssSelector("#submit"))
  println("Submit button located!")

  val hobbies: WebElement = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"))
  println("Hobbies checkbox located! \n")


  if(firstName.isDisplayed && firstName.isEnabled) {
    firstName.sendKeys("Tayyab")
    println("First name input is displayed and enabled, entered 'Tayyab' as input.")
  }
  else {
    println("Error: First name field is not enabled or displayed, no input entered.")
  }

  if(!hobbies.isSelected){
    hobbies.click()
    println("Checkbox not already selected, selected 'Reading' as hobby.")
  }
  else {
    println("Checkbox already selected.")
  }
  if(submitBtn.isDisplayed && submitBtn.isEnabled){
    submitBtn.click()
    println("Submit button is visible and enabled, submission completed!")
  }

  driver.close()
  println("Browser closed!")

  driver.quit()
  println("Session ended!")

}
