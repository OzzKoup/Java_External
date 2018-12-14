package com.transport.model.vehicles;



import com.transport.model.interfeces.Flyable;
import com.transport.model.interfeces.Swimable;

import java.util.Objects;

public class CShip extends CVehicle implements Swimable {
    private int passengerAmount;
    private String portName;

    private CShip(Builder builder) {
        super(builder);
        this.passengerAmount = builder.passengerAmount;
        this.portName = builder.portName;
    }

    public static class Builder extends CVehicle.Builder<CShip.Builder> {
        private int passengerAmount;
        private String portName;

        public Builder(int price, int year, int speed) {
            super(price, year, speed);
        }

        public Builder portName(String portName) {
            this.portName = portName;
            return this;
        }
        public Builder passengerAmount(int amount) {
            this.passengerAmount = amount;
            return this;
        }

        @Override
        public CShip build() {
            return new CShip(this);
        }
    }

    public int getPassengerAmount() {
        return passengerAmount;
    }

    public void setPassengerAmount(int passengerAmount) {
        this.passengerAmount = passengerAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CShip cShip = (CShip) o;
        return passengerAmount == cShip.passengerAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengerAmount);
    }

    @Override
    public String toString() {
        return "CShip{" +
                "passengerAmount=" + passengerAmount +
                ", portName='" + portName + '\''+  super.toString();
    }
}
