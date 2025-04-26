class Agencia(
    val nome: String,
    var contas: MutableList<Conta> = mutableListOf()
) {
    fun adcionarConta(conta: Conta) {
        if (conta in contas) {
            println("Está conta já existe!")
        }
        contas.add(conta)
    }

    fun removerConta(conta: Conta) {
        if (conta in contas) {
            contas.remove(conta)
        }
        println("Esta conta não foi encontrada.")
    }

    fun obterConta(numero: String): Conta {
        for (conta in contas) {
            if (conta.numeroConta == numero) {
                return conta
            }
            println("Esta conta não foi encontrada...")
        }
    }
}