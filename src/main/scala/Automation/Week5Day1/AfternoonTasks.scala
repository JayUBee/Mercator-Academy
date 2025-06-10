package Automation.Week5Day1

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}

import java.time.Duration


object AfternoonTasks extends App{

  val driver: WebDriver = new ChromeDriver()
  driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html")

  val userName: WebElement = driver.findElement(By.name("username"))
  userName.sendKeys("NameOfUser1")
  println("Username: NameOfUser1")

  val password: WebElement = driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[2]/td/input"))
  password.sendKeys("Test1231")
  println("Password: Test1231")

  val textArea: WebElement = driver.findElement(By.cssSelector("#HTMLFormElements > table > tbody > tr:nth-child(3) > td > textarea"))
  textArea.clear()
  textArea.sendKeys("This is a test comment, Hello World!")
  println("Text comment: This is a test comment, Hello World!")

  val checkBox: WebElement = driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[5]/td/input[2]"))
  checkBox.click()
  println("Checkbox 2 clicked")

  val buttons: java.util.List[WebElement] = driver.findElements(By.className("styled-click-button"))
  val submit: WebElement = buttons.get(1)
  submit.click()
  println("Submit button clicked")

  val explicitWait = new WebDriverWait(driver, Duration.ofSeconds(3))

  val linkText: WebElement =
    explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Index")))
  linkText.click()
  println("Link text clicked.")

  driver.quit()

}
