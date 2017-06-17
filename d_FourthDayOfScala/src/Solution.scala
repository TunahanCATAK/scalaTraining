import com.sun.org.apache.xpath.internal.operations.Bool


object Solution {
  def main(args: Array[String]): Unit = {
      val sc = new java.util.Scanner (System.in);
      var N = sc.nextInt();
      
      if (isOdd(N))
      {
        println("Weird");
      }
      else 
      {
        if (N < 5)
        {
          println("Not Weird");
        }
        else if (N < 20)
        {
          println("Weird");
        }
        else 
        {
          println("Not Weird");
        }
      }

  }
  
  def isOdd(x: Int): Boolean = {
    if ((x % 2) == 0)
      return false;
    else return true;
  }
}