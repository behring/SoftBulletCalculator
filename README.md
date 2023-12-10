【科普与指南】如何科学拉栓——使用内弹道模拟程序的气缸软弹枪效率研究与卷毛/内管选型指导

## 与 C++交互的接口约定
目前应用层通过调用`NativeLaunchingSimulationApi`类的`launchSimulation`方法与 C++层交互。具体方法签名如下：
```kotlin
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
```
C++层可以通过调用应用层提供的接口主动和应用层通信。具体方式如下：
1. 请实现`launchingsimulation.h`头文件定义的方法`launching_simulation_main`。
2. 在 `launching_simulation_main`方法内部调用`send_result_to_ui`方法和 UI 通信。

>> note: 目前`send_result_to_ui`仅仅接收一个字符串作为输入结果，如果 C++层需要输出多个数据可以修改`send_result_to_ui`方法的入参。