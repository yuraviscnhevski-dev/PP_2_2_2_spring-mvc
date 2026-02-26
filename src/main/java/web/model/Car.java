package web.model;

import java.util.Objects;

public class Car {

    private String model;
    private String series;
    private int horsePower;


    public Car() {}


    public Car(String model, String series, int horsePower) {
        this.model = model;
        this.series = series;
        this.horsePower = horsePower;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return horsePower == car.horsePower &&
                Objects.equals(model, car.model) &&
                Objects.equals(series, car.series);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, series, horsePower);
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}