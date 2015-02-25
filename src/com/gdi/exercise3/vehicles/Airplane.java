package com.gdi.exercise3.vehicles;

import com.gdi.exercise3.Vehicle;
import com.gdi.exercise3.interfaces.AirborneVehicle;
import com.gdi.exercise3.interfaces.InflatableWheeledVehicle;

public class Airplane extends Vehicle implements AirborneVehicle, InflatableWheeledVehicle {
    @Override
    public void fly() {

    }

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
