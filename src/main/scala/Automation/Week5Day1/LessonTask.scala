package Automation.Week5Day1

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import org.openqa.selenium.{By, WebDriver, WebElement}

import java.time.Duration

object LessonTask extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://the-internet.herokuapp.com/login")

  val userName: WebElement = driver.findElement(By.xpath("//input[@id = \"username\"]"))
  userName.sendKeys("TayyabButt")
  println("Username entered: TayyabButt")

  val password: WebElement = driver.findElement(By.xpath("//input[@id = \"password\"]"))
  password.sendKeys("Test1234")
  println("Password entered: Test1234")

  val submit: WebElement = driver.findElement(By.xpath("//*[@id=\"login\"]/button"))
  submit.click()
  println("Login button clicked.")

  val explicitWait = new WebDriverWait(driver, Duration.ofSeconds(3))

  val errorMessage: WebElement = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#flash")))
  println("Error message: " + errorMessage.getText)

  driver.quit()

}
