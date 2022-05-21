object BookShelfFactory {
    private val bookShelfItem = BookShelfItem(
        0,
        ""
    )

    fun makeBookShelf(capacity: Int): MutableList<BookShelfItem> {
        return MutableList(capacity) { bookShelfItem }
    }

}