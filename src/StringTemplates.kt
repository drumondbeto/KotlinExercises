fun main() {
    val nome = "Beto"

    // Para fazer um String Template com uma variável, utilizamos "\$"
    println("Hello $nome!")

    //Para uma expressão, ao invés disso usamos "${}"
    println("A soma é: ${soma(10, 20)}")
}

fun soma(a: Int, b: Int): Int {
    return a + b
}