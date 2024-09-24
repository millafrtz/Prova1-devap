data class Produto(
    val nome: String,
    val categoria: String,
    val preco: Double,
    val quantidade: Int
)

object ProdutoList {
    val produtos = mutableListOf<Produto>()
}
