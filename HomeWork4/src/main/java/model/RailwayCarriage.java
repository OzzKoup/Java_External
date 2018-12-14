package model;

import java.io.Serializable;
import java.util.Objects;

public class RailwayCarriage implements Serializable {
    private int passengerAmount;
    private int baggageAmount;
    private ComfortType comfortType;

    public RailwayCarriage(int passengerAmount, int baggageAmount, ComfortType comfortType) {
        this.passengerAmount = passengerAmount;
        this.baggageAmount = baggageAmount;
        this.comfortType = comfortType;
    }

    public int getPassengerAmount() {
        return passengerAmount;
    }

    public void setPassengerAmount(int passengerAmount) {
        this.passengerAmount = passengerAmount;
    }

    public int getBaggageAmount() {
        return baggageAmount;
    }

    public void setBaggageAmount(int baggageAmount) {
        this.baggageAmount = baggageAmount;
    }

    public ComfortType getComfortType() {
        return comfortType;
    }

    public void setComfortType(ComfortType comfortType) {
        this.comfortType = comfortType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RailwayCarriage)) return false;
        if (!super.equals(o)) return false;
        RailwayCarriage that = (RailwayCarriage) o;
        return passengerAmount == that.passengerAmount &&
                baggageAmount == that.baggageAmount &&
                comfortType == that.comfortType;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), passengerAmount, baggageAmount, comfortType);
    }

    @Override
    public String toString() {
        return "RailwayCarriage{" +
                "passengerAmount=" + passengerAmount +
                ", baggageAmount=" + baggageAmount +
                ", comfortType=" + comfortType +
                '}';
    }
}
