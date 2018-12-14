package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ModelWriter {

    public static void writeToFile() throws IOException {
        List<RailwayCarriage> carriages = new ArrayList<>();
        carriages.add(new RailwayCarriage(60, 50, ComfortType.PRESIDENT));
        carriages.add(new RailwayCarriage(30, 60, ComfortType.COMFORT));
        carriages.add(new RailwayCarriage(40, 53, ComfortType.COMMON));
        carriages.add(new RailwayCarriage(10, 10, ComfortType.PRESIDENT));

        File fw = new File("Data.txt");
        FileOutputStream fos = new FileOutputStream(fw);
        ObjectOutputStream ostream = new ObjectOutputStream(fos);
        for (int i = 0; i < carriages.size(); i++) {
            ostream.writeObject((carriages.get(i)));
        }
        ostream.close();
    }

    public static ArrayList<RailwayCarriage> readFromFile(String fileName) {
        ArrayList<RailwayCarriage> railwayCarriageArrayList = new ArrayList<RailwayCarriage>();
        File file = new File(fileName);
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream istream = new ObjectInputStream(fis)) {
            Object obj;
            while (true) {
                if (fis.available() != 0) {
                    obj = istream.readObject();
                    railwayCarriageArrayList.add((RailwayCarriage) obj);
                } else {
                    break;
                }
            }
            return railwayCarriageArrayList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Train getTrain() throws IOException {
        writeToFile();
        Train train = new Train();
        train.setRailwayCarriage(readFromFile("Data.txt"));
        return train;
    }
}
