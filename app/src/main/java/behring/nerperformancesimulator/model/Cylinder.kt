package behring.nerperformancesimulator.model

data class Cylinder(
    val length: Float, // 气缸长度(这里与拍头的有效行程相等)(mm)
    val insideDiameter: Float, // 气缸内直径(mm)
)