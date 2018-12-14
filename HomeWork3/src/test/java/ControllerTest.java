import com.transport.controller.Controller;
import com.transport.model.vehicles.*;
import com.transport.model.VehicleGenerator;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class ControllerTest {

    @Test
    public void testFindSpeedBetweenAndNotPlane() {
        ArrayList<CVehicle> actual = new ArrayList<>();
        actual.add(new CCar.Builder(100,2007,350).build());
        actual.add(new CPlane.Builder(100,2008,350).build());
        actual.add(new CCar.Builder(100,2009,100).build());

        ArrayList<CVehicle> expected = new ArrayList<>();
        expected.add(new CCar.Builder(100,2007,350).build());

        assertEquals(expected, Controller.findSpeedBetween(actual));
    }

    @Test
    public void testTheLessPriceTheFastestNotOlder5years() {
        ArrayList<CVehicle> actual = new ArrayList<>();
        actual.add(new CCar.Builder(50,2015,360).build());
        actual.add(new CPlane.Builder(100,2018,750).build());
        actual.add(new CCar.Builder(100,2013,100).build());
        actual.add(new CCar.Builder(60,2011,350).build());
        actual.add(new CPlane.Builder(100,2008,750).build());
        actual.add(new CCar.Builder(100,2016,100).build());


        ArrayList<CVehicle> expected = new ArrayList<>();
        expected.add(null);
        expected.add(new CPlane.Builder(100,2018,750).build());
        expected.add(new CCar.Builder(50,2015,360).build());
        expected.add(new CCar.Builder(100,2016,100).build());

        assertEquals(expected, Controller.theLessPriceTheFastestNotOlder5years(actual));
    }

    @Test
    public void testFindHeightMorThan5000and2000() {
        ArrayList<CVehicle> actual = new ArrayList<>();
        actual.add(new CPlane.Builder(100,2018,750)
                .hight(5001)
                .build());
        actual.add(new CPlane.Builder(100,2018,750)
                .hight(4999)
                .build());

        ArrayList<CVehicle> expected = new ArrayList<>();
        expected.add(new CPlane.Builder(100,2018,750)
                .hight(5001)
                .build());

        assertEquals(expected, Controller.findHeightMorThan5000and2000(actual));
    }

    @Test
    public void testAddCars() {
        List<CVehicle> expected = Controller.addCars(new ArrayList<>());

        List<CVehicle> actual = new ArrayList<>();
        actual = VehicleGenerator.getAllVehicle();
        actual.add(
                new AmphibiousCar.Builder(100, 2017, 30)
                        .name("Best")
                        .build()
        );

        actual.add(
                new BatCar.Builder(100, 2017, 30)
                        .owner("Best")
                        .build()
        );

        assertEquals(expected, actual);
    }

}
