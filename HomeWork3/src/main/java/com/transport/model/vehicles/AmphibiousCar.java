package com.transport.model.vehicles;

import com.transport.model.interfeces.Moveable;
import com.transport.model.interfeces.Swimable;

public class AmphibiousCar extends CVehicle implements Moveable, Swimable {
    private String name;

    private AmphibiousCar(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static class Builder extends CVehicle.Builder<AmphibiousCar.Builder> {
        private String name;

        public Builder(int price, int year, int speed) {
            super(price, year, speed);
        }

        public AmphibiousCar.Builder name(String name) {
            this.name = name;
            return this;
        }

        @Override
        public AmphibiousCar build() {
            return new AmphibiousCar(this);
        }
    }
}
