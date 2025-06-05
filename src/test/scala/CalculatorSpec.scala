import Thursday.Calculator
import org.scalatest.flatspec.AnyFlatSpec

import scala.language.postfixOps

class CalculatorSpec extends AnyFlatSpec {

  val calc: Calculator = new Calculator //make a new object of our class so we can access all the methods within it.

  "add" should "add 2 Ints together" in {
    val input = calc.add(1,2)
    val expectedResult = 3 //1+2
    assert(input == expectedResult) // assert(calc.add(1,2)) == 3)
  }

  "multiply" should "multiply 2 Ints together" in {
    val input = calc.multiply(2, 3)
    val expectedResult = 6 //2*3
    assert(input == expectedResult)
  }

  "subtractSecondFromFirst" should "subtract second value from first" in {
    val input = calc.subtractSecondFromFirst(4, 2)
    val expectedResult = 2 //4-2
    assert(input == expectedResult)
  }

  "subtractFirstFromSecond" should "subtract first value from second" in {
    val input = calc.subtractFirstFromSecond(4, 2)
    val expectedResult = -2
    assert(input == expectedResult)
  }

  "divideNumFirst" should "divide first value over second" in {
    val input = calc.divideNumFirst(4, 2)
    val expectedResult = 2
    assert(input == expectedResult)
  }

  "divideDenomFirst" should "divide second value over first" in {
    val input = calc.divideDenomFirst(4, 2)
    val expectedResult = 0.50
    assert(input == expectedResult)
  }

}
