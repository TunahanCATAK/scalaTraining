

object Solution {
  def main(args: Array[String]) = {
    val sc = new java.util.Scanner (System.in)
    val n = sc.nextInt()
    var phoneBook : Map[String, String] = Map()
    
    for (i <- 0 until n){
      var person = sc.next()
      var number = sc.next()
      
      phoneBook += (person -> number)      
    }
    
    var _name:String = ""
    do {
      _name = sc.next()
      if (phoneBook.contains(_name))
        println(_name + "=" + phoneBook(_name))
      else 
        println("Not found")
    } while(_name != "")
  }
}