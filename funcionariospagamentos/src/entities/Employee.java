package entities;

public class Employee {
    private String nome;
    private int hour;
    private Double valuePerHour;


    public Employee(){

    }

    public Employee(String nome, int hour, Double valuePerHour) {
        this.nome = nome;
        this.hour = hour;
        this.valuePerHour = valuePerHour;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Double payment(){
        return getHour()*getValuePerHour();
    }

    @Override
    public String toString(){
        return getNome() + ": " + payment();
    }
}
