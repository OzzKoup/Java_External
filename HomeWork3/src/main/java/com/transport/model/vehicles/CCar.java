package com.transport.model.vehicles;


import com.transport.model.interfeces.Moveable;

public class CCar extends CVehicle implements Moveable {
    private String name;

    private CCar(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static class Builder extends CVehicle.Builder<CPlane.Builder> {
        private String name;

        public Builder(int price, int year, int speed) {
            super(price, year, speed);
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        @Override
        public CCar build() {
            return new CCar(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CCar{" +
                "name='" + name + '\'' +
                '}' + super.toString();
    }
}
