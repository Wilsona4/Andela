class Magazine(
    val name: String,
    val publicationDate: String
): BookShelfItem {
    override fun getPages(): String {
        TODO("Not yet implemented")
    }

    override fun getPageContent(page: Int): String {
        TODO("Not yet implemented")
    }
}