import WedHandlingMultipleOptions.age

import java.lang.System.console

object WedHandlingMultipleOptions extends App {

  val weather: String = "rainy"

  //IF/ELSE
  if(weather == "rainy") {
    println("Take a coat with a hood.")
  } else if(weather == "sunny") { //you can have as many else/if as you need
    println("Wear sun cream.")
  } else if(weather == "cold") {
    println("Wear a warm coat.")
  } else { //catch for anything not defined in else/if
    println("Not a valid weather option.")
  }

  //PATTERN MATCH
  weather match {
    case "rainy" => println("Take a coat with a hood.")
    case "sunny" => println("Wear sun cream.")
    case "cold" => println("Wear a warm coat.")
    case _ => println("Not a valid weather option.")
  }


  val season: String = "winter"
  //How we approach this when we have multiple options
  if (weather == "cold" || season == "winter") {
    println("Take a coat.")
  } else {
    println("A light jacket is fine.")
  }

  (weather, season) match {
    case (weather, season) if weather == "cold" || season == "winter" => println("Take a coat.")
    case _ => println("A light jacket is fine.")
  }

  //INT - slightly more careful
  val age: Int = 0
  if(age >= 18){println(s"You are an adult because you are $age.")}
  else if (age < 18 && age >= 0){println(s"You are a child because you are $age.")}
  else if (age < 0) {println("Invalid age, please enter age greater than or equal to 0.")}

  age match{
    case age if age < 0 => println("Invalid age, please enter age greater than or equal to 0.")
    case age if age < 18 => println(s"You are a child because you are $age.")
    case age if age >= 18 => println(s"You are an adult because you are $age.")
  }

  //Task in session (Movie Rating)
  val ageRating: Int = 3
  ageRating match{
    case ageRating if ageRating < 0 => println("Invalid age, please enter age greater than or equal to 0.")
    case ageRating if ageRating >= 0 && ageRating < 4 => println("You cannot watch any movies.")
    case ageRating if ageRating >= 4 && ageRating < 8 => println("You can watch movies rated 'U'.")
    case ageRating if ageRating >=8 && ageRating < 12 => println("You can watch movies rated 'PG'.")
    case ageRating if ageRating >= 12 && ageRating < 15 => println("You can watch movies rated '12A'.")
    case ageRating if ageRating >= 15 && ageRating < 18 => println("You can watch movies rated '15'.")
    case ageRating if ageRating >= 18 => println("You can watch movies rated '18'.")
  }

  //OPTIONS (getOrElse)
  val name: Option[String] = Some("Tayyab")
  val emptyName: Option[String] = None
  println(name)
  println(emptyName)

  //getOrElse is used when we want to return a default value if None is returned.
  //it will also take the "Some" away, leaving us with just the internals.
  def getName(name: Option[String]): String = name.getOrElse("Anonymous.")
  println(getName(name)) //Some("Tayyab")
  println(getName(emptyName)) //None


  //ERROR CATCHING - Try/Catch
  try {
    //ALL LOGIC - If/else, pattern match, def, val
    val number = "one".toInt //I want to change the input to a Int from a String
    println(s"The number is $number")
  } catch {
    case error: NumberFormatException => println(s"$error was not a valid input.") //often see error as 'e'
  }

}
