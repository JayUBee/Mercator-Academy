package Automation.Week5Day4

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import org.openqa.selenium.{By, WebDriver, WebElement}

import java.time.Duration

case object explicitWait extends  App{

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://www.w3schools.com/howto/howto_css_custom_checkbox.asp")

  private val acceptAllButton: WebElement = driver.findElement(By.id("accept-choices"))
  acceptAllButton.click()

  val explicitWait = new WebDriverWait(driver, Duration.ofMinutes(1))

  val checkBox1 = explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[3]/div[2]/label[1]")))

  checkBox1.click()

  driver.quit()


}
