package com.gdi.exercise3;

import com.gdi.exercise3.vehicles.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thimes on 2/25/15.
 */
public class VehicularAlmanac {

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();

        vehicles.add(new Airplane());
        vehicles.add(new Boat());
        vehicles.add(new Bus());
        vehicles.add(new Car());
        vehicles.add(new Train());

    }
}
