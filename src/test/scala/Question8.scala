object Question8 {
  def main(args: Array[String]): Unit = {
    val a = 251
    val b = 51


    for (num <- a to b by -1) {
      if(num%2!=0){
        println(num)
      }
    }



  }
}
