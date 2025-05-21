object TueCollectionCode extends App {

  val firstSet: Set[Int] = Set(1, 2, 3, 4, 5, 5) // Not ordered, does not allow repeats
  println("First set: " + firstSet)

  val firstSeq: Seq[Int] = Seq(1, 2, 3, 4, 5, 5) // Ordered, allows repeat values
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
    4 -> "green")

  val secondSet: Set[Int] = Set(1, 2, 3, 4, 5, 6, 7)

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
    case (key, value) => (key + " x3", value * 3) //can also change the key
  }

  val tripledMapStored = tripledMap(firstMap)
  println("Tripled Map: " + tripledMapStored)

  // .exists = all that could be in there (get collection back)
  // .contains = (check - true/false - boolean)

  //TASK 1 CONTINUATION
  def addOne(inputSet: Set[Int]): Set[Int] = inputSet.map {
    _ + 1
  }

  println("Set with added 1: " + addOne(secondSet))

  def checkForR(inputSeq: Seq[String]): Seq[Boolean] = inputSeq.map {
    _.contains('r')
  }

  println("Check if strings contain R: " + checkForR(secondSeq))

  val oddNumbersOnly = secondSet.filter {
    _ % 2 != 0
  }
  println("Odd numbers only Set: " + oddNumbersOnly)
  //END TASK 1

  val flatMapNames: Seq[Char] = secondSeq.flatMap(_.toUpperCase)
  println("FlatMap: " + flatMapNames)

  val newSeq: Seq[Int] = Seq(6, 7, 8)

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


  //AFTERNOON TASKS
  //MVP TASKS
  //TASK 1
  val foreNames: Seq[String] = Seq(
    "Alice",
    "Bob",
    "Charlie",
    "Alice",
    "David",
    "Bob")

  // TASK 2
  println(s"The forenames of the taxpayers are: $foreNames")

  //TASK 3
  def count(taxpayer: String, inputSeq: Seq[String]): Int = {
    inputSeq.count(_ == taxpayer)
  }
  val aliceCount = count("Alice", foreNames)

  //TASK 4
  println(s"Alice submitted her tax returns $aliceCount time(s).")

  //TASK 5
  val foreNamesSet = foreNames.toSet

  //TASK 6
  println(s"The forenames of unique taxpayers are: $foreNamesSet")

  //TASK 7
  def countIt(taxpayer: String, inputSeq: Iterable[String]): Int = {
    inputSeq.count(_ == taxpayer)
  }
  val aliceCountSeq = countIt("Alice", foreNames)
  val aliceCountSet = countIt("Alice", foreNamesSet)

  //TASK 8
  println(s"Alice submitted her taxes $aliceCountSeq time(s)")
  println(s"Alice submitted her taxes $aliceCountSet time(s)")

  //TASK 9
  //a
  val userFailedLogin: Map[String, Int] = Map(
    "Alice" -> 2,
    "Bob" -> 1,
    "Charlie" -> 3,
    "David" -> 2,
    "Elise" -> 1,
    "Frank" -> 3
  )

  //b
  val userAt0 = userFailedLogin.toSeq.head
  println(s"The user ${userAt0._1} has ${userAt0._2} failed attempts.")

  //c
  val addNewUser = userFailedLogin + ("Tom" -> 3)
  println(addNewUser)

  //d
  val keyAt1 = addNewUser.toSeq(1)._1
  val updateAt2 = addNewUser.updated(keyAt1, addNewUser(keyAt1) + 1)
  println(updateAt2)

  //e
  val keyAt5 = updateAt2.toSeq(5)._1
  val removeAt5 = updateAt2 - keyAt5
  println(removeAt5)

  //EXTENSION TASKS
  //TASK 1

  val day1Submission: Set[String] = Set("Alice", "Bob", "Charlie", "David", "Frank")
  val day2Submission: Set[String] = Set("Charlie", "Eve", "Bob", "Frank", "Alice")

  //a
  val bothDays = day1Submission.intersect(day2Submission)
  println(s"Submitted on both days: $bothDays")

  //b
  val onlyDay1 = day1Submission.diff(day2Submission)
  println(s"Submitted on day 1 only: $onlyDay1")

  val allUnique = day1Submission.union(day2Submission)
  println(s"All unique submitters: $allUnique")


  //RESEARCH TASKS
  //TASK 2
  //Map.get
  val m1 = Map("Hello" -> 1, "World" -> 2, "All" -> 3)
  val result = m1.get("Hello")
  println("Map.get: " + result)

  //Map(key)
  val result2 = m1("Hello")
  println("Map(key): " + result2)

  //ALTERNATIVELY...
  val result3 = m1.keys
  println("Map.keys: " + result3)

  //Map.getOrElse
  val m2 = Map("Hello" -> 1, "World" -> 2)
  val world = m2.getOrElse("World", 0)
  println("Map.getOrElse (exists): " + world)
  val all = m2.getOrElse("All", 0)
  println("Map.getOrElse (doesn't exist): " + all)



}
