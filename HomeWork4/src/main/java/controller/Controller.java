package controller;

import model.RailwayCarriage;
import model.Train;
import org.apache.log4j.Logger;

import java.util.*;

public class Controller {
   private static final Logger logger = Logger.getLogger(Controller.class);

    public static int countPassengerAmount(Train train) {
        logger.info("Enter countPassengerAmount with values : " + train);
        int passengerAmount = 0;
        for (RailwayCarriage r : train.getRailwayCarriage()) {
            passengerAmount += r.getPassengerAmount();
        }
        logger.info("Exit countPassengerAmount with values : " + passengerAmount);
        return passengerAmount;
    }

    public static int countBaggageAmount(Train train) {
        logger.info("Enter countBaggageAmount with values : " + train);
        int baggageAmount = 0;
        for (RailwayCarriage r : train.getRailwayCarriage()) {
            baggageAmount += r.getBaggageAmount();
        }
        logger.info("Exit countPassengerAmount with values : " + baggageAmount);
        return baggageAmount;
    }

    public static List<RailwayCarriage> sortComfortOfRailwayCarriage(Train train) {
        logger.info("Enter sortComfortOfRailwayCarriage with values : " + train);
        List<RailwayCarriage> comfortList = train.getRailwayCarriage();
        Collections.sort(comfortList, new Comparator<RailwayCarriage>() {
            @Override
            public int compare(RailwayCarriage o1, RailwayCarriage o2) {
                return o2.getComfortType().getValue() - o1.getComfortType().getValue();
            }
        });
        logger.info("Exit countPassengerAmount with values : " + comfortList);
        return comfortList;
    }

    public static List<RailwayCarriage> findAmountOfPassengerInCarriage(Train train, int from, int before) {
        logger.info("Enter findAmountOfPassengerInCarriage with values : " + train + from + before);
        List<RailwayCarriage> railwayCarriageList = new ArrayList<>();
        for (RailwayCarriage r : train.getRailwayCarriage()) {
            int amountPassengers = r.getPassengerAmount();
            if (amountPassengers >= from && amountPassengers <= before) {
                railwayCarriageList.add(r);
            }
        }
        logger.info("Exit countPassengerAmount with values : " + railwayCarriageList);
        return railwayCarriageList;
    }
}
