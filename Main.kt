import kotlin.math.pow

fun main() {
    Zad1()
    Zad2()
    Zad3()
    Zad4()
}
fun Zad1(){
    try {
        println("введите 1 число")
        var ch1 = readln().toDouble()
        println("введите 2 число")
        var ch2 = readln().toDouble()
        if (ch1 > ch2)
            ch2++
        else
            ch1++
        if (ch1 == ch2)
            println(ch1.pow( 3))
        else
            println("если к минимальному числу добавить 1, то они не станут равными")
      }
    catch(e:Exception){
        println("ошибка")
    }
}
fun Zad2() {
    try {
        println("введите цифру от 0 до 9")
        val x = readln().toInt()
        when (x) {
            0 -> println("ноль")
            1 -> println("один")
            2 -> println("два")
            3 -> println("три")
            4 -> println("четыре")
            5 -> println("пять")
            6 -> println("шесть")
            7 -> println("семь")
            8 -> println("восемь")
            9 -> print("девять")
            else ->
                println("надо было ввести число от 0 до 9")
        }
    } catch (e: Exception) {
        println("ошибка")
    }
}
fun Zad3(){
    try {
        println("введите возраст")
        val x = readln().toInt()

            when (x) {
                in 0..2 -> println("младенец")
                in 3..13 -> println("ребенок")
                in 14..17 -> println("подросток")
                in 18..55 -> println("взрослый")
                in 56..90 -> println("пожилой")
                in 91..123 ->  println("долгожитель")
                else ->
                    println("вы ввели слишком большой возраст")
            }
    } catch (e: Exception) {
        println("ошибка")
    }
}
fun Zad4(){ // вариант 1
    try {
        println("Введите x")
        var x = readln().toDouble()
        if(x<=3)
            x = (x.pow(2))-3*x+9
        else
            x = 1/(x.pow(3)+6)
        println(x)
    }
    catch(e: Exception){
        println("ошибка")
    }
}







