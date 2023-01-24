package entities;

import exceptions.DeuRuim;
import exceptions.SemSaldo;
import exceptions.ValorExcedido;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withDrawLimite;


    public Account(){}

    public Account(Integer number, String holder, Double balance, Double withDrawLimite) throws SemSaldo {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrawLimite = withDrawLimite;
        if(balance == 0){
            throw new SemSaldo("Primeiro, faça um depósito!");
        }

    }

    public void deposit(Double amount){
        setBalance(getBalance() + amount);
    }

    public void withdraw(Double amount) throws DeuRuim, SemSaldo, ValorExcedido {
        if(amount>getWithDrawLimite()){
            throw new DeuRuim("Os saques são permitidos apenas conforme limite proposto.");
        }else if(getBalance() == 0){
            throw new SemSaldo("Primeiro, faça um depósito!");
        }else if(amount > getBalance()){
            throw new ValorExcedido("Sem saldo!");
        }else{
            setBalance(getBalance() - amount);
        }
    }
    @Override
    public String toString(){
        return "Nome: " + holder + "; Conta: " + number + "; Saldo: " + balance + "; Limite para saque: " + withDrawLimite;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithDrawLimite() {
        return withDrawLimite;
    }

    public void setWithDrawLimite(Double withDrawLimite) {
        this.withDrawLimite = withDrawLimite;
    }
}
