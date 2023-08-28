object Question8 {
  def main(args: Array[String]): Unit = {
    var a = 0
    val num = 250 to 550
    for (a <- num
         if a % 11 == 0) {
      println(a)

    }
  }
}
