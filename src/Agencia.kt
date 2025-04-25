class Agencia(
    val nome: String,
    val contas: List<Conta>
) {
    open fun adcionarConta(conta: Conta): void {}

    open fun removerConta(conta: Conta): void {}

    open fun obterConta(numero: String): Conta {}
}