
fun main() {


}


/*

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