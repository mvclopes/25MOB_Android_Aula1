fun main() {
    helloWorld()
    printName("Matheus")
}

/**
 * Criação de funções privadas (visíveis apenas para a própria classe)
 * que imprimem determinadas mensagens, de modo a tornar tal trecho de código
 * reutilizável
 **/
private fun helloWorld() {
    println("Hello World!")
}

private fun printName(name: String) {
    println("Name: $name")
}