interface BookShelfItem {
    fun getPages() : Int

    fun getPageContent(page: Int): String
}
