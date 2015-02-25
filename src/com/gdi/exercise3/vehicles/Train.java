package com.gdi.exercise3.vehicles;

import com.gdi.exercise3.Vehicle;
import com.gdi.exercise3.interfaces.TrackboundVehicle;
import com.gdi.exercise3.interfaces.WheeledVehicle;

/**
 * Created by thimes on 2/25/15.
 */
public class Train extends Vehicle implements WheeledVehicle, TrackboundVehicle {
    @Override
    public void proceedAlongTheTracks() {

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
