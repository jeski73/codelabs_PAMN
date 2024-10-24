fun main() {
    val a = 10
    val b = 5
    val c = 8
    
    val xAdd = add(a, b)
    val yAdd = add(a, c)

    println("$a + $b = $xAdd")
    println("$a + $c = $yAdd")
    
    val xSubstract = substract(a,b)
    val ySubstract = substract(a,c)
    
    println("$a - $b = $xSubstract")
    println("$a - $c = $ySubstract")
    
}

fun add(a: Int, b: Int): Int {
    return a + b
}


fun substract(a: Int, b: Int): Int {
    return a - b
}
