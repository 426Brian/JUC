package com.designPattern.build;

public interface AirShipBuilder {
    OrbitalModule buildOrbitalModule();

    Engine buildEngine();

    EscapeTower buildEscapeTower();
}
