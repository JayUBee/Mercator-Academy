package Automation.Week5Day3

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

object HandlingRadioButtonAndCheckbox extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html")

  

  driver.quit()

}
