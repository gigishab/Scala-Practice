
  import java.util.Date

  object partially_applied_functions {

    def log(date: Date, message: String) = {
      println(date + " " + message)
    }

    def main(args: Array[String]) {

      val sum = (a: Int, b: Int, c: Int, d: Int) => a + b + c + d
      val f = sum(10, 20, 30, _: Int)
      println(f(40));

      val date = new Date;
      val newLog = log(date, _: String);

      newLog("The message 1")
      newLog("The message 2")
      newLog("The message 3")
      newLog("The message 4")

    }
  }


