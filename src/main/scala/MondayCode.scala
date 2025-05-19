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


}
