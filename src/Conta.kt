class Conta(
    val numeroConta: String,
    protected var saldo: Double,
    val cliente: Cliente
) {
    open fun depositar(valor: Double) {}

    open fun sacar(valor: Double) {}

    open fun obterSaldo(): Double {}
}