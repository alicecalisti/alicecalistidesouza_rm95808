package alicecalisti.com.github.alicecalisti_rm95808

data class ItemModel(
    val id: Int,
    val name: String,
    val onRemove: (ItemModel) -> Unit
)