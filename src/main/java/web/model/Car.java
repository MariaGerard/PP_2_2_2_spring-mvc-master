package web.model;

import java.util.Objects;

public class Car {

    private String model;
    private String country;
    private int yearOfProduction;

    public Car() {
    }

    public Car(String model, String country, int yearOfProduction) {
        this.model = model;
        this.country = country;
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public String getCountry() {
        return country;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfProduction == car.yearOfProduction && Objects.equals(model, car.model) && Objects.equals(country, car.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, country, yearOfProduction);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", country='" + country + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
