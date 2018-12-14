package com.transport.controller;


import com.transport.exceptions.EmptyListException;
import com.transport.model.vehicles.CPlane;
import com.transport.model.vehicles.CVehicle;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class Filter {
    private static final int CURRENT_YEAR = 2018;
    private final static Logger logger = Logger.getLogger(Filter.class);


    public static List<CVehicle> findSpeed(List<CVehicle> vehicles) {
        logger.info("Enter the method findSpeed");
        List<CVehicle> foundedVehicles = new ArrayList<>();
        for (CVehicle o : vehicles) {
            if (o instanceof CPlane) {
                if (o.getYear() > 2000 && ((CPlane) o).getHeight() > 5000) {
                    foundedVehicles.add(o);
                }
            }

        }
        logger.info("Return list" + foundedVehicles);
        return vehicles;
    }

    public static List<CVehicle> findOlderThan(List<CVehicle> vehicles, int age) {
        logger.info("Enter the method findOlderThan with list : " + vehicles + " and age " + age);
        List<CVehicle> foundedVehicles = new ArrayList<>();
        for (CVehicle vehicle : vehicles) {
            if (vehicle.getYear() > CURRENT_YEAR - age) {
                foundedVehicles.add(vehicle);
            }
        }
        logger.info("Return list" + foundedVehicles);
        return foundedVehicles;
    }

    public static CVehicle findTheLessPrice(List<CVehicle> vehicles) {
        logger.info("Enter the method findTheLessPrice with list : " + vehicles);
        CVehicle foundedVehicle = null;
        int minPrice = 0;
        if (!vehicles.isEmpty()) {
            minPrice = vehicles.get(0).getPrice();
        }
        for (CVehicle vehicle : vehicles) {
            if (vehicle.getPrice() < minPrice) {
                minPrice = vehicle.getPrice();
                foundedVehicle = vehicle;
            }
        }
        logger.info("Return list : " + vehicles);
        return foundedVehicle;
    }

    public static CVehicle findTheFastest(List<CVehicle> vehicles) {
        logger.info("Enter the method findTheFastest with list : " + vehicles);
        CVehicle foundedVehicle = null;
        if (vehicles.isEmpty()) {
            logger.error("Vehicle list is empty");
            throw new EmptyListException("Vehicle list is empty");
        }
        int speed  = vehicles.get(0).getSpeed();
        for (CVehicle vehicle : vehicles) {
            if (vehicle.getSpeed() > speed) {
                speed = vehicle.getSpeed();
                foundedVehicle = vehicle;
            }
        }
        logger.info("Return founded vehicle : " + foundedVehicle);
        return foundedVehicle;
    }


    public static List<CVehicle> olderThan(List<CVehicle> vehicles, int age) {
        logger.info("Enter the method olderThan with list : " + vehicles + " and age : " + age);
        List<CVehicle> foundedVehicles = new ArrayList<>();
        for (CVehicle o : vehicles) {
            if (o.getYear() > age) {
                foundedVehicles.add(o);
            }
        }
        logger.info("Return founded vehicles : " + foundedVehicles);
        return foundedVehicles;
    }

    public static List<CVehicle> findSpeedBetween(List<CVehicle> vehicles, int minSpeed, int maxSpeed) {
        logger.info("Enter the method findSpeedBetween with list : " + vehicles +
                " with min speed : " + minSpeed + " and max speed : " + maxSpeed);
        List<CVehicle> foundedVehicles = new ArrayList<>();
        for (CVehicle o : vehicles) {
            if (o.getSpeed() >= minSpeed && o.getSpeed() <= maxSpeed) {
                foundedVehicles.add(o);
            }
        }
        logger.info("Exit the method findSpeedBetween with list : " + foundedVehicles);
        return foundedVehicles;
    }


    public static List<CVehicle> findHeight(List<CVehicle> vehicles) {
        logger.info("Enter the method findHeight with list : " + vehicles);
        List<CPlane> planes = new ArrayList<>();
        List<CVehicle> foundedPlanes = new ArrayList<>();
        for (CVehicle o : vehicles) {
            if (o instanceof CPlane) {
                planes.add((CPlane) o);
            }
        }
        for (CPlane plane : planes) {
            if (plane.getHeight() > 5000) {
                foundedPlanes.add(plane);
            }
        }
        logger.info("Exit the method findHeight with list : " + foundedPlanes);
        return foundedPlanes;
    }

}

