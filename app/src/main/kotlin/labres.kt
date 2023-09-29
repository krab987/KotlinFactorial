
fun main(){
    val a = readln().toInt()
    println(factFor(a))
    println(factRec(a))
}

fun factFor(a:Int):Int{ //function by for
    var factorial = 1

    for (i in 1..a){
        factorial *= i
    }
    return factorial;
}

fun factRec(a:Int):Int{  //recursive function
    if(a == 0)
        return 1;

    return a * factRec(a - 1)
}
