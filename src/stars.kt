import java.io.File

const val SHINY_GOLD ="shinygold"

val input = File("src/334.txt")
val pairList= listOf(Pair('{', '}'), Pair('[', ']'), Pair('<', '>'), Pair('(', ')'))
val openList = listOf('{', '[', '<', '(')
val closeList = listOf('}', ']', '>', ')')
val tempList = mutableListOf<Char>()
fun main() {
    Stars2020().main()
}
    /*
for (i in input.readLines().indices) {
    tempList.clear()
    input.readLines()[i].forEach { tempList.add(it) }
    checkVaal(tempList)
}

  //  println(checkVaal(tempList[i]))
}
*/
fun checkVaal(tempList: MutableList<Char>) {
     var ind = 0

println(tempList.joinToString(","))

    for (i in tempList.indices) {
        if ( closeList.contains(tempList[i])) {
           ind = closeList.indexOf(tempList[i])
            if (tempList[i-1] != openList[ind] ){
                egeshesh(tempList[i-1])
                tempList.clear()
                tempList.clear()
                return


            }else{
                if (i == tempList.lastIndex) return
                tempList.removeAt(i).also { tempList.removeAt(i-1) }

                if (i>=tempList.lastIndex) return
              // checkVaal(tempList)
            }
        }
    }


}

fun egeshesh(ch: Char) {
    println(ch)
  //  checkVaal()

}


///////////////////

/*import java.io.File

val input = File("src/334.txt")
var result = 0

var count = 0

fun main() {

    for (y in input.readLines().indices) {

       for (x in input.readLines()[y].indices) {
          result  += findPit(x, y)
            println(findPit(x,y))
        }
    }

    println(result)
}

fun findPit(x: Int, y: Int): Int {
    val point = input.readLines()[y][x].toString().toInt()
 //   println("Point $point")
    val nearb1 = if (y-1 >= 0) input.readLines()[y-1][x] else 99
    val nearb2 = if (x-1 >= 0) input.readLines()[y][x-1] else 99
    val nearb3 = if (y+1 <= input.readLines().lastIndex) input.readLines()[y+1][x] else 99
    val nearb4 = if (x+1 <= input.readLines()[y].lastIndex) input.readLines()[y][x+1] else 99
    val nearbList = listOf(nearb1, nearb2, nearb3,nearb4).map { it.toString().toInt() }
    nearbList.forEach{if (it <= point) return 0}
 return   openCell(x,y)


  //  println(point)
  //  println("$nearb1,$nearb2,$nearb3,$nearb4")



}

fun basinsSq(x: Int, y: Int): Int {
    val count = 0


    return count
}

fun openCell(x: Int, y: Int): Int {
    println(input.readLines()[y][x])
    if (input.readLines()[y][x] != '9') {
        count += 1
    } else if (y - 1 in 0 until 9) {
        if (y - 1 in 0 until 9) {
            if (x - 1 in 0 until 9) {
                if (input.readLines()[y - 1][x - 1] != '9')
                    openCell(x - 1, y - 1)
        }
        if (input.readLines()[y - 1][x] != '9')
            openCell(x, y - 1)
        if (x + 1 in 0 until 9) {
            if (input.readLines()[y - 1][x + 1] != '9')
                openCell(x + 1, y - 1)
        }
    }
    if (y + 1 in 0 until 5) {
        if (x - 1 in 0 until 9) {
            if (input.readLines()[y + 1][x - 1] != '9')
                openCell(x - 1, y + 1)
        }
        if (input.readLines()[y + 1][x] != '9')
            openCell(x, y + 1)
        if (x + 1 in 0 until 9) {
            if (input.readLines()[y + 1][x + 1] != '9')
                openCell(x + 1, y + 1)
        }
    }
    if (x - 1 in 0 until 9 && input.readLines()[y][x - 1] != '9')
        openCell(x - 1, y)
    if (x + 1 in 0 until 9 && input.readLines()[y][x + 1] != '9')
        openCell(x + 1, y)

} else {
        return count
    }
    return  count
}

 */





