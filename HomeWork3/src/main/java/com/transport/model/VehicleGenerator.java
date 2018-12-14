package com.transport.model;

import com.transport.model.vehicles.*;

import java.util.ArrayList;
import java.util.List;

public class VehicleGenerator {

    public static List<CVehicle> getMoveble() {
        List<CVehicle> moveables = new ArrayList<>();
        moveables.add(
                new CCar.Builder(100, 2016, 60)
                        .name("Lada")
                        .build()
        );
        moveables.add(
                new CCar.Builder(200, 2017, 120)
                        .name("Reno")
                        .build()
        );
        return moveables;
    }

    public static List<CVehicle> getFlyable() {
        List<CVehicle> flyables = new ArrayList<>();
        flyables.add(
                new CPlane.Builder(1000, 2005, 6000)
                        .hight(6000)
                        .passengerAmount(233)
                        .build()
        );
        flyables.add(
                new CPlane.Builder(100, 2015, 7000)
                        .hight(5200)
                        .passengerAmount(203)
                        .build()
        );
        return flyables;
    }

    public static List<CVehicle> getSwimable() {
        List<CVehicle> smiwables = new ArrayList<>();
        smiwables.add(
                new CShip.Builder(1000, 2005, 600)
                        .passengerAmount(500)
                        .portName("Odessa")
                        .build()
        );
        smiwables.add(
                new CShip.Builder(100, 2015, 7000)
                        .passengerAmount(203)
                        .portName("Odessa")
                        .build()
        );
        return smiwables;
    }

    public static List<CVehicle> getAllVehicle() {
        List<CVehicle> vehicles = new ArrayList<>();
        for (CVehicle vehicle : getFlyable()) {
            vehicles.add(vehicle);
        }
        for (CVehicle vehicle : getMoveble()) {
            vehicles.add(vehicle);
        }
        for (CVehicle vehicle : getSwimable()) {
            vehicles.add(vehicle);
        }
        return vehicles;
    }

    public static List<CVehicle> addCars() {
        List<CVehicle> vehicles = getAllVehicle();
        vehicles.add(
                new AmphibiousCar.Builder(100, 2017, 30)
                        .name("Best")
                        .build()
        );

        vehicles.add(
                new BatCar.Builder(100, 2017, 30)
                        .owner("Best")
                        .build()
        );

        return vehicles;
    }

}
