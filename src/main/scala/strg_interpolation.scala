object strg_interpolation {

  def main(args: Array[String]): Unit = {
    val name = "shab"
    val age = 32
    println(name + " " + age)
    println(s"$name is $age years old")
    println(f"$name%s is $age%d years old")
    println(s"Hello \nWorld")
    println(raw"Hello \n world")

  }

}