///////////////
/*
import java.io.File

val input = File("src/input.txt")
var result = 0
var digitMap = mutableMapOf<Int,String>(0 to "", 1 to "", 2 to "", 3 to "",
    4 to "", 5 to "", 6 to "", 7 to "", 8 to "", 9 to "")

fun main() {

    for (i in input.readLines().indices) {

        findCode(input.readLines()[i])
      //  println(digitMap)
    }
    println(result)

}


fun findCode(str: String) {
    // digitMap = mutableMapOf<Int,String>(0 to "", 1 to "", 2 to "", 3 to "",
      //  4 to "", 5 to "", 6 to "", 7 to "", 8 to "", 9 to "")

    val codeList = str.substringBefore(" | ").split(" ").toMutableList()
    val codeExList = str.substringAfter(" | ").split(" ").toMutableList()
    val tempList = listOf(2, 3, 4, 7)

    var count = 0

    codeExList.map { it.trim() }
    codeList.map { it.trim() }

    codeList.forEach {
        if (it.length in tempList) {

            when (it.trim().length) {
                7 -> digitMap[8] = it.trim()
                2 -> digitMap[1] = it.trim()
                3 -> digitMap[7] = it.trim()
                4 -> digitMap[4] = it.trim()
            }
        }
    }

    for (i in codeList.indices) {
        //find 9 and 0 and 6
        if (codeList[i].length == 6) {
            count = 0
            for (j in digitMap[4]?.indices!!) if (codeList[i].contains(digitMap[4]!![j])) count += 1
            if (count == 4) {
                digitMap[9] = codeList[i]

            } else {
                count = 0
                for (j in digitMap[7]?.indices!!) if (codeList[i].contains(digitMap[7]!![j])) count += 1
                if (count == 3) {
                    digitMap[0] = codeList[i]
                } else digitMap[6] = codeList[i]
            }
        }
    }
    for (i in codeList.indices) {
        //find 3
        if (codeList[i].length == 5) {
            count = 0
            if ((codeList[i].contains(digitMap[1]?.substring(0, 1).toString()))
                && (codeList[i].contains(digitMap[1]?.substring(1).toString()))
            )
                digitMap[3] = codeList[i] else {
                count = 0
            }
        }
        /// find pyat', blyat' and dva blya
    }
    for (i in codeList.indices) {
        if ((codeList[i].length ==5) &&(codeList[i] != digitMap[3])) {
            count = 0
            for (t in codeList[i].indices){
                if (digitMap[6]?.contains(codeList[i][t])!!) count +=1
            }
            println("COUNT $count")
            if (count == 5) digitMap[5] = codeList[i]
            if (count == 4) digitMap[2] = codeList[i]

        }

    }




  //  println(codeExList)
   var tempDigit = ""
    for (i in codeExList.indices){
         tempDigit += findDigit(codeExList[i], digitMap)
    }
    result+=tempDigit.toInt()

    println(digitMap)
    println(codeExList)
    println(tempDigit.toInt())

    codeExList.clear()
    codeList.clear()
    count = 0
    tempDigit=""


}

fun findDigit(str: String, digitMap: MutableMap<Int, String>): String {
    var countD = 0
    var digit = ""
    for (key in 0..9) {
        str.forEach { if(digitMap[key]?.contains(it)!!) countD+=1 }
       // println(countD)
        if ((countD == digitMap[key]?.length) && (countD == str.length)) {
           // println(countD)
            digit = key.toString()
            countD =0
        } else countD=0
    }

    return digit
}


 */

////////
/*
      }
          }

        for (i in codeExList.indices) {
           if (myShufle(codeExList[i], codeList)) result += 1
        }
    println(codeExList)
    println(codeList)
    codeList.clear()
    codeExList.clear()

}


fun myShufle(str: String, codeList: MutableList<String>): Boolean {
    var count = 0
    val shufList = mutableListOf<String>()
    for (i in codeList.indices) {
        if (codeList[i].length ==str.length ) {
            for (j in str.indices) {
                if (str[j] in codeList[i]) {
                    count+=1
                }
            }
        }
    }
    return  (count==str.length)
}

 */


