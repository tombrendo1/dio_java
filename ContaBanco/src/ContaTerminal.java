import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nome_cliente, senha, agencia;
        int  numero_conta, possui_conta;
        double saldo;
       
        //mensagem de apresentação
        System.out.println("Seja bem vindo ao Banco santander!");
        System.out.println("Você já possui uma conta, digite 1 para Sim e 0 para se cadastar");
        possui_conta = sc.nextInt();

       
        sc.nextLine();

        if (possui_conta == 1) {
            System.out.println("Por favor informe o numero e senha da conta");
            System.out.print("Por favor informe o numero da conta:");
            numero_conta = sc.nextInt();
            sc.nextLine();
            System.out.print("Por favor informe a senha:");
            senha = sc.nextLine();
            System.out.println("Dados incorretos");
            System.out.println("Desaja se cadastar digite 1 para Sim e 0 para Sair ");
            
            possui_conta = sc.nextInt();
            if (possui_conta== 1) {
                System.out.println("Casdastrando novo cliente.");
                System.out.print("Por favor informe o numero da conta:");
                numero_conta = sc.nextInt();
                sc.nextLine();

                System.out.print("Seu nome:");
                nome_cliente = sc.nextLine();
              

                System.out.print("Agência:");
                agencia = sc.nextLine();
                

                System.out.print("Qual valor você quer depositar:");
                saldo = sc.nextDouble();
                

                
                System.out.println("Dados cadastrados!");
                sc.nextLine();
                System.out.println("sejá bem vindo:" +nome_cliente +"!");
                System.out.println("Obrigado por criar uma conta no nosso banco, a sua agência é:"+agencia);
                System.out.println("Seu numero da conta:" +numero_conta);
                System.out.println("Seu saldo disponível para saque:" +saldo);





            } else {
                System.out.println("Você saiu!");
                System.out.println("Santander, inovando para você crescer");
            }
        } else {
           
            System.out.println("Casdastrando novo cliente.");
                System.out.print("Por favor informe o numero da conta:");
                numero_conta = sc.nextInt();
                System.out.print("Seu nome:");
                sc.nextLine();
                nome_cliente = sc.nextLine();
                System.out.print("Agência:");
                agencia = sc.nextLine();
                System.out.print("Qual valor você quer depositar:");
                saldo = sc.nextDouble();
                
                System.out.println("Dados cadastrados!");
                
                System.out.println("sejá bem vindo:" +nome_cliente +"!");
                System.out.println("Obrigado por criar uma conta no nosso banco, a sua agência é:"+agencia);
                System.out.println("Seu numero da conta:" +numero_conta);
                System.out.println("Seu saldo disponível para saque:" +saldo);

        } 

        
       
    }
}
