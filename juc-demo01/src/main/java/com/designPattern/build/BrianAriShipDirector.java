package com.designPattern.build;

public class BrianAriShipDirector implements AirShipDirector {
    private AirShipBuilder builder;

    public BrianAriShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directAirShip() {
        OrbitalModule orbitalModule = builder.buildOrbitalModule();
        Engine engine = builder.buildEngine();
        EscapeTower escapeTower = builder.buildEscapeTower();

        AirShip airShip = new AirShip();
        airShip.setEngine(engine);
        airShip.setOrbitalModule(orbitalModule);
        airShip.setEscapeTower(escapeTower);
        return airShip;
    }
}
