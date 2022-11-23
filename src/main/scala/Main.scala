// Scala program to print Hello World

// Creating object
object Main {

  // Main method
  def main(args: Array[String])
  {

    // prints Hello, world!
    println("Hello, World!")


    // Scala program to demonstrate
    // the Operators

    // Creating object
    object Geeks {

      // Main methods
      def main(args: Array[String]) {


        // Operands
        var a = 10;
        var b = 4;
        var c = true;
        var d = false;
        var result = 0;

        // using arithmetic operators
        println ("Addition is: "+ (a + b) );
        println ("Subtraction is: "+ (a - b) ) ;

        // using Relational Operators
        if (a == b)
        {
          println ("Equal To Operator is True");
        }
        else
        {
          println ("Equal To Operator is False");
        }

        // using Logical Operator 'OR'
        println("Logical Or of a || b = " + (c || d));

        // using Bitwise AND Operator
        result = a & b;
        println ("Bitwise AND: " + result );

        // using Assignment Operators
        println ("Addition Assignment Operator: " + (a += b) );

      }
    }


  }
}