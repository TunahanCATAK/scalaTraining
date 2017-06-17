
object Solution {
    def main() :Unit = {
        val i = 4
        val d = 4.0
        val s = "HackerRank "
        // Read values of another integer, double, and string variables
        // Note use scala.io.StdIn to read from stdin
        val _int = scala.io.StdIn.readInt()
        val _double = scala.io.StdIn.readDouble()
        val _string = scala.io.StdIn.readLine()
        
        // Print the sum of both the integer variables
        println(i+_int)
        // Print the sum of both the double variables
        println(d+_double)
        
        // Concatenate and print the string variables
        // The 's' variable above should be printed first.
        println(s + _string)
    }
}