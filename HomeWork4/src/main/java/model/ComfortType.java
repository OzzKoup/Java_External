package model;

public enum ComfortType {
    PRESIDENT(3),
    COMFORT(2),
    COMMON(1);

    private int value;

    private ComfortType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
