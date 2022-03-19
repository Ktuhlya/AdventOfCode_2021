import java.io.File

val input = File("src/input.txt")
var result = 0

fun main() {
    for (i in input.readLines().indices) findCode(input.readLines()[i])
    println(result)

}

fun findCode(str: String) {
    val codeList = mutableListOf<String>()
    val codeExList = str.substringAfter(" | ").split(" ").toMutableList()
    val tempList = listOf(2,3,4,7)
      str.substringBefore(" | ").split(" ").forEach { if (it.trim().length in tempList)
          codeList.add(it)
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