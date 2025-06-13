package Automation.Week5Day5

import org.openqa.selenium.{By, WebElement}
import org.openqa.selenium.chrome.ChromeDriver
import java.util
import scala.jdk.CollectionConverters.CollectionHasAsScala

object LoopPractice extends App {

  // for comprehension

  /*
  *for (item <- collection){
  * //DO SOMETHING EVERY TIME
  * }
  */

  //SCALA
  val fruits: List[String] = List("Apple", "Banana", "Cherry", "Melon")

  for (fruit <- fruits) {
    println(fruit)
  }

  //TURNED INTO SELENIUM:
  /**
   * .asScala -> turns it into Scala from Java
   * for (fruit <- fruits.asScala){
   * println(fruit.getText)
   * }
   */

  //EXAMPLE - WON'T RUN

  val driver = new ChromeDriver()
  driver.get("https://example.com")

  //loop through a list of elements
  val items: util.List[WebElement] = driver.findElements(By.id("i")) //Elements WITH AN S - it is a list

  for (item <- items.asScala) { //loop over each WebElement in the items collection (but this is Java list -
    //currently can't use <- until we turn it into Scala).
    println(item.getText) //Get the text and print it.
  }

  //click all buttons within a selection
  val buttons = driver.findElements(By.cssSelector(".my-buttons"))
  for (button <- buttons.asScala) {
    button.click()
  }

  // find a specific element (within a loop - collection of a type)
  // need to use an 'if' within the for comp

  val links = driver.findElements(By.tagName("a")) //find all the links on the URL from line 36
  //I want to find the 'Contact us' link
  for (link <- links.asScala) {
    if (link.getText.contains("Contact")) {
      link.click()
    } else {
      println("No links containing 'Contact' were found.")
    }
  }


}
