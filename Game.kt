enum class Directions {
    NORTH, SOUTH,
    EAST, WEST,
    START, END,
}

class Game(var path: MutableList<Directions> = mutableListOf<Directions>(Directions.START)) {
    val north = { path.add(Directions.NORTH) }
    val south = { path.add(Directions.SOUTH) }
    val east = { path.add(Directions.EAST) }
    val west = { path.add(Directions.WEST) }
    val end = { path.add(Directions.END); println("GAME OVER : $path"); path.clear(); false }

    fun move(where: () -> Boolean) {
        where()
    }

    fun makeMove(where : String? ) {
        when(where){
            "north" -> move(north)
            "south" -> move(south)
            "east" -> move(east)
            "west" -> move(west)
            else -> move(end)
        }
    }
}

fun main(args: Array<String>) {
    val game = Game()
    game.north()
    game.south()
    game.east()
    game.west()
    game.end()

    while (true) {
        print("Enter a direction: n/s/e/w: ")
        game.makeMove(readLine())
    }
}