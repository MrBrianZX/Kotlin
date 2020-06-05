fun main(){
    fibonacci(18)
}

fun fibonacci(pos:Int){
    var valor = 0; var aux:Int; var valorSiguiente = 1; var i = 0
    while (i <= pos){
        println("$valor, ")
        aux = valorSiguiente
        valorSiguiente += valor
        valor = aux
        i++
    }
}