import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Conta;
import model.entities.ContaPF;
import model.entities.ContaPJ;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        String nome = "";
        Double saldoInicial = 0.0;
        int numeroConta = 0;
        List<Conta> contas = new ArrayList<>();


        System.out.print("Deseja cadastrar conta Jurídica(J) ou Física (F)");
        char v = sc.next().charAt(0);
        
        if(v == 'J'){
            System.out.println("Cadastro pessoa jurídica:");
           
            System.out.print("Quantas conta PJ deseja cadastrar?");
            int ncontas = sc.nextInt();
            for(int i =0; i < ncontas; i ++){
               
                System.out.print("Informe Ração social: ");
                nome = sc.next();
                System.out.print("Informe número da conta");
                numeroConta = sc.nextInt();
                System.out.print("Deposito inicia? (S/N)");
                char d = sc.next().charAt(0);
                if(d == 'S'){
                    System.out.print("Informe deposito inicial: ");
                    saldoInicial = sc.nextDouble();
                }
                else if(d == 'N'){
                    System.out.print("Sem deposito inicial");
                    saldoInicial = 0.0;
                }
                else{
                    System.out.println("Escolha S ou N");
                    return;
                }
                contas.add(new ContaPJ(0.03, numeroConta, nome, saldoInicial));
            }
           
            
        }
        
        else if(v == 'F'){
            System.out.println("Conta pessoa  fisica");
            System.out.println("Quantas contas PF deseja cadastrar");
            int contas2 = sc.nextInt();
            for(int i =0; i < contas2; i++){
                System.out.print("Numero conta");
                numeroConta = sc.nextInt();
                System.out.print("Titular:");
                nome = sc.next();
    
                System.out.print("Informe o saldo inicial: (Obrigatório) ");
                saldoInicial = sc.nextDouble();
                contas.add(new ContaPF(0.05,numeroConta,nome,saldoInicial));
               
            }
            

            
        }
        else{
            System.out.println("Errro");
        }
        for(Conta contas3:contas){
            System.out.println(contas3);
        }

        sc.close();
    }
    
}
