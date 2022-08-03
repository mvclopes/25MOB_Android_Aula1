fun main() {
    /**
     * O tipo primitivo String permite acessar seus caracteres, bem como possui
     * métodos de manipulação (Ex.: substring, isEmpty)
     **/
    val biggestString = "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
    println(biggestString[0])
    println(biggestString[5])
    println(biggestString[10])
    println(biggestString.isEmpty())
    println(biggestString.length)
    println(biggestString.substring(0,10))
}