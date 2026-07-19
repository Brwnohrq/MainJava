package entidade;

import java.util.Scanner;

public class Menu {

    private Hospital hospital = new Hospital();
    private Scanner sc = new Scanner(System.in);
    private boolean rodarMenu = true;

    public void rodarMenu(){
        while (rodarMenu){
        System.out.println("Sistema do Hospital");
        System.out.println("[1]: Consultar Pacientes");
        System.out.println("[2]: Dar Alta");
        System.out.println("[3]: Pagar Conta");
        System.out.println("[4]: Internar Paciente");
        System.out.println("[5]: Sair do Hospital");
        int opcao = sc.nextInt();
            switch (opcao){

                case 1:
                    System.out.println("Mostrar Pacientes");
                    hospital.mostrarPacientes();
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Dar Alta");
                    System.out.println("Quem vai receber Alta?");
                    System.out.println("[1]: Lucas ");
                    System.out.println("[2]: Carlos ");
                    System.out.println("[3]: Luana ");
                    System.out.println("[4]: Ana ");
                    int opcaoAlta = sc.nextInt();
                        switch (opcaoAlta){
                            case 1:
                                System.out.println("=== Painel de Alta ===");
                                System.out.println("Paciente: " + hospital.getLucas().getNome());
                                if(hospital.getLucas().darAlta()){
                                    System.out.println("Paciente recebeu alta com sucesso.");
                                } else {
                                    System.out.println("Paciente ja nao estava mais internado");
                                }
                                break;


                            case 2:
                                System.out.println("=== Painel de Alta ===");
                                System.out.println("Paciente: " + hospital.getCarlos().getNome());
                                if (hospital.getCarlos().darAlta()){
                                    System.out.println("Paciente recebeu alta com sucesso.");
                                } else {
                                    System.out.println("Paciente ja nao estava mais internado");
                                }
                                break;

                            case 3:
                                System.out.println("=== Painel de Alta ===");
                                System.out.println("Paciente: " + hospital.getLuana().getNome());
                                if (hospital.getLuana().darAlta()){
                                    System.out.println("Paciente recebeu alta com sucesso.");
                                } else {
                                    System.out.println("Paciente ja nao estava mais internado");
                                }
                                break;

                            case 4:
                                System.out.println("=== Painel de Alta ===");
                                System.out.println("Paciente: " + hospital.getAna().getNome());
                                if (hospital.getAna().darAlta()){
                                    System.out.println("Paciente recebeu alta com sucesso");
                                } else {
                                    System.out.println("Paciente ja nao estava mais internado");
                                }
                                break;
                        } break;

                case 3:
                    System.out.println("=== Painel de Conta ===");
                    System.out.println("[1]: Conta de Lucas");
                    System.out.println("[2]: Conta de Carlos");
                    System.out.println("[3]: Conta de Luana");
                    System.out.println("[4]: Conta de Ana");
                    int opcaoConta = sc.nextInt();
                        switch (opcaoConta){
                            case 1:
                                System.out.println("=== Painel de Pagamento ===");
                                System.out.println("Paciente: " + hospital.getLucas().getNome());
                                System.out.println("Digite o valor da conta:");
                                double valorConta = sc.nextDouble();
                                if (valorConta <= 0) {
                                    System.out.println("Valor invalido!");
                                    break;
                                }

                                if (hospital.getLucas().pagarConta(valorConta)){
                                    System.out.println("Conta Paga com sucesso");
                                } else {
                                    System.out.println("Saldo insufiente para pagar a conta");
                                } break;


                            case 2:
                                System.out.println("=== Painel de Pagamento ===");
                                System.out.println("Paciente: " + hospital.getCarlos().getNome());
                                System.out.println("Digite o valor da conta:");
                                valorConta = sc.nextDouble();
                                if (valorConta <= 0) {
                                    System.out.println("Valor invalido!");
                                    break;
                                }

                                if (hospital.getCarlos().pagarConta(valorConta)){
                                    System.out.println("Conta Paga com sucesso");
                                } else {
                                    System.out.println("Saldo insufiente para pagar a conta");
                                } break;

                            case 3:
                                System.out.println("=== Painel de Pagamento ===");
                                System.out.println("Paciente: " + hospital.getLuana().getNome());
                                System.out.println("Digite o valor da conta:");
                                valorConta = sc.nextDouble();
                                if (valorConta <=0){
                                    System.out.println("Valor invalido");
                                    break;
                                }
                                if (valorConta <= hospital.getLuana().getValorDesconto()) {
                                    System.out.println("Tratamento Gratuido, cobrado pelo Convenio");

                                } else if (valorConta > hospital.getLuana().getValorDesconto()){
                                    double totalPosDesconto = (valorConta - hospital.getLuana().getValorDesconto());
                                    System.out.println("Desconto: " +hospital.getLuana().getValorDesconto());
                                    System.out.println("Total: " + valorConta);
                                    System.out.println("Total a Pagar: " + totalPosDesconto  );

                                if (hospital.getLuana().pagarConta(valorConta)){
                                    System.out.println("Conta Paga com Sucesso");
                                } else {
                                    System.out.println("Saldo Insuficiente");}
                                } break;


                            case 4:
                                System.out.println("=== Painel de Pagamento ===");
                                System.out.println("Paciente: " + hospital.getAna().getNome());
                                System.out.println("Digite o valor da conta:");
                                valorConta = sc.nextDouble();
                                if (valorConta <=0){
                                    System.out.println("Valor invalido");
                                    break;
                                }

                                if (valorConta <= hospital.getAna().getValorDesconto()){
                                    System.out.println("Tratamento Gratuido, cobrado pelo Convenio");

                                } else if (valorConta > hospital.getAna().getValorDesconto()){
                                    double totalPosDesconto = (valorConta - hospital.getAna().getValorDesconto());
                                    System.out.println("Desconto: " +hospital.getAna().getValorDesconto());
                                    System.out.println("Total: " + valorConta);
                                    System.out.println("Total a Pagar: " + totalPosDesconto);

                                    if (hospital.getAna().pagarConta(valorConta)){
                                        System.out.println("Conta Paga com Sucesso");
                                    } else {
                                        System.out.println("Saldo Insuficiente");}
                                } break;
                        } break;

                case 4:
                    System.out.println("=== Painel de Internacao ===");
                    System.out.println("Quem vai ser internado?");
                    System.out.println("[1]: Lucas ");
                    System.out.println("[2]: Carlos ");
                    System.out.println("[3]: Luana ");
                    System.out.println("[4]: Ana ");
                    int opcaoInternacao = sc.nextInt();
                        switch (opcaoInternacao){

                            case 1:
                                System.out.println("=== Painel de Internacao ===");
                                System.out.println("Paciente:" +hospital.getLucas().getNome());
                                System.out.println("Convenio: N/A" );
                                hospital.getLucas().internar();
                                break;

                            case 2:
                                System.out.println("=== Painel de Internacao ===");
                                System.out.println("Paciente:" +hospital.getCarlos().getNome());
                                System.out.println("Convenio: N/A" );
                                hospital.getCarlos().internar();
                                break;

                            case 3:
                                System.out.println("=== Painel de Internacao ===");
                                System.out.println("Paciente:" +hospital.getLuana().getNome());
                                System.out.println("Convenio: " + hospital.getLuana().getNomeConvenio());
                                hospital.getLuana().internar();
                                break;

                            case 4:
                                System.out.println("=== Painel de Internacao ===");
                                System.out.println("Paciente:" +hospital.getAna().getNome());
                                System.out.println("Convenio:" +hospital.getAna().getNomeConvenio());
                                hospital.getAna().internar();
                                break;

                        } break;


                case 5:
                    System.out.println("Saindo do Hospital");
                    rodarMenu = false;
                    return;

            }
    }




}}