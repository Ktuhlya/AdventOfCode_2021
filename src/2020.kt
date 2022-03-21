import java.io.File
 class Stars2020 {
    val input: File = File("src/input.txt")

    fun main () {
val inList = input.readLines().toList().map { it.toInt() }
      println((inList.sumOfTwo(2020).first) * inList.sumOfTwo(2020).second )
       println(inList.sumOfThree(2020).first.toLong() *
               inList.sumOfThree(2020).second.toLong()*inList.sumOfThree(2020).third.toLong())
        println(inList.sumOfThree(2020))

    }
     fun List<Int>.sumOfTwo(sum: Int): Pair<Int,Int> {
         for (i in this.indices) {
             for (j in 1.. this.lastIndex-i)
                 if (this[i] + this[i+j] == sum) return Pair(this[i], this[i+j])
         }
         return Pair(0,0)
     }

     fun List<Int>.sumOfThree(sum: Int): Triple<Int,Int,Int> {
         for (i in this.indices) {
             for (j in 1..this.lastIndex - i) {
                 for (t in 2..this.lastIndex - i) {
                     if (this[i] + this[i+j] + this[i+t] == sum) return Triple(this[i], this[i+j], this[i+t])
                 }
             }
         }
         return Triple(0,0,0)
     }







}
