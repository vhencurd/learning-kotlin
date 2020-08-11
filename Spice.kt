package Spices

abstract  class Spice(val name: String, val spiciness: String, color: SpiceColor): SpiceColor by color {
    abstract fun prepareSpice()
}

class Curry(name: String = "curry", spiciness: String = "mild", color: SpiceColor = YellowSpiceColor):
        Spice(name, spiciness, color) , Grinder{
    override fun grind() = println("Grinding ${name}")
    override fun prepareSpice() = println("Preparing ${name}")
}

interface Grinder {
    fun grind()
}

object YellowSpiceColor : SpiceColor {
    override val color : String = "yellow"
}

interface SpiceColor {
    val color : String
}

fun main() {
    val curry = Curry()

    curry.prepareSpice()
    curry.grind()
    println("Name: ${curry.name}\nSpiciness:${curry.spiciness}\nColor:${curry.color}")
}

