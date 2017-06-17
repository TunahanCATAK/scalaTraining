

object Solution {
  def main(args: Array[String]) = {
    val sc = new java.util.Scanner (System.in)
    val n = sc.nextInt()
    var ar : Array[Int] = new Array[Int](n)
    
    for (i <- 0 to n -1 ){
      ar(i) = sc.nextInt()
    }
    
    for (i <- 0 until n){
      print(ar((n-1)-i))
      print(" ")
    }
  }
}