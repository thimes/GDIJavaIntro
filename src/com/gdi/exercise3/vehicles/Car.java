package com.gdi.exercise3.vehicles;

import com.gdi.exercise3.Vehicle;
import com.gdi.exercise3.interfaces.InflatableWheeledVehicle;

public class Car extends Vehicle implements InflatableWheeledVehicle {

    @Override
    public void inflateWheels() {

    }

    @Override
    public int getTopSpeedInMPH() {
        return 0;
    }

    @Override
    public int getMaximumPassengerCapacity() {
        return 0;
    }

    @Override
    public int getNumberOfWheels() {
        return 0;
    }
}
