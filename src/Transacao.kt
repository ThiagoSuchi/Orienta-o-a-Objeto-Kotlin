import java.util.Date

class Transacao(
    val idTransacao: String,
    var valor: Double,
    var data: Date
) {
    open fun executar(): Boolean {}
}