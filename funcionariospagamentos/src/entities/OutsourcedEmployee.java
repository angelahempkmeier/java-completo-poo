package entities;

public class OutsourcedEmployee extends Employee{
    private Double additionalCharged;

    public OutsourcedEmployee(){

    }

    public OutsourcedEmployee(String nome, int hour, Double valuePerHour, Double additionalCharged) {
        super(nome, hour, valuePerHour);
        this.additionalCharged = additionalCharged;
    }

    public Double getAdditionalCharged() {
        return additionalCharged;
    }

    public void setAdditionalCharged(Double additionalCharged) {
        this.additionalCharged = additionalCharged;
    }

    @Override
    public Double payment() {
        return super.payment() + getAdditionalCharged()*1.1;
    }
}
