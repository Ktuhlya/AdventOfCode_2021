import java.io.File
import java.math.BigInteger

class Stars2020 {

    val input = File("src/334.txt")
    val fielda = input.readLines()
    private fun solve(field: List<String>, vector: Pair<Int, Int>): Int {
        val (dx, dy) = vector
        val width = field[0].length
        return field.indices.count { y ->
            y % dy == 0 && field[y][y * dx / dy % width] == '#'
        }
    }

    fun main() {
        val field = File("src/input.txt").readLines()
        println(solve(field, 3 to 1))
        val vectors = listOf(1 to 1, 3 to 1, 5 to 1, 7 to 1, 1 to 2)
        println(vectors.map { solve(field, it).toBigInteger() }.reduce { a, b -> a * b })
    }
}

    /*
    var count: Int = 0
    val widg = input.readLines()[0].length
    val slyMap = listOf(1 to 1, 3 to 1, 5 to 1, 7 to 1, 1 to 2 )
    val countList = mutableListOf<BigInteger>()
    val hegt = input.readLines().lastIndex

    fun main() {
        for (i in slyMap.indices){
            for (y in fielda.indices) {
                if (fielda[y*slyMap[i].second][y *slyMap[i].first/slyMap[i].second  % widg] == '#')
                    count++.toBigInteger()
                if (y*slyMap[i].second +1 > hegt) break
            }
            countList.add(count.toBigInteger())
            count = 0
        }
        println(countList)
            println(countList.reduce { acc, i ->acc*i  })
        }
    }


     */



//if (fielda[u * y][y * t % widg] == '#') count++




     /*
     import java.io.File
import java.lang.reflect.Type


fun main() {

    var count = 0
    for (str in input.readLines()) if (checkContains(str)) count += 1
    println(count)

}
     fun String.mySplit(): List<String> {
         val min = this.substringBefore("-")
         val max = this.substringBefore(" ").substringAfter("-")
         val leter = this.substringBefore(":").substringAfter(" ")
         val passw = this.substringAfterLast(" ")
        return listOf(min,max,leter,passw)
     }

     private fun checkContains(str: String): Boolean {
         if ((str.mySplit()[3][str.mySplit()[0].toInt()-1].toString() == str.mySplit()[2])
             xor (str.mySplit()[3][str.mySplit()[1].toInt()-1].toString() == str.mySplit()[2])) return true
         if ((str.mySplit()[3][str.mySplit()[0].toInt()-1].toString() == str.mySplit()[2])
             xor (str.mySplit()[3][str.mySplit()[1].toInt()-1].toString() == str.mySplit()[2])) return true
         return false


     }


 }
*/


//////////////////////////
/*
 val input: File = File("src/input.txt")
     val inList = input.readLines().toList().map { it.toInt() }
    fun main () {
        ihnyaya(2020)

   /*   println((inList.sumOfTwo(2020).first) * inList.sumOfTwo(2020).second )
       println(inList.sumOfThree(2020).first.toLong() *
               inList.sumOfThree(2020).second.toLong()*inList.sumOfThree(2020).third.toLong())
        println(inList.sumOfThree(2020))


    */
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
fun ihnyaya(sum: Int): Pair<Int,Int> {
    val myMap =  inList.associateBy { sum-it }
    println(myMap)
  myMap.keys.forEach { if (inList.contains(it)) println(it) }
    return Pair(0,0)
}

 */
