package entity;

public class Car {
    private String brant;
    private String collor;

    public Car(String brant, String collor) {
        this.brant = brant;
        this.collor = collor;
    }

    public Car() {
    }

    public String getBrant() {
        return brant;
    }

    public void setBrant(String brant) {
        this.brant = brant;
    }

    public String getCollor() {
        return collor;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }
}
