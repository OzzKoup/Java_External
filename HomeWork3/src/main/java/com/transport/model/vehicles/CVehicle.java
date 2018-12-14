package com.transport.model.vehicles;

import java.util.Objects;

public abstract class CVehicle {
    private int price;
    private int year;
    private int speed;

    protected CVehicle(Builder builder) {
        this.price = builder.price;
        this.year = builder.year;
        this.speed = builder.speed;
    }

    public abstract static class Builder<B extends CVehicle.Builder<B>> {
        private int price;
        private int year;
        private int speed;

        public Builder(int price, int year, int speed) {
            this.price = price;
            this.year = year;
            this.speed = speed;
        }

        public abstract CVehicle build();
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CVehicle)) return false;
        CVehicle cVehicle = (CVehicle) o;
        return price == cVehicle.price &&
                year == cVehicle.year &&
                speed == cVehicle.speed;
    }

    @Override
    public int hashCode() {

        return Objects.hash(price, year, speed);
    }

    @Override
    public String toString() {
        return "CVehicle{" +
                "price=" + price +
                ", year=" + year +
                ", speed=" + speed +
                '}';
    }
}
