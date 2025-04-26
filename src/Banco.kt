class Banco(
    public val nome: String,
    val agencia: MutableList<Agencia> = mutableListOf()
) {
    fun adcionarAgencia(agencia: Agencia) {}

    fun removerAgencia(agencia: Agencia) {}

    fun obterAgencia(nome: String): Agencia {}

}