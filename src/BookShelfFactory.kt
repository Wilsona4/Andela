object BookShelfFactory {
    private val book = Book("default", "Wilson")
    fun makeBookShelf(capacity: Int): MutableList<BookShelfItem> {
        return MutableList(capacity) { book }
    }

}