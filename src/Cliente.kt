class Cliente(
    val nome: String,
    val endereco: String,
    val idCliente: String
) {
    open fun obterNome(): String {}

    open fun definirEndereco(endereco: String): void {}
}