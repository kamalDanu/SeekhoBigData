object Question12 {
  def main(args: Array[String]): Unit = {
    val start = scala.io.StdIn.readInt()
    val end = scala.io.StdIn.readInt()
    var count = 0
    for(num<- start to end){
      if(num%2==0){
        count +=1
      }
    }
    println(count)

  }

}
