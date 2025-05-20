object TueCollectionCode extends App {

  val firstSet: Set[Int] = Set(1,2,3,4,5, 5) // Not ordered, does not allow repeats
  println("First set: " + firstSet)

  val firstSeq: Seq[Int] = Seq(1,2,3,4,5, 5) // Ordered, allows repeat values
  println("First Seq: " + firstSeq)

  //Map takes 2 parameters, (Key -> Value). Called Key Value pairs. Key must be unique.
  //We cannot have 2 keys that are the same.
  val firstMap: Map[String, Int] = Map(
    "one" -> 1,
    "two" -> 2,
    "three" -> 3,
    "four" -> 4,
    "five" -> 5,
    "five" -> 5 // Will remove when compiled (doesn't throw error).
  )
  println("First map: " + firstMap)

  //Accessing data
  //SEQ
  val getSeqHead: Int = firstSeq.head //index position 0 (first element)
  println("Seq Head: " + getSeqHead)
  val getSeqTail: Seq[Int] = firstSeq.tail //Everything BUT the head
  println("Seq Tail: " + getSeqTail)
  val getSeqIndex: Int = firstSeq(3) //only works with ordered collections
  println("Seq Index: " + getSeqIndex)

  //SET
  val getSetIndex = firstSet(3) //checks if the value (3) is contained in the set
                               //can also use .contains(3)
  println("Exist in Set: " + getSetIndex)

  //Often filter for information
  val filterSet: Set[Int] = firstSet.filter(_ < 3)
  println("Filter Set: " + filterSet)
  val filterNotSet: Set[Int] = firstSet.filterNot(_ < 3)
  println("Filter Not Set: " + filterNotSet)
  val evenSet: Set[Int] = firstSet.filter(_ % 2 == 0)
  // val evenSet: Set[Int] = firstSet.filterNot(_ % 2 != 0)
  println("Even Set: " + evenSet)

  //MAP
  val getMapValue: Int = firstMap("one") //Enter key to get the value, only works this way round.
  println("Get Map Value: " + getMapValue)
  val getMapKey: String = firstMap.find(_._2 == 1).get._1
  //find the value that is equal to 1 and get the key that matches it
  println("Get Map Key: " + getMapKey)

  //TASK 1
  val secondSeq: Seq[String] = Seq("Adam", "Tayyab", "Andrew", "Pablo", "Connor")
  val secondMap: Map[Int, String] = Map(
    1 -> "red",
    2 -> "yellow",
    3 -> "blue",
    4 -> "green" )

  val secondSet: Set[Int] = Set (1,2,3,4,5,6,7)

  val getMapBlue: String = secondMap(3)
  println("Value for Key(3): " + getMapBlue)

  val filterSecondSet: Set[Int] = secondSet.filter(_ > 2)
  println("Values greater than 2: " + filterSecondSet)
  //END TASK 1
  //ASK APRIL ABOUT FILTERING IN MAP AGAIN


  //map (method - lowercase 'm')
  //Use a map to iterate through a collection

  def tripledSet(inputSet: Set[Int]): Set[Int] = inputSet.map {
    // _ * 3
    number => number * 3 //both lines mean the same, different way of writing
  }
  println("Tripled Set: " + tripledSet(firstSet))

  def tripledSeq(inputSeq: Seq[Int]): Seq[Int] = inputSeq.map {
    _ * 3
    // number => number * 3 //both lines mean the same, different way of writing
  }
  println("Tripled Seq: " + tripledSeq(firstSeq))

  def tripledMap(inputMap: Map[String, Int]): Map[String, Int] = inputMap.map {
    case (key, value) => (key + " x3", value*3) //can also change the key
  }
  val tripledMapStored = tripledMap(firstMap)
  println("Tripled Map: " + tripledMapStored)

  // .exists = all that could be in there (get collection back)
  // .contains = (check - true/false - boolean)

  //TASK 1 CONTINUATION
  def addOne(inputSet: Set[Int]): Set[Int] = inputSet.map{
    _ + 1
  }
  println("Set with added 1: " + addOne(secondSet))

  def checkForR(inputSeq: Seq[String]): Seq[Boolean] = inputSeq.map {
    _.contains('r')
  }
  println("Check if strings contain R: " + checkForR(secondSeq))

  val oddNumbersOnly = secondSet.filter{
  _ % 2 != 0
  }
  println("Odd numbers only Set: " + oddNumbersOnly)
  //END TASK 1

  val flatMapNames: Seq[Char] = secondSeq.flatMap(_.toUpperCase)
  println("FlatMap: " + flatMapNames)

  val newSeq: Seq[Int] = Seq(6,7,8)

  //Append - add to end
  val appendedListOne = firstSeq :+ newSeq
  println("Appended with :+ " + appendedListOne)

  val appendedListTwo = firstSeq ++ newSeq
  println("Append with ++ " + appendedListTwo)

  //Prepend
  val prependSeqOne = newSeq ++ firstSeq
  println("Prepend ++ " + prependSeqOne)

  val prependSeqTwo = newSeq +: firstSeq // : + - swap position
  println("Prepend +: " + prependSeqTwo)

  val prependValue = 6 +: firstSeq
  println(prependValue)






}
