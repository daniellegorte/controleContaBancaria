
package contabancaria;
import java.util.Scanner;
public class ContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String nome = "Armarildo Fernandes", tipoConta = "Corrente";
        double saldo = 1500, saldoReceber = 0, saldoTransferir = 0;
        int opcao;
        
        System.out.println(" ======================== ");
        System.out.println(String.format("""
                           Nome: %s 
                           Tipo de Conta: %s 
                           Saldo Inicial: %.2f
                           """ , nome, tipoConta, saldo));
        System.out.println(" ======================== ");
        System.out.println(" ");
        
        do {
        System.out.println(" === MENU DE OPÇÕES === ");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Receber valor");
        System.out.println("3. Transferir valor");
        System.out.println("4. Sair");
        System.out.println("");
        opcao = sc.nextInt();
        
        switch (opcao){
            case 1:
                System.out.println(String.format("Saldo Inicial: %.2f" ,saldo));
                break;
                
            case 2:
                System.out.println("Digite o valor a ser recebido: ");
                saldoReceber = sc.nextDouble();
                saldo = saldoReceber + saldo;
                break;
                
            case 3:
                System.out.println("Digite o valor a ser transferido: ");
                do{
                    saldoTransferir = sc.nextDouble();
                    if (saldoTransferir > saldo){
                        System.out.println("Não é possível transferir pois não há valor disponível. Tente outro valor.");
                        System.out.println(String.format("Saldo atual: %.2f" , saldo));
                    } else if (saldoTransferir <= saldo){
                        saldo = saldo - saldoTransferir;
                    }
                } while (saldoTransferir > saldo);
                
                System.out.println(String.format("A transferência foi realizada.  Saldo atual: R$%.2f" ,saldo));
                break;
                
            case 4:
            System.out.println("PROGRAMA FINALIZADO.");
            break;
        }
    } while (opcao !=4);
        
    }
}
