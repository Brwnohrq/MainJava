import java.util.Scanner;

public class MenuUtils {


    public boolean opcaoEscolha (Scanner sc, String pergunta){
        System.out.println(pergunta);
        System.out.println("[1]: SIM");
        System.out.println("[2]: NAO");
        int resposta = sc.nextInt();
        sc.nextLine();
        return resposta == 1;
    }

    public void mostrarMenu(){
        System.out.println("\n==========================================");
        System.out.println("             🏦 BANCO JAVA");
        System.out.println("==========================================");
        System.out.println("[1]  Cadastrar Cliente");
        System.out.println("[2]  Buscar Cliente");
        System.out.println("[3]  Criar Conta");
        System.out.println("[4]  Buscar Conta");
        System.out.println("[5]  Consultar Saldo");
        System.out.println("[6]  Depositar");
        System.out.println("[7]  Sacar");
        System.out.println("[8]  Transferir");
        System.out.println("[9]  Excluir Cliente");
        System.out.println("[10] Desativar Conta");
        System.out.println("[11] Mostrar Todos os Clientes");
        System.out.println("[12] Mostrar Todas as Contas");
        System.out.println("[13] Sair");
        System.out.println("==========================================");
        System.out.print("Escolha uma opção: ");
    }


    public String pedirNome(Scanner sc){
        System.out.println("Digite o Nome");
        String nome = sc.nextLine();
        return nome;
    }
    public Integer pedirId (Scanner sc){
        System.out.println("Digite o seu ID");
        int id = sc.nextInt();
        return id;
    }
    public Double pedirValor(Scanner sc){
        System.out.println("Digite o valor");
        double valor = sc.nextDouble();
        return valor;
    }
    public String pedirCpf (Scanner sc){
        System.out.println("Digite o numero do CPF");
        String cpf = sc.next();
        return cpf;
    }
    public boolean validarValorNegativo (double valor){
        if (valor <= 0){
            return false;
        }
        return true;
    }

}
