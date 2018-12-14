package model;

import java.util.List;
import java.util.Objects;

public class Train {
    private List<RailwayCarriage> railwayCarriage;

    public List<RailwayCarriage> getRailwayCarriage() {
        return railwayCarriage;
    }

    public void setRailwayCarriage(List<RailwayCarriage> railwayCarriage) {
        this.railwayCarriage = railwayCarriage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Train)) return false;
        Train train = (Train) o;
        return Objects.equals(railwayCarriage, train.railwayCarriage);
    }

    @Override
    public int hashCode() {

        return Objects.hash(railwayCarriage);
    }
}
