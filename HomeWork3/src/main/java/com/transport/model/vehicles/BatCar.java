package com.transport.model.vehicles;


import com.transport.model.interfeces.Flyable;
import com.transport.model.interfeces.Moveable;
import com.transport.model.interfeces.Swimable;

public class BatCar extends CVehicle implements Flyable, Moveable, Swimable {
    private String owner;

    private BatCar(Builder builder) {
        super(builder);
        this.owner = builder.owner;
    }

    public static class Builder extends CVehicle.Builder<BatCar.Builder> {
        private String owner;

        public Builder(int price, int year, int speed) {
            super(price, year, speed);
        }

        public BatCar.Builder owner(String name) {
            this.owner = name;
            return this;
        }

        @Override
        public BatCar build() {
            return new BatCar(this);
        }
    }

}