package model.entities;

public abstract class Conta {
    private Integer numero;
    private String titular;
   // private Double saldoInicial;
    protected Double saldo;
    
    public Conta(Integer numero, String titular, Double saldo) {
        this.numero = numero;
        this.titular = titular;
      //  this.saldoInicial = saldoInicial;
        this.saldo = saldo;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    
    public  Double getSaldo(){
        return saldo;
    }
    public abstract void saque(double saque);
    public abstract void deposito(double deposito);
    


    
}
