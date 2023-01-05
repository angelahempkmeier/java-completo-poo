package entities;

public class Account {
    private int accountNUmber;
    private String name;
    private float saldo;


    public Account(int accountNUmber, String name) {
        this.accountNUmber = accountNUmber;
        this.name = name;
    }

    public int getAccountNUmber() {
        return accountNUmber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float deposito(float valorDeposito){
        return this.saldo += valorDeposito;
    }

    public float saque(float valor){
        float taxa = 5.0f;
        return this.saldo = this.saldo - taxa - valor;
    }

    public String toString(){
        return "Account " + this.getAccountNUmber() + ", Holder: " + this.getName() + ", Balance: $ " + this.getSaldo();
    }
}
