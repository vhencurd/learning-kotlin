package Buildings

open class BaseBuildingMaterial {
    open val numberNeeded: Int = 1
}

class Brick: BaseBuildingMaterial() {
    override val numberNeeded = 8
}

class Wood: BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Building<T : BaseBuildingMaterial>(val buildingMaterial: T) {
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = baseMaterialsNeeded * buildingMaterial.numberNeeded

    fun build() {
        println("$actualMaterialsNeeded ${buildingMaterial::class.simpleName} needed")
    }
}

fun <T:BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) {
        println("small building")
    } else {
        println("big building")
    }
}

fun <T:BaseBuildingMaterial> madeOf(building: Building<T>) {
    if(building.actualMaterialsNeeded <= 400) {
        println("made of wood")
    } else {
        println("made of brick")
    }
}
fun main() {
    val b = Building(Wood())

    b.build()
    isSmallBuilding(b)
    madeOf(b)
}