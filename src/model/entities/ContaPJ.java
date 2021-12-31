package model.entities;



public class ContaPJ extends Conta {

    private Double taxaOperacao;

    public ContaPJ(Double taxaOperacao,Integer numero, String titular, Double saldo) {
        super(numero, titular, saldo);
        this.taxaOperacao = taxaOperacao;
    }

    @Override
    public void deposito(double deposito) {
        saldo+= deposito;
        System.out.println("Deposito de " + String.format("%.2f", deposito) + ", realizado com sucesso");
        
    }

    @Override
    public void saque(double saque) {
        if(getSaldo() < saque + taxaOperacao){
            System.out.println("Saldo insuficiente: Saldo atual: " + String.format("%.2f", getSaldo()));

        }
        else{
            saldo -= saque + taxaOperacao;
            System.out.println("Saque realizado com sucesso!");
        }
    }

    @Override
    public String toString() {
        return "ContaPJ titular : " + getTitular() + " - " + "Saldo inicial: " + String.format("%.2f", getSaldo());
       
    }

    
}
