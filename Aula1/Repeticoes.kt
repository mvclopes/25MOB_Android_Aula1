fun main() {
    /**
     * Repetições (Loop) permitem repetir determinado bloco de código de acordo
     * com a condição especificada
     **/
    val names = listOf("Matheus", "Fulano", "Ciclano")
    for (name in names) {
        println(name)
    }

    for (num in 1..5) {
        println(num)
    }

    for (num in 5 downTo  1) {
        println(num)
    }
}