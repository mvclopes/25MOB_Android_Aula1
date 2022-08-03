fun main() {
    /**
     * As funções println() a seguir imprimem a concatenação do primeiro e
     * último nome com o operador aritmético "+", bem como o valor médio de dois
     * números fornecidos (numA e numB)
     **/
    val firstName = "Matheus"
    val lastName = "Lopes"
    val fullName = firstName + lastName
    println("Full name: $fullName")

    val numA = 25
    val numB = 15
    val average = (numA + numB)/2
    println("Media: $average")
}