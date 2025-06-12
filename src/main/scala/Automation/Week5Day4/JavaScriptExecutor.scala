package Automation.Week5Day4

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, JavascriptExecutor, WebDriver, WebElement}

import java.time.Duration

object JavaScriptExecutor extends App{

  val driver: WebDriver = new ChromeDriver()

  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))


  driver.get("https://proleed.academy/exercises/selenium/selenium-element-id-locators-practice-form.php")
  //driver.manage().window().setPosition(new Point(-1920, 0))
  //driver.manage().window().setSize(new Dimension(960, 1080))

  val emailAddress: WebElement = driver.findElement(By.id("email"))
  emailAddress.sendKeys("customer@test.com")
  println("Email Address entered - Passed")

  val password: WebElement = driver.findElement(By.id("password"))
  password.sendKeys("TestPassword123")
  println("Password entered - Passed")

  val submitBtn = driver.findElement(By.id("login"))
  //submitBtn.click()

  val js = driver.asInstanceOf[JavascriptExecutor]
  js.executeScript("arguments[0].scrollIntoView(true);", submitBtn)
  js.executeScript("arguments[0].click();", submitBtn)

  val header = driver.findElement(By.tagName("h2")).getText
  assert(header == "Thank You!")



  driver.quit()

}
