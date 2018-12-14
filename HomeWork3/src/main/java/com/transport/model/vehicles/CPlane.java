package com.transport.model.vehicles;


import com.transport.model.interfeces.Flyable;

public class CPlane extends CVehicle implements Flyable {
    private int passengerAmount;
    private int height;

    private CPlane(Builder builder) {
        super(builder);
        this.height = builder.height;
        this.passengerAmount = builder.passengerAmount;
    }

    public static class Builder extends CVehicle.Builder<Builder> {
        private int passengerAmount;
        private int height;

        public Builder(int price, int year, int speed) {
            super(price, year, speed);
        }

        public Builder passengerAmount(int amount) {
            this.passengerAmount = amount;
            return this;
        }
        public Builder hight(int height) {
            this.height = height;
            return this;
        }

        @Override
        public CPlane build() {
            return new CPlane(this);
        }
    }

    public int getPassengerAmount() {
        return passengerAmount;
    }

    public void setPassengerAmount(int passengerAmount) {
        this.passengerAmount = passengerAmount;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "CPlane{" +
                "passengerAmount=" + passengerAmount +
                ", height=" + height +
                '}' + super.toString();
    }
}