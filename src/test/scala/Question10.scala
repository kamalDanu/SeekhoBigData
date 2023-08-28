object Question10 {
  def main(args: Array[String]): Unit = {
    var a = 0
    val num = 700 to 900
    for (a <- num
         if a % 2 == 0) {
      println(a)

    }
  }
}
