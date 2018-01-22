package App

object pan extends App {

  def greet(name:String, day: String) :
  Unit = println(s"hello $name how are you $day")

  val day = "today"
  val name = "pan"
  greet(name,day)
}
