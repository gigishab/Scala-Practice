object map {
  val mymap: Map[Int, String] =
      Map(801 -> "max", 802 -> "Tom", 804 -> "July")
    val mymap2: Map[Int, String] =
      Map(805 -> "lok", 807 -> "kjom")

    def main(args: Array[String]) {
      println(mymap)
      println(mymap(802))
      println(mymap.keys)
      println(mymap.values)
      println(mymap.isEmpty)

      mymap.keys.foreach { key =>
        println("key: " + key);
        println("Value: " + mymap(key))
      }
      println(mymap.contains(80100))
      println(mymap ++ mymap2)
      println(mymap.size)
    }

  }

}
