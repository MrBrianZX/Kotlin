fun main(){
    val a = 5
    val b = 3
    val c = -12
    println("Los numeros $a, $b, $c, cumplen con las condiciones:")
    println("A: "+ (a > 3))
    println("B: "+(a > b))
    println("C: "+ (a < c))
    println("D: "+ (c < b))
    println("E: "+ (b != a))
    println("F: "+ (a == 8))
    println("G: "+ (b * c == 18))
    println("H: "+ (a * b == -30))
    println("I: "+ (c / b < a))
    println("J: "+ (c / b == -11))
    println("K: "+ (c / b == -4))
    println("L: "+ (a + c + b == 5))
    println("M: "+ ((a+b == 8) && (a-b == 2)))
    println("N: "+((a+b == 8) || (a-b == 6)))
    println("O: "+ (a > 3 && b > 4 && c < 3))
    println("P: "+ (a > 3 && b >= 3 && c < -3))
}