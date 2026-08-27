import java.util.Scanner;
import java.util.ArrayList;

public class CaixaEletronico {

    ArrayList<String>  carrinho = new ArrayList<>();

    Mercado mercado = new Mercado();
    Scanner sc = new Scanner(System.in);

    boolean whileR = true;

    public void rodarMenu(){
        while (whileR){

            System.out.println("[1]: Mostrar Produtos");
            System.out.println("[2]: Buscar Produtos");
            System.out.println("[3]: Ver Carrinho");
            System.out.println("[4]: Finalizar Carrinho");
            System.out.println("[5]: Cadastrar Produtos");
            System.out.println("[6]: Sair do Mercadinho");

            int opcaoMenu = sc.nextInt();

            switch (opcaoMenu){

                case 1:
                    System.out.println("Mostrar Produtos");
                    mercado.mostrarProduto();
                    break;

                case 2:
                    boolean produtoSelecionado;
                    System.out.println("Buscar Produto");
                    System.out.println("Qual produto quer buscar?");
                    sc.nextLine();
                    String nomeBuscar = sc.nextLine();
                    produtoSelecionado = mercado.buscarProduto(nomeBuscar);

                    if (!produtoSelecionado){
                        continue;

                    }

                    System.out.println("[1]: Adicionar Ao carrinho");
                    System.out.println("[2]: Voltar Ao Menu");
                    int carrinhoMenu = sc.nextInt();
                    switch (carrinhoMenu){

                        case 1:
                           carrinho.add(nomeBuscar);
                            System.out.println("Produto adicionado ao carrinho");
                            continue;

                        case 2:
                            System.out.println("Voltando ao Menus");
                            break;
                }
                    break;


                case 3:
                    System.out.println("Ver Carrinho de Produtos");
                    for (String produto : carrinho)
                        System.out.println(produto);
                    break;

                case 4:
                    System.out.println("Finalizando Carrinho");
                    if (carrinho.isEmpty()){
                        System.out.println("Seu carrinho estava vazio");
                        break;
                    }
                    System.out.println("Seu carrinho esta com");
                    for (String produto : carrinho)
                        System.out.println(produto);
                    System.out.println("Carrinho Finalizado");
                    carrinho.clear();
                    break;

                case 5:
                    System.out.println("CADASTRAR PRODUTO");
                    System.out.println("Qual o Nome do Produto?");
                    String nome = sc.nextLine();
                    System.out.println("Qual a Quantidade em estoque?");
                    int quantidade = sc.nextInt();
                    System.out.println("Qual o preco de venda?");
                    double preco = sc.nextDouble();

                    mercado.cadastrarProduto(nome,quantidade,preco);
                    break;

                case 6:
                    System.out.println("SAINDO DO MERCADO");
                    whileR = false;
                    break;

                default:
                    System.out.println("Opcao Invalida!");
                    break;
            }

        }
    }

}
