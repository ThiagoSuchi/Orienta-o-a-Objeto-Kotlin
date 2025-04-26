class Cliente(
    public val nome: String,
    protected val endereco: String,
    val idCliente: String
) {
    open fun obterNome(): String {}

    open fun definirEndereco(endereco: String) {}
}