package lectures.week3fp

class Options {

}
object ScalaPlayground extends App {
  println("Hello, Scala!")

  def createUrl(baseUrl: String, path: String) = s"https://${baseUrl}/${path}"

  val stepikLogin = createUrl("stepik.org", "login")
  val stepikContact = createUrl("stepik.org", "contact")
  val mailLogin = createUrl("mail.google.com", "login")
  println(stepikLogin)
}