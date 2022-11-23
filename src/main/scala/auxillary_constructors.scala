object auxillary_constructors {

  def main(args: Array[String]): Unit = {
    // Class


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
    var user1 = new User("Max", 28);
    var user2 = new User();
    var user3 = new User("Max");

  }

}



