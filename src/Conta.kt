class Conta(
    val numeroConta: String,
    var saldo: Double,
    val cliente: Cliente
) {
    open fun depositar(valor: Double): void {}

    open fun sacar(valor: Double): void {}

    open fun obterSaldo(): Double {}
}