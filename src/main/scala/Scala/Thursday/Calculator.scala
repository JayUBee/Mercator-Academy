package Scala.Thursday

class Calculator {

  def add(x:Int, y:Int): Int = x + y

  def multiply(x: Int, y: Int): Int = x * y

  def subtractSecondFromFirst(x: Int, y:Int): Int = x - y
  def subtractFirstFromSecond(x: Int, y:Int): Int = y - x

  def divideNumFirst(x:Int, y:Int): Double = x/y
  def divideDenomFirst(x:Double, y:Double): Double = y/x

}


//Scenario 1:
//Given: I have £50 in my account
//When: I transfer £20 to my friend
//Then: I have £30 left and my friend has £20 more

//Scenario 2:
//Given: I have £50 in my account and my friend gave me the wrong account number
//When: I try to transfer £20 to them
//Then: The app will give me an error for incorrect details and no money will be transferred