/*
///////////////////////

import java.io.File
import java.lang.Math.abs

val input = File("src/input.txt")
val posList = input.readLines()[0].split(",").map { it.toInt() }.toMutableList()


fun main() {
    var tiripiri = 100000000
    var mxValue = 0
    for (i in posList.indices) {
        if (posList[i] > mxValue) mxValue = posList[i]
    }
    for (v in 1..mxValue){

       if (fuelOut( v) < tiripiri) {
           tiripiri = fuelOut(v)


   }
    }
    println(tiripiri)

}

fun fuelOut(ind: Int): Int {
    var step = 0
    var fuel = 0
    for (i in posList.indices ) {
        fuel +=  myFactorial(abs(posList[i] - ind))
    }

    return fuel
}
fun myFactorial(value: Int): Int {
      var res = 0
    for (i in 0 until value) {
        res += 1+i
    }

    return res
}


///////////////////////
import java.io.File

val input = File("src/input.txt")

fun main() {

    var fishList = input.readLines()[0].split(",").map { it.toInt() }.toMutableList()

    repeat(256){ iteration(fishList)}
    println(fishList.size.toLong())
   //  println(fishList.joinToString(","))
}

fun iteration(fishList: MutableList<Int>) {
  for (i in fishList.indices) {
      fishList[i] -=1
  }
    checkNewFish(fishList)
}

fun checkNewFish(fishList: MutableList<Int>) {
    var count: Long =0
    for (i in fishList.indices){
        if (fishList[i] == -1){
            fishList[i] = 6
            count += 1
        }
    }
    for (i in 1..count){
        fishList.add(fishList.lastIndex+1,8)
    }
  //  repeat(count){fishList.add(fishList.lastIndex+1,8)}
   // iteration(fishList)
}



///////////////////////////////

import java.io.File

val input = File("src/input.txt")
val listM = mutableListOf<Pair<Pair<Int,Int>,Pair<Int,Int>>>()
val karta : MapOfClouds = MapOfClouds(input)
var mainCount = 0
var fullMap =0
var oneCount = 0
var zeroCount = 0

fun main() {

    input.readLines().forEach { karta.draw(it) }
   // for (i in input.readLines().indices) karta.draw(input.readLines()[i])
   //     karta.print()
    karta.countDanger()
    println("$mainCount / $oneCount / $zeroCount /// $fullMap")


}



 class MapOfClouds(input: File) {
      var row = mutableListOf<MutableList<Int>>()

     init {
         row = MutableList(1000) { MutableList(1000) { 0 } }
     }

     fun print() {
         row.forEach { println(it.joinToString(" ")) }
     }

     fun draw(str: String) {

                 if (str.myDeskartes("x1") == str.myDeskartes("x2")) {
                     for (i in str.myDeskartes("y1")..str.myDeskartes("y2")) {
                         //  if (this.row[i][str.myDeskartes("x1")] > 0)
                         this.row[i][str.myDeskartes("x1")] +=1
                     }
                 }
                 if (str.myDeskartes("y1") == str.myDeskartes("y2")) {
                     for (i in str.myDeskartes("x1")..str.myDeskartes("x2")) {
                         //    if (this.row[str.myDeskartes("y1")][i] > 0)
                         this.row[str.myDeskartes("y1")][i] +=1
                         // println("Lupa-Pupa!!!")
                     }
                 }

     }

     fun countDanger() {
         for (i in 0 .. 999 ) {
             for (j in 0..999){
                 fullMap += 1
                 if (this.row[i][j] > 1) mainCount += 1
                 if (this.row[i][j] == 1) oneCount += 1
                 if (this.row[i][j] == 0) zeroCount += 1
             }
         }
     }
 }


fun String.myDeskartes(str:String): Int {

     when (str) {
        "x1" -> return this.substringBefore(",").toInt()
        "x2" -> return this.substringBeforeLast(",").substringAfterLast(" ").toInt()
        "y1" -> return this.substringAfter(",").substringBefore(" ").toInt()
        "y2" -> return this.substringAfterLast(",").toInt()
    }
    return 0
}




/////////////////////////

import java.io.File
import kotlin.system.exitProcess

val input = File("src/input.txt")
val listM = input.readLines()[0].split(",").toMutableList()

val boardList = mutableListOf<Board>()

var temptempList = mutableListOf<String>()
var frst = ""
var sec = ""

fun main () {
  //  println(input.readLines()[2].replace( Regex("\\s+"), " "))
//println(input.readLines()[32])
 //println(input.readLines()[2].separateToInt())

    for (i in 2 .. input.readLines().lastIndex step(6)) boardList.add(Board(i))
    chekEre(boardList.size-1)

}
fun chekEre(ostatok: Int) {

    for (j in listM.indices ) {
        var  b = listM[j].toInt()
        for (i in 0..ostatok) {
            boardList[i].mark(b)
            if (boardList[i].bingo()) {
                if (boardList.size > 1){
                    boardList.removeAt(i)
                    chekEre(boardList.size - 1)
                }else{
                    println("Bingo! ...blya in $i")
                    boardList[i].printBoard()
                    println(b)
                    println( boardList[i].winScore(b))
                    exitProcess(0)
                }
            }
        }
    }
}

fun String.separateToInt(): List<Int> {
        val newString =this.trim().replace(Regex("\\s{2}"), " " )
    return newString.split(" ").toList().map { it.toInt() }
}

class Board(lineIndex: Int) {
    private val rowBoard = mutableListOf<MutableList<Int>>()
    val colBoard = mutableListOf<Int>()

    init {
        for (i in 0..4) {
            rowBoard.add(i, input.readLines()[lineIndex + i].separateToInt() as MutableList<Int>)
        }
    }

    fun printBoard() {
        for (i in rowBoard.indices)
            println(rowBoard[i].joinToString(" "))
    }

    fun mark(bocha: Int) {
        for (i in 0..4) {
            for (j in this.rowBoard.indices) {
                if (this.rowBoard[i][j] == bocha) this.rowBoard[i][j] = 101
            }
        }
    }

    fun bingo(): Boolean {
        for (i in 0..4) {
            if ((this.rowBoard[i][0] == 101) && (this.rowBoard[i][1] == 101)
                && (this.rowBoard[i][2] == 101) && (this.rowBoard[i][3] == 101)
                && (this.rowBoard[i][4] == 101)
            ) return true
        }
        for (i in 0..4) {
            if ((this.rowBoard[0][i] == 101) && (this.rowBoard[1][i] == 101)
                && (this.rowBoard[2][i] == 101) && (this.rowBoard[3][i] == 101)
                && (this.rowBoard[4][i] == 101)
            ) return true
        }
        return false
    }

    fun winScore(b: Int): Int {
        var winScore = 0
        for (i in 0..4){
            for(j in 0..4){
                 if (this.rowBoard[i][j] != 101)
                     winScore += this.rowBoard[i][j]
            }

        }


        return  winScore * b
    }

}





/////////

fun temp (indStr: Int, list: MutableList<String>) {
if ((indStr<11) && (list.size >1)) newList(indStr+1, list) else {
    println("frst" +list)
    frst = list[0]
}
}

fun tempSec (indStr: Int, list: MutableList<String>) {
if ((indStr<11) && (list.size > 1)) {
    newListSec(indStr+1, list)
} else {
    println("sec$list")
    sec = list[0]
}
}

fun newList(indStr: Int, list: MutableList<String>) {
  //  println(indStr)

    var tempList = mutableListOf<String>()
        list.forEach { if (it[indStr].toString().toInt() == list.bitRet(indStr)) tempList.add(it) }
    //println(tempList)
    temp(indStr, tempList)
    }

fun newListSec(indStr: Int, list: MutableList<String>) {

    println(indStr)

    var tempList = mutableListOf<String>()
        list.forEach { if (it[indStr].toString().toInt() == list.bitRetSec(indStr)) tempList.add(it) }
    println(tempList)
    tempSec(indStr, tempList)
    }

fun List<String>.bitRet ( indStr: Int, ): Int {
   // println("bitReit indString - $indStr")
    return if ((this.count{it[indStr].toString() == "1"}) >= (this.count { it[indStr].toString() =="0" })) 1
    else 0
}

fun List<String>.bitRetSec ( indStr: Int, ): Int {
   // println("bitReit indString - $indStr")
    return if ((this.count{it[indStr].toString() == "1"}) >= (this.count { it[indStr].toString() =="0" })) 0
    else 1
}

 fun strToBinToDec(str: String): Int {
     var result = 0
     for (i in str.indices) {
        if (str[i].toString() == "1") result += 2.toDouble().pow(str.length-1-i).toInt()
     }
     return result
 }

 */