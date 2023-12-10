#ifndef LAUNCHINGSIMULATION_H
#define LAUNCHINGSIMULATION_H

extern "C" {
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
        float bulletMess);

void send_result_to_ui(JNIEnv *env, const char *result);
}

#endif // LAUNCHINGSIMULATION_H