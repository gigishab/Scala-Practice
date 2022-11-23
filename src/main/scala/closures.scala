import java.util.Date
object closures {
  def main(args: Array[String]): Unit = {
    number = 5
    println(add(20))
    println(sub(25))
    // pure closeure uses val while impure uses var
  }
  var number = 10;
  val sub = (x: Int) => x - number;
  def add(x: Int):Int = {
    return x+ number
  }

}