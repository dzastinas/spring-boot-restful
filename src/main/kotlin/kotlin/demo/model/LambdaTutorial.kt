package kotlin.demo.model

class LambdaTutorial {

    val sumLambda: (Int, Int) -> Int = {x,y -> x+y}
    val actualSum = sumLambda(3,4)
    val result1 = doubleTheResult(3, 4, sumLambda)
    val result2 = doubleTheResult(3, 4, {x,y -> x+y})
    val numbers:Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val squaredNumbers = numbers.map({x -> x * x})
    val r1 = 1..5
    val r2 = 5 downTo 1
    val r3 = 5 downTo 1 step 2

    fun doubleTheResult(x:Int, y:Int, f:(Int, Int)->Int): Int {
        return f(x,y) * 2
    }

    val names = arrayOf("Jake", "Jill", "Ashley", "Bill")

    fun printLoop() {
        for (name in names) {
            println(name)
        }

        for (i in 0..9) {
            println(i)
        }

        var i = names.size

        while(i>0) {
            println(names[--i])
        }
    }

    fun SpringUtils() {
        val name = "Bob"
        println("My name is ${name}") // Prints "My name is Bob"

        val a = 10
        val b = 20
        println("The sum is ${a+b}") // Prints "The sum is 30"
    }

}