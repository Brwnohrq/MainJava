import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

public class CaixaEletronico {
    Mercado mercado = new Mercado();
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    ArrayList <String> carrinho = new ArrayList <String>();


    boolean rodarWhile = true;

    public boolean rodarMenu() {

        while (rodarWhile) {

            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Consultar produtos por nome");
            System.out.println("3 - Mostrar todos os produtos");
            System.out.println("4 - Apagar Produto");
            System.out.println("5 - Alterar Produto");
            System.out.println("6 - Sair do menu");
            int escolherMenu = sc.nextInt();

            switch (escolherMenu){

                case 1:
                    System.out.println("Menu Cadastro de Produto");

                    System.out.println("Digite o Nome do Produto");
                    String nomeP = sc.next();

                    System.out.println("Digite o Preco do Produto");
                    double precoP = sc.nextDouble();

                    System.out.println("Digite a quantidade em Estoque");
                    int quantidadeP = sc.nextInt();

                    mercado.cadastrarProduto(nomeP,quantidadeP,precoP);
                    break;

                case 2:
                    System.out.println("Buscar Produto por Nome");
                    System.out.println("Digite o nome do Produto");
                    String nomeBuscar = sc.next();
                    boolean buscandoProduto = mercado.buscarProduto(nomeBuscar);

                    if (!buscandoProduto){

                        System.out.println("Produto Inexistente");
                        break;
                    }

                    System.out.println("Adicionar o Produto " + nomeBuscar + " Ao carrinho?");
                    System.out.println("[1]: Sim.");
                    System.out.println("[2]: Nao.");
                    int carrinhoAdd = sc.nextInt();



                   switch (carrinhoAdd){
                       case 1:
                           carrinho.add(nomeBuscar);
                           System.out.println("Adicionado ao Carrinho");
                           System.out.println(carrinho);
                           break;

                       case 2:
                           continue;
                   }
                   break;


                case 3:
                    System.out.println("MOSTRAR TODO O ESTOQUE");
                    mercado.mostrarProduto();
                    break;


                case 4:
                    System.out.println("APAGAR PRODUTO");
                    System.out.println("Qual o nome do Produto?");
                    String nomeAp = sc.next();
                    System.out.println("Qual o Preco desse Produto?");
                    double precoAp = sc.nextDouble();
                    System.out.println("E quantas Unidades ele tem pra apagar?");
                    int unidadeAp = sc.nextInt();

                    mercado.apagarProduto(nomeAp,precoAp,unidadeAp);
                    break;

                case 5:
                    System.out.println("Alterar Preco do Produto");
                    System.out.println("Qual o Novo Preco do Produto?");
                    double precoNovo = sc.nextDouble();
                    System.out.println("Como esse Produto chama?");
                    String nomeProdutoAlterado = sc.next();

                    mercado.alterarPrecoProduto(precoNovo,nomeProdutoAlterado);
                    break;

                case 6:
                    System.out.println("SAINDO DO APLICATIVO");
                    rodarWhile = false;
                    break;

                default:
                    System.out.println("Opcao Invalida!");
                    break;
            }


        } return false;

    }

}