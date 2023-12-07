package behring.nerperformancesimulator.model

data class Blaster(
    val barrelLength: Float, // 发射器内管长度(mm)
    val caliber: Float = 13f, // 发射器内管口径(mm)
)