object options_type {
  val lst = List(1, 2, 3);
    val map = Map(1 -> "Tom", 2 -> "Max", 3 -> "JOhn")

    def main(args: Array[String]): Unit = {
      println(lst)
      println(map.get(5).getOrElse("No name found"))
      println(lst.find(_ > 2).get);
    }


  }
}
