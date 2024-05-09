import java.util.Scanner;

public class ContaTerminal {
   
    public static void main(String[] args) {
        double saldo = 0;
        String nomeCompletoCliente;

        Scanner teclado = new Scanner(System.in); 
        DioBank chamada = new DioBank();
        
        chamada.chamadaBanco();

        String nome = teclado.nextLine();
      
        System.out.println("---------------------------------------");
        System.out.println("Agora informe seu sobrenome: ");
        System.out.println("---------------------------------------");

        String sobrenome = teclado.nextLine();

        nomeCompletoCliente = nome + " " + sobrenome;

        System.out.println("---------------------------------------");
        System.out.println("Para podermos prosseguir, digite sua \nagência e conta nessa ordem. ");
        System.out.println("---------------------------------------");

        System.out.println("Agência: ");
        int agencia = teclado.nextInt();

        System.out.println("Conta: ");
        int conta = teclado.nextInt();

        System.out.println("---------------------------------------");

        System.out.println("Qual valor do seu primeiro depósito?");

        double deposito = teclado.nextDouble();
        saldo = saldo + deposito;       

        System.out.println("---------------------------------------");
        System.out.println("Olá " + nomeCompletoCliente + ",\nObrigado por criar uma conta em nosso banco, \nSua agência é: " + 
                           agencia + "\nConta :" + conta + 
                           "\nSeu saldo de " + saldo + 
                           "\njá está disponível para saque.");
        System.out.println("---------------------------------------");


        teclado.close();       
    }
    

    
   
}
