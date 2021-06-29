
//Uma classe é uma descrição dos ATRIBUTOS e COMPORTAMENTOS
class Pessoa (
    val nome: String,
    val idade: Int,
    val isCasado: Boolean
)

//Objetos são instancias de classes
fun main(){

    //Na instancia do objeto declaramos o NOME da variével primeiro,
    //depois o TIPO, que então recebe o VALOR e seus ATRIBUTOS.

    //    VAR     TIPO     VALOR         PROPRIEDADES
    val pessoa1: Pessoa = Pessoa("Beto", 22, false)

    //  --VAR--   -VALOR-      ----PROPRIEDADES-----
    val pessoa2 = Pessoa("Guilherme", 14, false)

    println("Pessoa1: ${pessoa1.nome}")
    println("Pessoa2: ${pessoa2.nome}")
}