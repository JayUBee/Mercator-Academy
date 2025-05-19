object MondayCode extends App {
  // VAL = BEST PRACTICE!!
  val melons = 5 * 50
  val apples = 2 * 10
  val fizzyDrinks = 6 * (100 * 1.20)
  //  val total = melons + apples + fizzyDrinks

  //VAR - mutable (not best practice)
  var total: Double = 0
  total = total + apples
  println(total)
  total = total + melons
  println(total)
  total = total + fizzyDrinks
  println(total)

  // TYPES
  val wholeNumber: Int = 5
  val littleNumber: Short = 68 //RARE - JUST USE INT
  val bigNumber: Long = 63782738728397L //MUST PUT L AT THE END
  val littleDecimal: Float = 2.464546f //MUST PUT f AT THE END - RARE
  val decimal: Double = 46465.574
  val text: String = "Hello World!"
  val trueFalse: Boolean = true
  val falseTrue: Boolean = false

  println(trueFalse == falseTrue)

  //OPERATORS - ARITHMETIC
  val a: Int = 10
  val b: Int = 5
  val c: Int = 3

  val add: Int = a + b
  val subtract: Int = a - b
  val divide: Int = a / b
  val multiply: Int = a * b
  val modulus: Int = a % c // 10 % 3 (what is the remainder)
  println(modulus)
  val even: Int = a % 2 // left with 0 = even

  //OPERATORS - RELATIONAL
  val equality: Boolean = a == a // true or false (boolean)
  val inequality: Boolean = a != b // NOT EQUAL TO (BOOLEAN)
  val lessThan: Boolean = b < c
  val lessThanEqualTo: Boolean = b <= c
  val greaterThan: Boolean = b > c
  val greaterThanEqualTo: Boolean = b >= c

  //OPERATORS - LOGICAL
  val and: Boolean = true && true //both must be true to return true
  val or: Boolean = true || false //either side can be true to return true
  val not: Boolean = !false

  //METHODS
  def makeACupOfTea(sugar: Int, milk: Boolean): String = {
    s"You have made a cup of tea with $sugar spoons of sugar. " +
      s"Your milk selection is: $milk"
  }

  println(makeACupOfTea(7, milk = true)) //calling the method
  println(makeACupOfTea(1, milk = false)) //calling the method

  val vat: Double = 1.2 //FUNCTION - WE CANNOT PASS IN VARIABLES

  //write a method that calculates the final price of a product with VAT

  def priceWithVAT(price: Double, vat: Double): Double = {
    val finalPrice: Double = price * vat
    finalPrice
  }

  priceWithVAT(10.0, vat)

  //CLASSES






  //AFTERFNOON TASKS
  //MVP TASKS
  //Task 1-a
  val answerA: Boolean = (3+4) * 57 < 300
  println(answerA)

  //Task 1-b
  val answerB: Boolean = (144/12) >= 12
  println(answerB)

  //Task 1-c
  val cat: String = "Cat"
  val dog: String = "Dog"
  val answerC: Boolean = cat.length < dog.length
  println(answerC)

  //Task 1-d
  val rab: String = "Rabbit"
  val ham: String = "Hamster"
  val answerD: Boolean = rab.length < ham.length
  println(answerD)

  //Task 1-e
  val numb: Int = 17
  val answerE: Boolean = (17%2) == 1
  println(answerE)

  //Task 1-f
  val num1: Double = 75/9
  val num2: Double = 38/6
  val answerF: Boolean = num1 < 30 && num2 <20
  println(answerF)
  //END TASK 1

  //Task 2
  //The String "I love scala already" is a function which returns a string value
  //The println is a statement which returns a void value but prints the sentence in the output window
  //END TASK 2

  //Task 3
  def sqrt(int: Int):Int = {
  val sqrt = int * int
    sqrt
  }
  //END TASK 3

  //Task 4
  def oddCheck(check: Int): Boolean ={
    val bool: Boolean = (check%2) == 1
    bool
  }
  //END TASK 4

  //Task 5
  class Book(val name: String,
             val author: String,
             val yearPublished: Int,
             var available: Boolean)
  {
  def borrowBook(): Unit = {
    if (available){
      available = false
      println(s"$name has been borrowed")
    }
    else {println(s"$name is not available")}
  }
    def returnBook(): Unit = {
      available = true
      println(s"$name has been returned")
    }

    def displayInfo(): Unit = {
      println(s"Title: $name, Author: $author, Year Published: $yearPublished, Available: $available")
    }
  }

  //END TASK 5
  //END MVP TASKS

  //EXTENSION TASKS
  //Task 1
  val string1: String = "hello world"
  val string2: String = string1.toUpperCase
  println(string2)

  //Task 2
  val input:String = "hello world"
  println(input.capitalize)

  //Task 3
  val input1:String = "STRING"
  val input2:String = "string"
  val comp:Boolean = input2 == input1
  println(comp)
  //input1 != input2 because STRING and string have different ASCII values

  //Task 4
  // you cannot simply convert an int value to a string value, to do that you must first map the values
  //to the respective type.

  //Task 5
  //No for the same reasons as in task 4

  //Task 6
  //When you convert Int '1' to type String, you will still get an output of 1 (not "one")
  // the difference in the two outputs would then be of size taken up in memory

  //END EXTENSION TASKS

  //RESEARCH TASKS
  //Task 1
  //You cannot use "new" as a variable name because it is a reserved keyword
  //new is used to create new instances of a class

  //Task 2

}
