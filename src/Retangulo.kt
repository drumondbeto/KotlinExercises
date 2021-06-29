class Retangulo(val altura: Int, val largura: Int) {

    //Assessor Customizado
    val isQuadrado: Boolean
        get() = altura == largura

    /*  Outras maneiras:

        val isQuadrado: Boolean
            get() {
                return altura == largura
            }

        val isQuadrado
            get() = altura == largura

        fun isQuadrado(): Boolean {
            return altura == largura
        }

     */
}

fun main(){
    val retangulo: Retangulo = Retangulo(10, 5)
    println(retangulo.isQuadrado)
}