fun main() {
    var number1 = 0
    var number2 = 0
    var operation: Char = '+'


    println("please add you1 ")
    number1 = readLine()!!.toInt()

    println("please add your next")
    number2 = readLine()!!.toInt()

    println("please add your operation")
    operation = readLine()!!.single()

when(operation){
    '+' -> add(number1,number2)
        '-' -> add2(number1 , number2)
         '*' -> add3(number1 , number2)
          '/' -> add4(number1 , number2)



}



}


fun add(num1: Int, num2: Int) {
    println("$num1+$num2=${num1 + num2}")

}

fun add2(num1: Int, num2: Int) {
    println("$num1-$num2=${num1 - num2}")
}

fun add3(num1: Int, num2: Int) {
    println("$num1*$num2=${num1 * num2}")
}

fun add4(num1: Int, num2: Int) {
    println("$num1/$num2=${num1 / num2}")
}
