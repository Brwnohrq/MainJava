import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("=========================");
        System.out.println("Bem vindo ao Mercado SVB1");
        System.out.println("=========================");
        System.out.println(" ");
        System.out.println("Corredores Online ");
        System.out.println("");
        System.out.println("Digite qual Corredor deseja ir ⬇️");
        System.out.println("");
        System.out.println("Corredor 1 = Corredores de Cereais 🌾");
        System.out.println("Corredor 2 = Corredores de Temperos 🧅");
        System.out.println("Corredor 3 = Corredores de Bebidas 🥤");
        System.out.println("Corredor 3 = Consultar carrinho de compras 🛒");

            Scanner scanner = new Scanner(System.in);
            int opcaoInicial = scanner.nextInt();

            //Quantidade
            int arrozQ = 5;
            int feijaoQ = 8;
            int macarraoQ = 10;
            int cebolaQ = 20;
            int alhoQ = 10;
            int salQ = 123;
            int aguaQ = 24;
            int refrigeranteQ = 6;
            int cervejaQ = 12;




           //Preco
            double arrozP = 26.90;
            double feijaoP = 13.90;
            double macarraoP = 6.90;
            double cebolaP = 5.90;
            double alhoP = 13.90;
            int salP = 3;
            double aguaP = 4.09;
            double refrigeranteP = 10.90;
            double cervejaP = 5.59;


            int comprarArroz;
            int comprarMacarrao;
            int comprarFeijao;
            int comprarAlho;
            int comprarCebola;
            int comprarSal;
            int comprarAgua;
            int comprarCerveja;
            int comprarRefrigerante;

            switch (opcaoInicial) {
                case 1:
                    System.out.println("===================");
                    System.out.println("Corredor de Cereais");
                    System.out.println("Opcao 1 = Arroz");
                    System.out.println("Opcao 2 = Macarrao");
                    System.out.println("Opcao 3 = Feijao");
                    int opcaoCereal = scanner.nextInt();
                     switch (opcaoCereal) {
                         case 1:
                             System.out.println("DESCRICAO DO PRODUTO");
                             System.out.println("");
                             System.out.println("Arroz Branco");
                             System.out.println("Preco unitario R$ = " + arrozP);
                             System.out.println("Quantidade = " + arrozQ);
                             System.out.println("");
                             System.out.println("Digite a quantidade desejada");
                             comprarArroz = scanner.nextInt();
                             if (comprarArroz > arrozQ) {
                                 System.out.printf("Tem apenas %d no estoque %n.", arrozQ);
                                 break;
                             } else {
                                 int arrozRestante = arrozQ -= comprarArroz;
                                 System.out.println("Você comprou " + comprarArroz);
                                 double valorArroz = (comprarArroz * arrozP);
                                 System.out.printf("🛒 Seu carrinho está com %d arroz %n.", comprarArroz);
                                 System.out.printf("💰 Valor total: R$ %.2f\n", valorArroz);
                                 System.out.println("🌾 Estoque restante: " + arrozRestante);
                                 break;
                             }

                         case 2:
                             System.out.println("DESCRICAO DO PRODUTO");
                             System.out.println("");
                             System.out.println("Macarrao Espaguete");
                             System.out.println("Preco unitario = 6,90");
                             System.out.println("Quantidade = 10");
                             System.out.println("");
                             System.out.println("Digite a quantidade desejada");
                             comprarMacarrao = scanner.nextInt();
                             if (comprarMacarrao > macarraoQ) {
                                 System.out.println("O Estoque atual do Macarrao é 10, nao pode comprar mais que isso");
                                 break;
                             } else {
                                 System.out.println("Voce comprou " + comprarMacarrao + " Macarrao");
                                 System.out.printf("🛒 Seu carrinho está com %d Macarrao %n", comprarMacarrao);
                                 double valorMacarrao = (comprarMacarrao * macarraoP);
                                 System.out.printf("💰Valor total: R$ %.2f %n", valorMacarrao);
                                 int estoqueMacarraoFinal = (macarraoQ -= comprarMacarrao);
                                 System.out.println("");
                                 System.out.println("🌾 Estoque restante:" + estoqueMacarraoFinal);
                                 break;
                             }
                         case 3:
                             System.out.println("DESCRICAO DO PRODUTO");
                             System.out.println("");
                             System.out.println("Feijao Carioca ");
                             System.out.println("Preco unitario R$: " + feijaoP);
                             System.out.println("Quantidade = " + feijaoQ);
                             System.out.println("");
                             System.out.println("Digite a quantidade desejada");
                             comprarFeijao = scanner.nextInt();
                             double valorFeijao = (comprarFeijao * feijaoP);
                             if (comprarFeijao > feijaoQ) {
                                 System.out.println("Voce nao pode comprar tudo isso, tem apenas " + feijaoQ + " unidades");
                                 break;
                             } else {
                                 System.out.printf("Voce comprou %d unidades %n", comprarFeijao);
                                 System.out.printf("🛒 Seu carrinho está com %d Pacote de Feijao %n", comprarFeijao);
                                 System.out.printf("💰Valor total: R$ %.2f %n", valorFeijao);

                                 int estoqueFeijaoF = (feijaoQ -= comprarFeijao);
                                 System.out.println("🌾 Estoque restante: " + estoqueFeijaoF + " unidades disponiveis");
                             }  break;
                                            default:System.out.println("Opcao invalida");

                     } break;

                case 2:
                    System.out.println("=====================");
                    System.out.println("Corredor de Temperos Naturais");
                    System.out.println("");
                    System.out.println("Opcao 1 = Cebola Roxa");
                    System.out.println("Opcao 2 = Alho");
                    System.out.println("Opcao 3= Sal Refinado");
                    int opcaoTempero = scanner.nextInt();
                    switch (opcaoTempero) {
                        case 1:
                            System.out.println("DESCRICAO DO PRODUTO");
                            System.out.println("");
                            System.out.println("🧅Cebola Roxa");
                            System.out.println("Preco unitario = 5,90");
                            System.out.println("Quantidade = 20 (unidade)");
                            System.out.println("");
                            System.out.println("Digite a quantidade desejada (em unidade)");
                            comprarCebola = scanner.nextInt();
                            double valorCebola = (comprarCebola * cebolaP);
                            if (comprarCebola > cebolaQ) {
                                System.out.println("Voce nao pode comprar tudo isso, tem apenas " + cebolaQ + "em estoque");
                                break;
                            } else {
                                System.out.println("Voce comprou " + comprarCebola + " Cebolas");
                                System.out.printf("🛒 Seu carrinho está com %d Cebolas %n", comprarCebola);
                                System.out.printf("💰Valor total: R$ %.2f %n", valorCebola);
                                int estoqueCebolaF = (cebolaQ -= comprarCebola);
                                System.out.printf("🧅 Estoque restante: %d unidades disponiveis %n", estoqueCebolaF);
                                break;
                            }

                        case 2:
                            System.out.println("DESCRICAO DO PRODUTO");
                            System.out.println("");
                            System.out.println("🧄Cabeça de alho");
                            System.out.println("Preco unitario = 13,90");
                            System.out.println("Quantidade = 10 (unidade)");
                            System.out.println("");
                            System.out.println("Digite a quantidade desejada (em unidade)");
                            comprarAlho = scanner.nextInt();
                            double valorAlho = (alhoP * comprarAlho);
                            if (comprarAlho > alhoQ) {
                                System.out.printf("voce nao pode comprar essa quantidade, o estoque é de %d %n", alhoQ);

                                break;

                           }else {
                            System.out.println("Voce comprou " + comprarAlho + " Cabeça de alho");
                            System.out.printf("🛒 Seu carrinho está com %d Cabeça de Alho %n", comprarAlho);
                            System.out.printf("💰Valor total: R$ %.2f %n", valorAlho);
                            int estoqueAlhoF = (alhoQ -= comprarAlho);
                            System.out.printf("🧄o estoque atual de cabeça de alho é de %d %n" ,estoqueAlhoF);
                            }
                                break;
                        case 3:

                            System.out.println("DESCRICAO DO PRODUTO");
                            System.out.println("");
                            System.out.println("🧂Pacote de Sal ");
                            System.out.printf("Preco unitario R$: %d,00 %n" ,salP);
                            System.out.printf("Quantidade = %d (unidade)", salQ);
                            System.out.println("");
                            System.out.println("Digite a quantidade desejada");
                            comprarSal = scanner.nextInt();
                            double valorSal = (comprarSal * salP);
                            if (comprarSal >salQ) {
                                System.out.printf("Quantidade indisponivel, no estoque tem apenas %d %n", salQ);
                                break;
                            } else {
                                System.out.printf("voce comprou %d Pacotes de Sal %n", comprarSal);
                                System.out.printf("🛒 Seu carrinho está com %d Pacotes de Sal %n", comprarSal);
                                System.out.printf("💰Valor total: R$ %.2f %n", valorSal);
                                int estoqueSalF = (salQ -= comprarSal);
                                System.out.printf("🧂o estoque atual de Pacotes de Sal é de %d %n", estoqueSalF);
                                    System.out.println("Opcao invalida");
                                    break;
                            }


                } case 3:
                    System.out.println("===================");
                    System.out.println("Corredor de Bebidas");
                    System.out.println("");
                    System.out.println("Opcao 1 = Agua Mineral");
                    System.out.println("Opcao 2 = Cerveja");
                    System.out.println("Opcao 3 = Refrigerante");
                        int opcaoBebida = scanner.nextInt();
                        switch (opcaoBebida){
                            case 1:
                                System.out.println("DESCRICAO DO PRODUTO");
                                System.out.println("💧Agua Mineral");
                                System.out.println("Preco unitario R$ = " +aguaP);
                                System.out.println("Quantidade em estoque = " +aguaQ);
                                System.out.println("Digite a quantidade desejada");
                                comprarAgua = scanner.nextInt();
                                if (comprarAgua > aguaQ) {
                                    System.out.printf("o seu pedido ultrapassa o estoque que é de = %d Unidades %n", aguaQ);
                                    break;
                                } else {
                                    System.out.println("Voce comprou = " +comprarAgua + "unidades de Agua Mineral");
                                    System.out.printf("🛒 Seu carrinho está com %d Unidades de Agua Mineral %n", comprarAgua);
                                    double valorAgua = (comprarAgua * aguaP);
                                    System.out.printf("💰Valor total: R$ %.2f %n", valorAgua);
                                    int estoqueAguaF = (aguaQ -= comprarAgua);
                                    System.out.printf("💧o estoque atual de Garrafas de Agua Mineral é de %d %n", estoqueAguaF);
                                }   break;


                            case 2:
                                System.out.println("DESCRICAO DO PRODUTO");
                                System.out.println("🍺 Ceveja ChatGPT");
                                System.out.println("Preco unitario R$ = " +cervejaP);
                                System.out.println("Quantidade em estoque = " +cervejaQ);
                                System.out.println("Digite a quantidade desejada");
                                comprarCerveja = scanner.nextInt();
                                if (comprarCerveja > cervejaQ) {
                                    System.out.printf("o seu pedido ultrapassa o estoque que é de = %d Unidades %n", cervejaQ);
                                    break;
                                } else {
                                    System.out.println("Voce comprou = " +comprarCerveja + "unidades de Garrafas de Cerveja");
                                    System.out.printf("🛒 Seu carrinho está com %d Unidades de Garrafas de Cerveja %n", comprarCerveja);
                                    double valorCerveja = (comprarCerveja * cervejaP);
                                    System.out.printf("💰Valor total: R$ %.2f %n", valorCerveja);
                                    int estoqueCervejaF = (cervejaQ -= comprarCerveja);
                                    System.out.printf("💧o estoque atual de Garrafas de Agua Mineral é de %d %n", estoqueCervejaF);
                                }   break;


                            case 3:
                                System.out.println("DESCRICAO DO PRODUTO");
                                System.out.println("🥤Fardo de Refrigerante");
                                System.out.println("Preco unitario R$ = " +refrigeranteP);
                                System.out.println("Quantidade em estoque = " +refrigeranteQ);
                                System.out.println("Digite a quantidade desejada");
                                comprarRefrigerante = scanner.nextInt();
                                if (comprarRefrigerante > refrigeranteQ) {
                                    System.out.printf("o seu pedido ultrapassa o estoque que é de = %d Unidades %n", refrigeranteQ);
                                    break;
                                } else {
                                    System.out.println("Voce comprou = " +comprarRefrigerante + "Fardos de Refrigerante");
                                    System.out.printf("🛒 Seu carrinho está com %d Fardos de Refrigerante %n", comprarRefrigerante);
                                    double valorRefrigerante = (comprarRefrigerante * refrigeranteP);
                                    System.out.printf("💰Valor total: R$ %.2f %n", valorRefrigerante);
                                    int estoqueRefrigeranteF = (refrigeranteQ -= comprarRefrigerante);
                                    System.out.printf("💧o estoque atual de Garrafas de Agua Mineral é de %d %n", estoqueRefrigeranteF);
                                }   break;
                        }

                    case 4:
                        System.out.println("Consultar carrinho de compras");
                        System.out.println("Opcao 1 = Consultar Quantidade e Produtos");
                        System.out.println("Opcao 2 = Consultar o preço do Carrinho");
                        System.out.println("Opcao 3 = Finaliar compras");
                        System.out.println("");
                        System.out.println("Escolha uma das opcoes acima");

                        int opcaoConsulta = scanner.nextInt();
                            switch (opcaoConsulta){
                                case 1:
                                    System.out.println("DETALHES DO CARRINHO");
                                    System.out.println("Consultar Quantidades e Produtos Comprador");
                                    System.out.println("Produtos Cereais ⬇️");

                            }
            }}}




