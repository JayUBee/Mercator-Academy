package Automation.Week5Day3.AfternoonTasks

import Automation.Week5Day3.HandlingDropDown.select
import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.Select

object AfternoonTaskMVP extends App{

  val driver: WebDriver = new ChromeDriver()

  println("1-")
  driver.get("https://testpages.herokuapp.com/styled/index.html")
  println("Site opened.")
  driver.manage().window().maximize()
  println("Maximized page window. \n")

  println("2-")
  driver.findElement(By.id("htmlformtest")).click()
  println("Opened HTML form page.")
  val userName: WebElement = driver.findElement(By.name("username"))
  val password: WebElement = driver.findElement(By.name("password"))
  userName.sendKeys("Tayyab")
  println("Username field entered: Tayyab.")
  password.sendKeys("Test1234")
  println("Password field entered: Test1234.\n")

  println("3-")
  val checkBox = driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[5]/td/input[1]"))
  if (!checkBox.isSelected){
    checkBox.click()
    println("Checkbox clicked. \n")
  }
  else {
    println("Checkbox already selected, no click. \n")
  }

  println("4-")
  val radio1Btn = driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[6]/td/input[1]"))
  radio1Btn.click()
  println("Radio 1 Button clicked. \n")

  println("5-")
  val dropDown = driver.findElement(By.name("dropdown"))
  val select = new Select(dropDown)
  select.selectByIndex(4)
  println("Selected by index: " + select.getFirstSelectedOption.getText + "\n")

  println("6-")
  val submitBtn = driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[9]/td/input[2]"))
  submitBtn.click()
  println("Submit Button clicked. \n")

  println("7-")
  val indexLink = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/a"))
  indexLink.click()
  println("Index link clicked.")

  driver.quit()


}
