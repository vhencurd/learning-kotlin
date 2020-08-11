open class Book(val title:String, val author: String, var pages: Int) {
    private var currentPages = 0

    open fun readPage() {
        currentPages += 1
    }

    fun canBorrow() : Boolean {
        return maxNumberOfBooks <= 5
    }

    companion object {
        const val BASE_URL = "www.vhencurd.com"
        const val maxNumberOfBooks = 5
    }

    fun printURl() {
       println(BASE_URL + title + ".html")
    }
}

fun Book.bookWeight() = pages * 1.5
fun Book.tornPages(tornPage: Int) = if(pages > tornPage) pages-=tornPage else pages=0

class Puppy() {
    fun playWithBook(b: Book) = b.tornPages((2..5).random())
}

class EBook(title: String, author: String, val format : String="text") : Book(title, author,pages = 250) {
    private var wordCount = 0
    override fun readPage() {
        wordCount += 250
    }
}
