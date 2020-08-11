class Collection {
    val allBooks = setOf<String>("Hamlet", "Macbeth", "Romeo and Juliet", "A Midsummer Night's Dream", "Othello")
    val library = mapOf(allBooks to "William Shakespeare")
    val moreBooks = mutableMapOf<String, String>()
}

fun main() {
    val collection = Collection()
    collection.allBooks.forEach{println(it)}

    collection.moreBooks["title"] = "In Search of Lost Time"
    collection.moreBooks["author"] = "Marcel Proust"
}