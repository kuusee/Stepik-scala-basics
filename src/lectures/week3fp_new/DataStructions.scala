package week3fp

object DataStructions extends App {
  case class User(id: Int, name: Option[String])
    val aUser = User(1, None)
    val userName: Option[String] = aUser.name
    val nameLength = userName match {
      case Some(name) => name.length
      case None => 0
    }

  val userName2 = aUser.name.getOrElse("No name!")
  println(userName2)

  val aUser2 = User(2, Some("Bob"))
  val userName3 = aUser2.name.getOrElse("No name")
  println(userName3)
  println(nameLength)

  case class User2(id: Int, name: String)

  def getUserFromDb() = null
  
  val user4 = Option(getUserFromDb()).orElse(Some(User2(1, "AnonUser")))

  println(user4)
}
