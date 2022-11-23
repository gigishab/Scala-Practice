object sets {

  object sets {
    var my_set: Set[Int] = Set(1, 2, 5, 6, 7, 4, 4);
    val my_set2: Set[Int] = Set(4, 5, 6, 5, 45, 4, 564)
    val names: Set[String] = Set("Max", "Tom", "JOhn");

    def main(args: Array[String]): Unit = {
      println(my_set + 10)
      println(my_set(8)) // check presence of 8
      println(my_set.head)
      println(my_set.tail)
      println(my_set.isEmpty)
      println(my_set ++ my_set2)
      println(my_set.++(my_set2)) //union

      println(my_set.&(my_set2)); //intersection
      println(my_set.intersect(my_set2))
      println(my_set.min)
      println(my_set2.max)
      my_set.foreach(println)

      for (name <- names) {
        println(name)
      }
    }
  }


