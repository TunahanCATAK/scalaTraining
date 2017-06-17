

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    val n = sc.nextInt();
    
    for ( i <- 0 to n-1){
      var tmp = sc.next()
      var oddString: String = null
      var evenString: String = null
      for (j <-0 to tmp.length()){
        if (j % 2 == 0)
          evenString += tmp(j)
        else 
          oddString += tmp(j)
      }
      println(evenString + " " + oddString)
      
    }
  }
}