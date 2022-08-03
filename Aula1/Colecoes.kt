fun main() {
    /**
     * Coleções são tipos que armazenam valores, permitindo realizar operações
     * de manipulação dos dados (Ex.: drop, add, etc)
     **/
    val names = listOf("Matheus", "Fulano", "Ciclano")
    println(names[0])
    println(names[2])
    val lastName = mutableListOf("Lopes", "Silva","Souza")
    println(lastName)
    lastName.add("Pereira")
    println(lastName)
}