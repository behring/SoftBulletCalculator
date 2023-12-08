package behring.launchingsimulation.data

class NativeLaunchingSimulationApi {
    companion object {
        init {
            System.loadLibrary("launchingsimulation")
        }

        @JvmStatic
        fun callback(result: String) {
            println("Called the UI successfully: $result")
        }
    }

    external fun launchSimulation(
        cylinderLength: Float, // 气缸长度(这里与拍头的有效行程相等)(mm)
        cylinderInsideDiameter: Float, // 气缸内直径(mm)
        springLength: Float, // 弹簧长度(mm)
        springOutsideDiameter: Float, // 弹簧外径(mm)
        springThickness: Float, // 弹簧丝粗细(mm)
        springPreloadLength: Float, // 弹簧预压量(mm) (拍头完全释放时弹簧长度与弹簧原长差值)(如果弹簧够不到完全释放的拍头，输入负的差值)
        pistonMess: Float, // 拍头质量(g)
        barrelLength: Float, // 发射器内管长度(mm)
        barrelCaliber: Float = 13f, // 发射器内管口径(mm)
        bulletMess: Float, // 软蛋质量(g)
    )
}