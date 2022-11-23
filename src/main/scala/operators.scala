object operators {
  // Scala program to demonstrate
  // the Operators

  // Creating object
  object Geeks {

    // Main method
    def main(args: Array[String]) {


      // Operands
      var a = 10;
      var b = 4;
      var c = true;
      var d = false;
      var result = 0;

      // using arithmetic operators
      println("Addition is: " + (a + b));
      println("Subtraction is: " + (a - b));

      // using Relational Operators
      if (a == b) {
        println("Equal To Operator is True");
      }
      else {
        println("Equal To Operator is False");
      }

      // using Logical Operator 'OR'
      println("Logical Or of a || b = " + (c || d));

      // using Bitwise AND Operator
      result = a & b;
      println("Bitwise AND: " + result);

      // using Assignment Operators
      println("Addition Assignment Operator: " + (a += b));


      //object bom {
      //def main(args: Array[String]): Unit = {
      //println("hello world")
      //}
      //println("hello\n world")

      //println("hello\t wporld")

      //}


      object VAR {
        // var myVar: Int = 60 //var value we can change anytime
        // val myVar1 : String = "vijay" //val value can never be change (constant value)
        // myvar

      }


      object VAR {
        var (myVar: Int, myVar1: String) = pair(40, "vijay")

      }

      //package scalaPractice
      //package scalaPractice

      object Practise_4_11_2022 {

        def main(args: Array[String]): Unit = {

          //Scala -Options Type
          val lst = List(1, 2, 3, 5, 7, 10, 13);
          val mymap = Map(1 -> "Tom", 2 -> "Max", 3 -> "John");
          val opt: Option[Int] = Some(55);

          println("//Scala -Options Type")
          println(lst.find(_ > 2).getOrElse(0));
          println(mymap.get(5).getOrElse("No name found"));

          println(opt.isEmpty);
          println(opt.get);


          //Scala - map and filter
          println("\n");
          println("//Scala - map and filter")
          println(lst.map(x => x * 2));
          println(lst.map(x => x / 0.2));
          println(lst.map(x => "hi" + x));
          println(lst.map(x => "hi" * x));
          println(mymap.map(x => "hi" + x));
          println(mymap.mapValues(x => "hi" + x));
          println("hello".map(_.toUpper));
          println(List(List(1, 2, 3), List(3, 4, 5)).flatten); //flatten list content
          println(lst.flatMap(x => List(x, x + 1)));

          println(lst.filter(x => x % 2 != 0));


          // reduce,fold or scan
          println("\n");
          println("// reduce,fold or scan")
          val lst1 = List(1, 2, 3, 5, 7, 10, 13);
          val lst2 = List("A", "B", "C");
          println(lst1.reduceLeft(_ + _));
          println(lst2.reduceLeft(_ + _));
          println(lst1.reduceLeft((x, y) => {
            println(x + ",  " + y);
            x + y;
          }));

          println(lst1.reduceLeft(_ - _));
          println(lst1.reduceRight(_ - _));
          println(lst1.reduceRight((x, y) => {
            println(x + ",  " + y);
            x - y;
          }));


          println(lst1.foldLeft(100)(_ + _));
          println(lst2.foldLeft("z")(_ + _));


          println(lst1.scanLeft(100)(_ + _));
          println(lst2.scanLeft("z")(_ + _));


          // Class
          println("\n");
          println("// Class")
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
          // class User(val name : String, val age : Int) //Immutable

          var user = new User("Max", 28);
          user.printName;
          //println(user.name);
          println(user.age);

          // Auxiliary constructors
          println("\n");
          println("// Auxiliary constructors")

          var user1 = new User("Max", 28);
          var user2 = new User();
          var user3 = new User("Max");

          // How To Extend Class - Class Inheritance
          println("\n");
          println("// How To Extend Class - Class Inheritance")

        }
      }
