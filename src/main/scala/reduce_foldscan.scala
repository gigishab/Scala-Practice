object reduce_foldscan {

  def main(args: Array[String]): Unit = {
    val lst1 = List(1, 2, 3, 5, 7, 10, 13);
    val lst2 = List("A", "B", "C");
    println(lst1.reduceLeft(_ + _));
    println(lst2.reduceLeft(_ + _));
    println(lst1.reduceLeft((x, y) => {println(x + ",  " + y); x + y;}));
    println(lst1.reduceLeft(_ - _));

    println(lst1.reduceRight(_ - _));
    println(lst1.reduceRight((x, y) => {println(x + ",  " + y); x - y;}));

    println(lst1.foldLeft(100)(_ + _));
    println(lst2.foldLeft("z")(_ + _));

    println(lst1.scanLeft(100)(_ + _));
    println(lst2.scanLeft("z")(_ + _));
  }
}
