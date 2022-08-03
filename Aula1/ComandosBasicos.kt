fun main() {
    /**
    * Comando `println()` é utilizado para imprimir um valor na linha de comando
    **/
    println("Hello world!")
    println("Este texto \"quebra\" em \nduas linhas ")
    println("Nota: \t 10")

    /**
     * Criação de duas variáveis utilizando a inferência de tipo automática,
     * onde a variável 'endereco' é uma String, enquanto a 'número' é do tipo Int
     **/
    val (endereco, numero) = Pair("Avenida Paulista", 250)
    println(endereco)
    println(numero)
}