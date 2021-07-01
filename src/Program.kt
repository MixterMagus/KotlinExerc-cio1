

fun main(){

    println("hello word")
    println(homeMenu())

}

fun homeMenu(){
println("--------------------------------------------------------")
println("Choose an option:")
println("1 - Sum \n2 - Subtraction\n3 - Multiply\n4 - Division")
    var option = readLine()!!.toInt()
println("Enter two numbers:")
println("Number One:")
    var one = readLine()!!.toFloat()
println("Number Two:")
    var two = readLine()!!.toFloat()
when(option) {
    1 -> sum(one,two)
    2 -> subtraction(one,two)
    3 -> multiply(one,two)
    4 -> division(one,two)
    else -> homeMenu()
}
}

fun sum(one:Float,two:Float){
    var result=one+two
    println("O resultado é $result")
}

fun subtraction(one:Float,two:Float){
    var result:Float
    if(one<two) {
        result = two-one
    }else result = one-two
    println("O resultado é $result")
}

fun multiply(one:Float,two:Float){
    var result=one*two
    println("O resultado é $result")
}

fun division(one:Float,two:Float){
    var result:Float
    if(one<two) {
        result = two/one
    }else result = one/two
    println("O resultado é $result")
}
