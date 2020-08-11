class BasicBook(val title:String, val author: String, val year: Int) {

    fun getTitleAndAuthor() : Pair<String, String> {
        val info = Pair(title, author)
        return (info)
    }

    fun getAllInfo() : Triple<String, String, Int> {
        val info = Triple(title, author, year)
        return (info)
    }
}

fun main() {
    val book = BasicBook("Moby Dick","Herman Melville", 1851)
    val bookInfo = book.getAllInfo()
    println("Here is your book ${bookInfo.first} written by ${bookInfo.second} in ${bookInfo.third}")
}