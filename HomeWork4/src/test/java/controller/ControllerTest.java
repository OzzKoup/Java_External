package controller;

import model.ComfortType;
import model.RailwayCarriage;
import model.Train;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ControllerTest {

    @Test
    public void countPassengerAmountTest() {
        Train actual = new Train();
        RailwayCarriage railwayCarriage = new RailwayCarriage(60,0, ComfortType.PRESIDENT);
        RailwayCarriage railwayCarriage1 = new RailwayCarriage(34,0, ComfortType.PRESIDENT);
        List<RailwayCarriage> railwayCarriageList = new ArrayList<>();
        railwayCarriageList.add(railwayCarriage);
        railwayCarriageList.add(railwayCarriage1);
        actual.setRailwayCarriage(railwayCarriageList);

        assertEquals(Controller.countPassengerAmount(actual),94);
    }

    @Test
    public void testCountBaggageAmountTest() {
        Train actual = new Train();
        RailwayCarriage railwayCarriage = new RailwayCarriage(0,30,ComfortType.PRESIDENT);
        RailwayCarriage railwayCarriage1 = new RailwayCarriage(0,34,ComfortType.PRESIDENT);
        List<RailwayCarriage> railwayCarriageList = new ArrayList<>();
        railwayCarriageList.add(railwayCarriage);
        railwayCarriageList.add(railwayCarriage1);
        actual.setRailwayCarriage(railwayCarriageList);

        assertEquals(Controller.countBaggageAmount(actual),64);
    }

    @Test
    public void sortComfortOfRailwayCarriageTest() {
        Train trainActual = new Train();
        List<RailwayCarriage> actual = new ArrayList<>();

        RailwayCarriage r1 = new RailwayCarriage(0,30,ComfortType.PRESIDENT);
        RailwayCarriage r2 = new RailwayCarriage(0,30,ComfortType.COMFORT);
        RailwayCarriage r3 = new RailwayCarriage(0,30,ComfortType.PRESIDENT);
        RailwayCarriage r4 = new RailwayCarriage(0,30,ComfortType.COMMON);

        actual.add(r1);
        actual.add(r2);
        actual.add(r3);
        actual.add(r4);
        trainActual.setRailwayCarriage(actual);

        Train trainExpected = new Train();
        List<RailwayCarriage> expected = new ArrayList<>();
        expected.add(r1);
        expected.add(r3);
        expected.add(r2);
        expected.add(r4);
        trainExpected.setRailwayCarriage(expected);

        assertEquals(Controller.sortComfortOfRailwayCarriage(trainActual),
                Controller.sortComfortOfRailwayCarriage(trainExpected));
    }

    @Test
    public void findAmountOfPassengerInCarriageTest() {

        Train actual = new Train();

        RailwayCarriage railwayCarriage = new RailwayCarriage(60,0,ComfortType.PRESIDENT);
        RailwayCarriage railwayCarriage1 = new RailwayCarriage(34,0,ComfortType.PRESIDENT);
        RailwayCarriage railwayCarriage2 = new RailwayCarriage(70,0,ComfortType.PRESIDENT);

        List<RailwayCarriage> railwayCarriageList = new ArrayList<>();
        railwayCarriageList.add(railwayCarriage);
        railwayCarriageList.add(railwayCarriage1);
        railwayCarriageList.add(railwayCarriage2);
        actual.setRailwayCarriage(railwayCarriageList);



        RailwayCarriage railwayCarriage4 = new RailwayCarriage(60,0,ComfortType.PRESIDENT);
        RailwayCarriage railwayCarriage5 = new RailwayCarriage(70,0,ComfortType.PRESIDENT);

        ArrayList<RailwayCarriage> expectedList = new ArrayList<>();
        expectedList.add(railwayCarriage4);
        expectedList.add(railwayCarriage5);

        List<RailwayCarriage> actualList = Controller.findAmountOfPassengerInCarriage(actual , 50, 100);

        assertEquals(actualList, expectedList);
    }
}