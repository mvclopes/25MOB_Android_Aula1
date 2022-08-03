fun main() {
    /**
     * Null safety é um operador (?) que explicita que determinada variável
     * pode receber valor nulo
     */
    var driveLicense: String? = null
    println("driverLicense: $driveLicense")
    driveLicense = "40028922"
    println("driverLicense: $driveLicense")
}