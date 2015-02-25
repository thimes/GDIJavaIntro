package com.gdi.exercise3.vehicles;

import com.gdi.exercise3.Vehicle;
import com.gdi.exercise3.interfaces.WatergoingVehicle;

public class Boat extends Vehicle implements WatergoingVehicle {
    @Override
    public int getTopSpeedInMPH() {
        return 0;
    }

    @Override
    public int getMaximumPassengerCapacity() {
        return 0;
    }

    @Override
    public void travelOverWater() {

    }
}
