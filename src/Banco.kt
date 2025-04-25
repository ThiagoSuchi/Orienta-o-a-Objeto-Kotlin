class Banco(
    val nome: String,
    val agencia: List<Agencia>
) {
    open fun adcionarAgencia(agencia: Agencia): void {}

    open fun removerAgencia(agencia: Agencia): void {}

    open  fun obterAgencia(nome: String): Agencia {}

}