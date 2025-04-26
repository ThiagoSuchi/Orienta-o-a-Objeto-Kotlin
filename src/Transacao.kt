import java.util.Date

class Transacao(
    val idTransacao: String,
    public var valor: Double,
    public var data: Date
) {
    open fun executar(): Boolean {}
}