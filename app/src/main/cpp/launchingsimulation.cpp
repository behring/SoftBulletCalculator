#include <iostream>
#include <android/log.h>
#include "launchingsimulation.h"
#define LOG_TAG "LaunchingSimulationNativeCode"
void launching_simulation_main(
        float cylinderLength,
        float cylinderInsideDiameter,
        float springLength,
        float springOutsideDiameter,
        float springThickness,
        float springPreloadLength,
        float pistonMess,
        float barrelLength,
        float barrelCaliber,
        float bulletMess) {

    __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, "UI input arguments:");
    __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, "Cylinder Length: %f", cylinderLength);
    __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, "Cylinder Inside Diameter: %f", cylinderInsideDiameter);
    __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, "Spring Length: %f", springLength);
    __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, "Spring Outside Diameter: %f", springOutsideDiameter);
    __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, "Spring Thickness: %f", springThickness);
    __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, "Spring Preload Length: %f", springPreloadLength);
    __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, "Piston Mess: %f", pistonMess);
    __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, "Barrel Length: %f", barrelLength);
    __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, "Barrel Caliber: %f", barrelCaliber);
    __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, "Bullet Mess: %f", bulletMess);

        // Your simulation logic goes here
        // ...

        // No return value as specified
}
