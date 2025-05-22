object WednesdayTasks extends App {


  //MVP TASK
  //TASK 1-a,b,c
  val numWatermelon: Int = 4
  numWatermelon match {
    case num if num < 0 => println(s"Invalid entry, It is impossible for John to carry $numWatermelon watermelons, please enter a positive number.")
    case num if num == 0 => println("John is carrying 0 watermelons, he does not need a bag or the melons.")
    case num if num <= 3 => println(s"John does not need a bag for $numWatermelon melons.")
    case num if num <= 5 => println(s"John does need a bag to carry $numWatermelon melons.")
    case num if num > 5 => println(s"John cannot possibly carry $numWatermelon melons.")
  }

  //1-d
  val needBag: Boolean = if (numWatermelon > 3 && numWatermelon < 6) {
    true
  }
  else {
    false
  }
  println(s"Does John have a bag with him? -> $needBag")

  //1-e
  val canBuy: Boolean = if (needBag) {
    true
  }
  else if (!needBag && numWatermelon < 6) {
    true
  }
  else {
    false
  }
  println(s"Can John buy $numWatermelon watermelons? -> $canBuy")

  //TASK 2
  try {
    val miles = "30".toInt
    val toBePaid: Double = miles * 0.45
    println(s"you will be paid £$toBePaid.")
  }
  catch {
    case e: NumberFormatException => println(s"$e was not a valid input.")
  }

  //EXTENSION TASK 1
  //(note that / separates each operator)
  //Operators in scala come in order of precedence as shown below
  //multiplicative(*, /, %) / additive(+, -) / relational(<, <=, >, >=) / Equality(==, !=) /
  //Logical AND(&&) / Logical OR(||)

  //The order of these operators and some others are stated in: https://www.geeksforgeeks.org/operators-precedence-in-scala/

  //TASK 2
  //(true || false && false) is simplified to -> (true || (false && false)) -> (true || true) -> (true)
  val bool1: Boolean = (true || false && false)
  println(s"The answer for (true || false && false) is: $bool1")

  //TASK 3
  //((true || false) && false) simplifies to -> (false && false) -> false
  val bool2: Boolean = ((true || false) && false)
  println(s"The answer for ((true || false) && false) is: $bool2")

  //TASK 4
  //(1 < 4 && 7 != 10 || 9 + 10 == 21) -> (1<4 && 7!=10 || 19==21) -> (true && true || false) -> (true || false) -> (true)
  val bool3: Boolean = (1 < 4 && 7 != 10 || 9 + 10 == 21)
  println(s"The answer for (1 < 4 && 7 != 10 || 9 + 10 == 21) is: $bool3")


  //RESEARCH TASK
  //We can assign values with if statements using two ways:
  //method 1:
  val a = 20
  var result1 = ""
  if (a == 20) {
    result1 = "a = 20"
  } else {
    result1 = "a != 20"
  }
  println(result1)

  //method 2:
  val b = 20
  val result2 = if (b == 20) "b = 20" else "b != 20"
  println(result2)

  //I found both of these methods at: https://medium.com/@maryam.zafar1997/if-else-statements-in-scala-34c8a7a62f34

  //EXAMPLE TASK
  val num1: Int = 5
  val num2: Int = 18
  val newVal = if (num1 > num2) "yes" else if (num2 > num1) "no"

  println(s"The new value (val) without specifying String type is: $newVal")

  //OR - ALTERNATIVELY
  var newVal2: String = ""
  if (num1 > num2) {
    newVal2 = "yes"
  }
  else if (num2 > num1) {
    newVal2 = "no"
  }

  println(s"The new value (var) with specifying String type is: $newVal2")

  //END ASSIGNMENT


}
