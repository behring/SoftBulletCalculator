package behring.launchingsimulation.model

data class Spring(
    val length: Float, // 弹簧长度(mm)
    val outsideDiameter: Float, // 弹簧外径(mm)
    val thickness: Float, // 弹簧丝粗细(mm)
    val preloadLength: Float, // 弹簧预压量(mm) (拍头完全释放时弹簧长度与弹簧原长差值)(如果弹簧够不到完全释放的拍头，输入负的差值)
)