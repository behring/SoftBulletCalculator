#include <jni.h>
#include <android/log.h>
#include "launchingsimulation.h"
#define LOG_TAG "LaunchingSimulationNativeCode"

extern "C"
JNIEXPORT void JNICALL
Java_behring_launchingsimulation_data_NativeLaunchingSimulationApi_launchSimulation(
        JNIEnv *env,
        jobject instance,
        jfloat cylinderLength,
        jfloat cylinderInsideDiameter,
        jfloat springLength,
        jfloat springOutsideDiameter,
        jfloat springThickness,
        jfloat springPreloadLength,
        jfloat pistonMess,
        jfloat barrelLength,
        jfloat barrelCaliber,
        jfloat bulletMess) {

float cylinderLengthValue = static_cast<float>(cylinderLength);
float cylinderInsideDiameterValue = static_cast<float>(cylinderInsideDiameter);
float springLengthValue = static_cast<float>(springLength);
float springOutsideDiameterValue = static_cast<float>(springOutsideDiameter);
float springThicknessValue = static_cast<float>(springThickness);
float springPreloadLengthValue = static_cast<float>(springPreloadLength);
float pistonMessValue = static_cast<float>(pistonMess);
float barrelLengthValue = static_cast<float>(barrelLength);
float barrelCaliberValue = static_cast<float>(barrelCaliber);
float bulletMessValue = static_cast<float>(bulletMess);

// Call the C++ function
launching_simulation_main(
        cylinderLengthValue,
        cylinderInsideDiameterValue,
        springLengthValue,
        springOutsideDiameterValue,
        springThicknessValue,
        springPreloadLengthValue,
        pistonMessValue,
        barrelLengthValue,
        barrelCaliberValue,
        bulletMessValue);


jclass kotlinClass = env->FindClass("behring/launchingsimulation/data/NativeLaunchingSimulationApi");
jmethodID callbackMethod = env->GetStaticMethodID(kotlinClass, "callback", "(Ljava/lang/String;)V");
jstring resultString = env->NewStringUTF("Hello from JNI!");
env->CallStaticVoidMethod(kotlinClass, callbackMethod, resultString);
env->DeleteLocalRef(resultString);

__android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, "Simulation completed");


}