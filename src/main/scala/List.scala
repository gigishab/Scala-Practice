object List {

    def main(args: Array[String]): Unit = {
      println(0 :: my_list)
      println(my_list)
      println(names)
      println(1 :: 5 :: 9 :: Nil)
      println(my_list.head)
      println(my_list.tail)
      println(names.isEmpty)
      println(my_list.reverse)
      println(List.fill(5)(2))
      println(my_list.max)

      my_list.foreach(println)
      var sum: Int = 0;
      my_list.foreach(sum += _)
      println(sum)

      for (name <- names) {
        println(name);
      }
      println(names(0));
    }

    val my_list: List[Int] = List(1, 2, 5, 6, 7);
    val names: List[String] = List("Max", "Tom", "JOhn");


}
