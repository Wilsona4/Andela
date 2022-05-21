import java.security.acl.Owner

class Notebook(
    val owner: Owner
): BookShelfItem {
    override fun getPages(): Int {
        TODO("Not yet implemented")
    }

    override fun getPageContent(page: Int): String {
        TODO("Not yet implemented")
    }
}