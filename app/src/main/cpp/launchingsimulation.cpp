#include <jni.h>
#include <iostream>
#include <android/log.h>
#include "launchingsimulation.h"
#define LOG_TAG "LaunchingSimulationNativeCode"

void send_result_to_ui(JNIEnv *env, const char *result) {
    jclass kotlinClass = env->FindClass("behring/launchingsimulation/data/NativeLaunchingSimulationApi");
    if (kotlinClass == nullptr) {
        // Handle class not found error
        return;
    }

    jmethodID callbackMethod = env->GetStaticMethodID(kotlinClass, "callback", "(Ljava/lang/String;)V");
    if (callbackMethod == nullptr) {
        // Handle method not found error
        return;
    }

    jstring resultString = env->NewStringUTF(result);
    if (resultString == nullptr) {
        // Handle string creation error
        return;
    }

    env->CallStaticVoidMethod(kotlinClass, callbackMethod, resultString);
    env->DeleteLocalRef(resultString);
}

void launching_simulation_main(
        JNIEnv *env,
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

    const char *simulationResult = "Hello from JNI with simulation result!";
    send_result_to_ui(env, simulationResult);
        // No return value as specified
}