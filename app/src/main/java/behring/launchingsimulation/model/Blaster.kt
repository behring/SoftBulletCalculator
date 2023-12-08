package behring.launchingsimulation.model

data class Blaster(
    val barrel: Barrel, // 内管
    val bullet: Bullet, // 软蛋
    val cylinder: Cylinder, // 气缸
    val piston: Piston, // 拍头
    val spring: Spring, // 弹簧
)