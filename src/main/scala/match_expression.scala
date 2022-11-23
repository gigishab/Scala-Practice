class match_expression {

  object match_expression {
    def main(args: Array[String]): Unit = {
      val age1 = "50";
      age1 match {
        case "20" => println(age1 + 1);
        case "18" => println(age1 + 2);
        case "30" => println(age1 + 3);
        case "40" => println(age1 + 4);
        case "50" => println(age1 + 5);

        case _ => println("default")

      }
      val result1 = age1 match {
        case "20" => age1 + 1;
        case "18" => age1 + 2;
        case "30" => age1 + 3;
        case "40" => age1 + 4;
        case "50" => age1 + 5;

        case _ => "default"
      }
      println(result1)

      val i = 70;
      i match {
        case 1 | 3 | 5 | 7 | 9 => println("odd")
        case 2 | 4 | 6 | 8 | 10 => println("even")
        case _ => println("not btw range")
      }
    }
  }


