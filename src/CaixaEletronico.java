import java.util.Scanner;

public class CaixaEletronico {

    Banco banco = new Banco();
    MenuUtils menus = new MenuUtils();

    Scanner sc = new Scanner(System.in);
    private boolean rodarWhile = true;



    public void rodarMenu(){

        while (rodarWhile){
           menus.mostrarMenu();
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    cadastrarClienteFluxo();
                    break;

                    case 2:
                        buscarClienteCX();
                        break;

                case 3:
                        criarContaFluxo();
                        break;

                case 4:
                    buscarContaFluxo();
                        break;

                case 5:
                    consultarSaldoFluxo();
                    break;

                case 6:
                    depositarFluxo();
                    break;

                case 7:
                    sacarFluxo();
                    break;

                case 8:
                    transferirFluxo();
                    break;

                case 9:
                    excluirClienteFluxo();
                    break;

                case 10:
                    desativarContaFluxo();
                    break;

                case 11:
                    mostrarClientes();
                    break;

                case 12:
                    mostrarContaFluxo();
                    break;

                case 13:
                    System.out.println("Saindo do Aplicativo");
                    rodarWhile = false;
                    break;

                default:
                    System.out.println("Opcao Invalida!");
                    break;


            }
        }

    }



            public boolean cadastrarClienteFluxo (){
            boolean quiserFazerCadastro = menus.opcaoEscolha(sc,"Deseja Cadastrar um novo cliente?");

            if (!quiserFazerCadastro) {
                System.out.println("Decidiu por nao fazer o Cadastro, voltando ao Menu");
                return false;
            }
               String nome = menus.pedirNome(sc);
                if (!nome.matches("^[a-zA-ZÀ-ÿ ]+$")){
                    System.out.println("Digite apenas Letras");
                    return false;
                }

                String cpf = menus.pedirCpf(sc);
                if (!cpf.matches("^[0-9]{11}$")){
                    System.out.println("Digite apenas os 11 Numeros");
                    return false;
                }

                boolean cadastro = banco.cadastrarCliente(nome, cpf);
                if (!cadastro){
                    return false;
                }
                System.out.println("Cadastro Finalizado");
                System.out.printf("Nome : %s CPF: %S",nome,cpf);
                return true;
            }


            public String buscarClienteCX (){
                boolean quiserBuscarCliente = menus.opcaoEscolha(sc,"Deseja Buscar novo cliente?");

                if (!quiserBuscarCliente){
                    System.out.println("Decidiu por nao Buscar o Cliente, voltando ao Menu");
                    return null;
                }
                int id = menus.pedirId(sc);
                String resultado = banco.buscarCliente(id);

                if (resultado == null){
                    System.out.println("ID nao encontrado");
                    return null;
                }

                System.out.println(resultado);
                return resultado;

            }

            public boolean criarContaFluxo(){
                boolean quiserCriarConta = menus.opcaoEscolha(sc,"Deseja Criar uma Conta?");

                if (!quiserCriarConta)  {
                    System.out.println("Decidiu por nao Criar o Cliente, voltando ao Menu");
                    return false;
                }
                int id = menus.pedirId(sc);
                String buscarID = banco.buscarCliente(id);

                System.out.println("Digite o Valor do Primeiro Deposito");
                double primeiroDeposito = sc.nextDouble();

                if (primeiroDeposito <= 0){
                    return false;
                }
                if (buscarID == null){
                    return false;
                }

                banco.criarConta(id,primeiroDeposito);
                return true;
                }

            public boolean buscarContaFluxo(){
            boolean quiserBuscar = menus.opcaoEscolha(sc,"Deseja Buscar Conta");
            if (!quiserBuscar){
                System.out.println("Decidiu por nao Buscar Conta, voltando ao Menu");
                return false;
            }
                int idBuscarConta = menus.pedirId(sc);
            if (idBuscarConta <=0 ){
                System.out.println("ID Invalido, voltando ao Menu");
                return false;
            }
                String mostrarConta = banco.buscarConta(idBuscarConta);
            if (mostrarConta == null){
                return false;
            }
                System.out.println(mostrarConta);
            return true;
            }


            public boolean consultarSaldoFluxo(){
            boolean quiserBuscarSaldo = menus.opcaoEscolha(sc, "Deseja Consulta Saldo?");
            if (!quiserBuscarSaldo){
                return false;
            }
            int idConsultar = menus.pedirId(sc);

            if (idConsultar <= 0){
                return false;
            }
            Double mostrarSaldo = banco.buscarSaldo(idConsultar);
            if (mostrarSaldo == -1){
                return false;
            }
                System.out.println(mostrarSaldo);
                return true;
            }



            public boolean depositarFluxo(){
            boolean quiserDepositar = menus.opcaoEscolha(sc,"Deseja Fazer um Deposito?");
            if (!quiserDepositar){
                return false;
            }
            int idDeposito = menus.pedirId(sc);
            if (idDeposito <= 0){
                System.out.println("ID Invalido, voltando ao Menu");
                return false;
            }

            double valorDeposito = menus.pedirValor(sc);
            if (!menus.validarValorNegativo (valorDeposito)){
                return false;
            }
            Double saldoAntesDeposito = banco.buscarSaldo(idDeposito);
            if (saldoAntesDeposito == -1 ){
                System.out.println("Conta nao encontrada");
                return false;
            }
                System.out.println("Seu Saldo era de R$: " + saldoAntesDeposito);

            Double depositoFeito = banco.depositar(idDeposito,valorDeposito);
            if (depositoFeito == -1 ){
                return false;
            }
                System.out.println("O Valor do Deposito foi de R$: " + valorDeposito);
                System.out.println("Deposito Efetuado, Saldo Final R$: " + depositoFeito);

            return true;
            }

            public boolean sacarFluxo(){
            boolean quiserSacar = menus.opcaoEscolha(sc,"Deseja Fazer um Saque?");
            if (!quiserSacar){
                return false;
            }
            int idSaque = menus.pedirId(sc);
            if (idSaque <=0){
                System.out.println("ID Invalido, voltando ao Menu");
                return false;
            }
            double buscarSaldo = banco.buscarSaldo(idSaque);
            if (buscarSaldo == -1 ){
                System.out.println("Conta nao encontrada");
                return false;
            }

            double valorSaque = menus.pedirValor(sc);

            if (!menus.validarValorNegativo(valorSaque)){
                return false;
            }
                System.out.println("Saldo Antes do Saque R$: " +buscarSaldo);
                System.out.println("Valor do Saque R$: " + valorSaque);


            double saqueFeito = banco.saque(idSaque,valorSaque);

            if (saqueFeito == -1){
                System.out.println("Erro ao realizar saque");
                return false;
            }
                System.out.println("Saldo Pos Saque R$: " + saqueFeito);
                return true;
            }





            public boolean transferirFluxo(){
            boolean quiserTransferir = menus.opcaoEscolha(sc,"Deseja Fazer uma transferencia?");
            if (!quiserTransferir){
                return false;
            }
            int idDepositor = menus.pedirId(sc);
            if (idDepositor <= 0){
                System.out.println("ID Invalido, voltando ao Menu");
                return false;
            }
            double saldoDepositor = banco.buscarSaldo(idDepositor);
            if (saldoDepositor == -1) {
                System.out.println("Conta nao encontrada");
                return false;
            }

            double valorDepositor = menus.pedirValor(sc);
            if (!menus.validarValorNegativo(valorDepositor)){
                return false;
            }

            if (valorDepositor > saldoDepositor){
                return false;
            }
            int idRecebedor = menus.pedirId(sc);
            if (idRecebedor <= 0){
                System.out.println("ID Invalido, voltando ao Menu");
                return false;
            }
            if ( idRecebedor == idDepositor){
                return false;
            }

                System.out.println("Saldo Antes da Transferencia R$:" + saldoDepositor);
                System.out.println("Valor da Transferencia R$: " +valorDepositor);

            Double transferenciaFeita = banco.transferencias(idRecebedor,valorDepositor,idDepositor);

            if (transferenciaFeita == -1){
                System.out.println("Erro ao realizar transferencia");
                return false;
            }

                System.out.println("Saldo Disponivel R$: " + transferenciaFeita);

                return true;

            }



            public boolean excluirClienteFluxo(){
            boolean quiserExcluir = menus.opcaoEscolha(sc,"Deseja Excluir Cliente?");
            if (!quiserExcluir){
                return false;
            }
            int excluirId = menus.pedirId(sc);
            String mostrarCliente = banco.buscarCliente(excluirId);
            if (mostrarCliente == null){
                System.out.println("Cliente nao encontrado");
                return false;

            }
                System.out.println(mostrarCliente);

            boolean excluirCliente = menus.opcaoEscolha(sc,"Deseja Exluir esse cliente?");
            if (!excluirCliente) {
                System.out.println("Cliente nao excluido voltando ao menu");
                return false;
            }
                if (!banco.excluirCliente(excluirId)) {
                    System.out.println("Cliente nao foi excluido, tente novamente");
                    return false;
                }

                System.out.println("Cliente excluido com sucesso");
                return true;

            }

            public boolean desativarContaFluxo(){
            boolean quiserDesativar = menus.opcaoEscolha(sc,"Deseja Desativar a conta?");
            if (!quiserDesativar){
                System.out.println("Voltando ao Menu");
                return false;
            }
            Integer idDesativar = menus.pedirId(sc);
            if (idDesativar == null){
                return false;
            }
            String verIdDesativar = banco.buscarConta(idDesativar);
            if (verIdDesativar == null){
                System.out.println("Conta nao existe, voltando ao menu");
                return false;
            }
                System.out.println(verIdDesativar);
            boolean quiserInativar = menus.opcaoEscolha(sc,"Deseja inativar essa conta?");
            if (!quiserInativar){
                System.out.println("Voltando ao menu");
                return false;
            }
            boolean inativando = banco.deletarConta(idDesativar);
            if (!inativando){
                System.out.println("Erro,Tente novamente mais tarde");
                return false;
            }
                System.out.println("Conta Inativada com sucesso");
            return true;

            }

            public boolean mostrarContaFluxo(){
            boolean quiserMostrar = menus.opcaoEscolha(sc,"Deseja Mostrar Conta??");
            if (!quiserMostrar){
                System.out.println("Voltando ao menu");
                return false;
            }
            int idConta = menus.pedirId(sc);
            String verConta = banco.buscarConta(idConta);
            if (verConta == null){
                System.out.println("Conta nao encontrada");
                return false;
            }
                System.out.println(verConta);
            return true;
            }



            public boolean mostrarClientes(){
            boolean desejaMostrar = menus.opcaoEscolha(sc,"Mostrar todos os clientes?");
            if (!desejaMostrar){
                return false;
            } else {
                System.out.println(banco.mostrarClientes());
            return true;
            }
        }


    }














