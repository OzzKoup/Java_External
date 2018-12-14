package com.transport.controller;

import com.transport.model.vehicles.CPlane;
import com.transport.model.vehicles.CVehicle;
import com.transport.model.VehicleGenerator;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final static Logger logger = Logger.getLogger(Controller.class);

    public static List<CVehicle> theLessPriceTheFastestNotOlder5years(List<CVehicle> vehicles) {
        logger.info("Enter the method theLessPriceTheFastestNotOlder5years");
        List<CVehicle> vehiclesFounded = new ArrayList<>();
        vehiclesFounded.add(Filter.findTheLessPrice(vehicles));
        vehiclesFounded.add(Filter.findTheFastest(vehicles));
        for (CVehicle vehicle: Filter.findOlderThan(vehicles, 5)) {
            if (!vehiclesFounded.contains(vehicle))
                vehiclesFounded.add(vehicle);
        }
        logger.info("Exit theLessPriceTheFastestNotOlder5years with list : " + vehiclesFounded);
        return vehiclesFounded;
    }

    public static List<CVehicle> findSpeedBetween(List<CVehicle> vehicles) {
        logger.info("Enter findSpeedBetween with list : " + vehicles);
        List<CVehicle> vehiclesFounded = new ArrayList<>();
        for (CVehicle vehicle: Filter.findSpeedBetween(vehicles, 200, 500)) {
                if (vehicle.getClass() != CPlane.class) {
                    vehiclesFounded.add(vehicle);
                }
        }
        logger.info("Exit findSpeedBetween with list : " + vehiclesFounded);
        return vehiclesFounded;
    }

    public static List<CVehicle> findHeightMorThan5000and2000(List<CVehicle> vehicles) {
        logger.info("Enter findHeightMorThan5000and2000 with list : " + vehicles);
        List<CVehicle> filtredVehicles = Filter.findHeight(vehicles);
        logger.info("Exit findHeightMorThan5000and2000 with list : " + filtredVehicles);
        return Filter.findOlderThan(filtredVehicles , 18);
    }

    public static List<CVehicle> addCars(List<CVehicle> vehicles) {
        logger.info("Enter addCars with list : " + vehicles);
        return VehicleGenerator.addCars();
    }
}
