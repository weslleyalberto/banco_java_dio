package model.entities;


public class ContaPF extends Conta {
    private Double taxaJuros;
    public ContaPF(Double taxaJuros,Integer numero, String titular,Double saldo) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }
    public Double getTaxaJuros() {
        return taxaJuros;
    }
    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    @Override
    public void saque(double saque) {
        if(saque > getSaldo()){
            System.out.println("Saldo insuficiente! Saldo Atual: " + String.format("%.2f", getSaldo()));
        }
        else{
            saldo -= saque;
            System.out.println("Operação realizada com sucesso: ");
        }

        
    }
    @Override
    public void deposito(double deposito) {
       saldo+= saldo + deposito;
       System.out.println("Operação efetuada com sucesso!");
        
    }
    @Override
    public String toString(){
        return "Numero conta: " + getNumero()
        + " - " + "titular: " + getTitular()
        + " - " + "Saldo: " + String.format("%.2f", getSaldo());
    }
    

   

    

}
