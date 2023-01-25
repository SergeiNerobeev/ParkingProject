package edu.parkingproject.pojo;

import java.util.Date;
import java.util.Objects;

public class CarIn {
    private int id;
    private String number;
    private Date dateIn;
    private Date dateOut;

    public CarIn(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarNumber() {
        return number;
    }

    public void setCarNumber(String carNumber) {
        this.number = carNumber;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarIn carIn = (CarIn) o;
        return id == carIn.id && number.equals(carIn.number) && dateIn.equals(carIn.dateIn) &&
                dateOut.equals(carIn.dateOut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, dateIn, dateOut);
    }
}
