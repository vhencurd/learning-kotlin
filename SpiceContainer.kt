data class SpiceContainer (val name: String) {
    var label : String = name
}

enum class Color(val rgb: Int) {

    YELLOW(0xFFFF00)
}

interface SpiceColor {
    val color : Color
}

object YellowSpiceColor : SpiceColor {
    override val color : Color = Color.YELLOW
}

fun main() {
    var curry = SpiceContainer("curry")
    var ginger = SpiceContainer("ginger")
    var hotPepper = SpiceContainer("hot pepper")

    println(curry.label)
    println(ginger.label)
    println(hotPepper.label)
}