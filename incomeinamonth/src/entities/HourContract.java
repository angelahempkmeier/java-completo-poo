package entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double valuePerHour;
    private Double hours;

    public HourContract() {
    }

    public HourContract(Date date, Double valuePerHour, Double hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Double totalValue(){
        return getValuePerHour()*getHours();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Double getHours() {
        return hours;
    }

    public void setHours(Double hours) {
        this.hours = hours;
    }
}
