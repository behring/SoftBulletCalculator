#ifndef LAUNCHINGSIMULATION_H
#define LAUNCHINGSIMULATION_H

extern "C" {
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
        float bulletMess);
}

#endif // LAUNCHINGSIMULATION_H