

object Solution {
  def main(): Unit = {
    var mealCost = 0.0
    var tip = 0
    var tax = 0
    
    mealCost = scala.io.StdIn.readDouble();
    tip = scala.io.StdIn.readInt();
    tax = scala.io.StdIn.readInt();
    
    val totalCost = Math.round(((mealCost * (100 + tip) / 100) * (100 + tax) / 100));
    
    println("The total meal cost is " +  totalCost + " dollars.");
  }
}