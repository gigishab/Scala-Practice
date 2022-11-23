object scala_classes {

  def main(args: Array[String]): Unit = {
    class User(private var name: String, var age: Int) {
      def printName {
        println(name)
      }

      def this() {
        this("Tom", 32);
      }

      def this(name: String) {
        this(name, 32);
      }
    };
    var user = new User("Max", 28);
    user.printName;

    println(user.age);
  }

}
