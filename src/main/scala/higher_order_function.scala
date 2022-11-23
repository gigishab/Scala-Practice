object higher_order_function {

  object scala_functions {
    def main(args: Array[String]): Unit = {
      println(add(45, 32))
      println(subtract(45, 32))
      println(multiply(45, 32))
      println(divide(45, 32))
    }

    def add(x: Int, y: Int): Int = {
      return x + y;
    }

    def subtract(x: Int, y: Int): Int = {
      x - y;
    }

    def multiply(x: Int, y: Int): Int = x * y;

    def divide(x: Int, y: Int) = x / y;
  }

}
