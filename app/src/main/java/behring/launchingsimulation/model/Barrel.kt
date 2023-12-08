package behring.launchingsimulation.model

data class Barrel(
    val length: Float, // 发射器内管长度(mm)
    val caliber: Float = 13f, // 发射器内管口径(mm)
)