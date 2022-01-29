package meubanco;

import java.util.Scanner;

 
public class MeuBanco {

    public static void main(String[] args) {
        
        int op;
        float depo, saca, tranf;
        Conta p1 = new Conta("Hernany Simão",1000);
        Conta p2 = new Conta(5000);
        Scanner ler = new Scanner(System.in);
        
        
        System.out.println("Bem- vindo "+p1.getNome()+ "a sua conta foi aberta com um valor "
              + "inicial de 1000kz");
        System.out.println("Selecione uma das operações bancarias: ");
        System.out.println("1- Consultar");
        System.out.println("2- Depositar");
        System.out.println("3- Sacar");
        System.out.println("4- Tranferir");
        System.out.print("R: ");
        op = ler.nextInt();
        
        
        switch(op){
            case 1:
                System.out.println("O saldo na sua conta: "+p1.consultar());
                break;
                
            case 2:
                System.out.println("Digite o valor a depositar: ");
                depo = ler.nextFloat();
                System.out.println("Você depositou "+depo+ " Kz");
                p1.depositar(depo);
                System.out.println("O seu saldo actual é de "+ p1.consultar());
                break;
                
            case 3: 
                System.out.println("Digite quanto deseja sacar: ");
                saca = ler.nextFloat();
                System.out.println("Você acabou de sacar "+saca+ " kz");
                p1.sacar(saca);
                System.out.println("O seu saldo actual é de "+p1.consultar());
                break;
                
            case 4:
                System.out.println("Digite quanto quer transferir: ");
                tranf = ler.nextFloat();
                System.out.println("Você acabou de tranferir "+tranf+ "kz");
                p1.sacar(tranf);
                System.out.println("Na sua conta agora tem "+ p1.consultar()+ " kz");
                 p2.depositar(tranf);
                 System.out.println("========================================");
                 System.out.println("A conta Chris Alberto recebeu: "+tranf);
                System.out.println("A conta Chris Alberto tem: "+ (p2.getSaldo_conta_2()+ tranf));
                break;
            default:
                System.out.println("Opcão Invalida!!");
                break;
        }
        
        
        
        
        
    }
    
}
