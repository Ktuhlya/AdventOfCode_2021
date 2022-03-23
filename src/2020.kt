import java.io.File
import kotlin.math.pow

class Stars2020 {
    val newLine = System.lineSeparator()
    val input = File("src/input.txt")
    val fielda = input.readText().trim().split("$newLine$newLine")


    fun main() {
        val myBubet = fielda.map { it.split(newLine).toSet() }
         val yopt = myBubet.map {it.map { it1-> it1.toSet() } }
    println(yopt.sumOf {  it.reduce { acc, sets -> (acc intersect sets) }.count()})
}

}

    /*

       val groups: List<String> = File("src/input.txt")
            .readText()
            .trim()
            .split("$newLine$newLine")

        val firstAnswer = groups.sumOf {
            it.replace(newLine, "").toSet().size
        }



    /////
    val seatsList = mutableListOf<Int>()

    fun main() {
        for (i in fielda.indices) seatsList.add(fielda[i].replace('F','0')
            .replace('B', '1')
            .replace('L', '0')
            .replace('R', '1').toInt(radix = 2))
        seatsList.sort()
        println(seatsList.maxOrNull())
        println(seatsList[seatsList.find { it-> (seatsList[it]+1 != seatsList[it+1])}!!]+1)
    }
}

*/

   /*     val row=bitString.substring(0..6).toList().map { it.toString().toInt() }.reversed()
            .forEachIndexed { index, i -> gf.add(i.toDouble().pow(index).toInt())  }

        val seat=bitString.substring(7).toList().map { it.toString().toInt() }.reversed()
            .forEachIndexed { index, i -> gf.add(i.toDouble().pow(index).toInt())}

        return (gf.subList(0,7).sum()*8 + gf.subList(7,gf.lastIndex).sum() )

    }


}

    */


/*
/////
    val omicronList = listOf("byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid",/*"cid"*/)

    fun main() {
        val pasportus = input.readText().split(Regex("\\s\\s+"))
         println(pasportus.count{it1 -> omicronList.all { it in it1 }})

        println(pasportus.count { it ->
            omicronList.all { it1 -> it1 in it }
                    && eyaqule(it.strToMap())
        })


    }


    fun eyaqule(map: Map<String, String>): Boolean =
        map.all { (key, value) ->
            when (key) {
                "byr" -> value.length == 4 && value.toIntOrNull() in 1920..2002
                "iyr" -> value.length == 4 && value.toIntOrNull() in 2010..2020
                "eyr" -> value.length == 4 && value.toIntOrNull() in 2020..2030
                "pid" -> value.length == 9 && value.all(Char::isDigit)
                "ecl" -> value in setOf("amb", "blu", "brn", "gry", "grn", "hzl", "oth")
                "hgt" -> when (value.takeLast(2)) {
                    "cm" -> value.removeSuffix("cm").toIntOrNull() in 150..193
                    "in" -> value.removeSuffix("in").toIntOrNull() in 59..76
                    else -> false
                }
                "hcl" -> value matches """#[0-9a-f]{6}""".toRegex()
                else -> true
            }

        }





    fun String.takeNames(): List<String> {
      return this.split(" ").map{ it.replaceAfter(":","") }
          .map { it.removeSuffix(":") }

}
    fun String.strToMap(): Map<String, String> {
        val myMap = mutableMapOf<String,String>()
        this.split(" ").
        forEach{myMap.put(it.substringBefore(":"),it.substringAfter(":")) }
        return myMap.toMap()

    }
}

 */

    /*
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

/////
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
