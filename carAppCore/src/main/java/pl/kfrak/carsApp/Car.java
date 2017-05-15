package pl.kfrak.carsApp;

/**
 * Created by RENT on 2017-05-13.
 */
public class Car {
    private String brand;
    private String model;
    private String manufactureYear;
    private double power;

    public Car(String text){
        String[] split = text.split(",");
        this.brand = split[0];
        this.model = split[1];
        this.manufactureYear = split[2];
        this.power = Double.parseDouble(split[3]);
    }

    public Car(String brand, String model, String manufactureYear, double power) {

        this.brand = brand;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.power = power;
    }

    @Override
    public String toString() {
        return brand + ", " + model + ", " + manufactureYear + ", " + power;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(String manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}

