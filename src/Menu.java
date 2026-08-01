import java.util.Scanner;

public class Menu {

    Hospital hospital = new Hospital();
    Scanner sc = new Scanner(System.in);
    boolean whileRodar = true;
   Paciente selecionarPaciente = null;

   public Paciente escolherPaciente(){
       System.out.println("[1]: " + hospital.paciente.getNome());
       System.out.println("[2]: " + hospital.paciente1.getNome());
       System.out.println("[3]: " + hospital.paciente2.getNome());
       System.out.print("Escolha um paciente: ");

       int opcaoPaciente = sc.nextInt();

       switch (opcaoPaciente) {

           case 1:
               return hospital.paciente;

           case 2:
               return hospital.paciente1;

           case 3:
               return hospital.paciente2;

           default:
               System.out.println("Opção inválida!");
               return null;
   }
   }


    public void rodarMenu(){
        System.out.println("=========================================");
        System.out.println("         HOSPITAL GPT v1.0");
        System.out.println("=========================================");
        System.out.println("Bem-vindo ao Sistema Hospitalar!");
        System.out.println();


        while (whileRodar){
            System.out.println("=========================================");
            System.out.println("              MENU");
            System.out.println("=========================================");
            System.out.println("[1] Mostrar Pacientes");
            System.out.println("[2] Internar Paciente");
            System.out.println("[3] Dar Alta");
            System.out.println("[4] Tirar Sangue");
            System.out.println("[5] Fazer Raio-X");
            System.out.println("[6] Medir Temperatura");
            System.out.println("[7] Sair");
            System.out.println("=========================================");
            System.out.print("Escolha uma opção: ");

            int rodarSelecaoMenu = sc.nextInt();

            switch (rodarSelecaoMenu) {
                case 1:
                    System.out.println("Mostrar Pacientes");
                    hospital.mostrarPaciente();
                    break;

                case 2:
                    System.out.println("Internar Paciente");
                    System.out.println("Qual Paciente vai ser internado?");

                    selecionarPaciente = escolherPaciente();
                    if (selecionarPaciente != null){
                        selecionarPaciente.internar();
                        break;
                    }
                    break;



                case 3:
                    System.out.println("AREA DE ALTA HOSPITAL");
                    System.out.println("Qual Paciente vai receber alta?");

                    selecionarPaciente = escolherPaciente();
                    if (selecionarPaciente != null){
                        selecionarPaciente.darAlta();
                        break;
                    }
                    break;

                case 4:
                    System.out.println("Tirar Sangue");
                    System.out.println("Qual Paciente vai tirar sangue?");

                    selecionarPaciente = escolherPaciente();
                    if (selecionarPaciente != null) {
                        selecionarPaciente.tirarSangue();
                        break;
                    }
                    break;


                case 5:
                    System.out.println("Fazer RAIO-X");
                    System.out.println("Qual Paciente vai fazer o Raio-X?");

                    selecionarPaciente = escolherPaciente();
                    if (selecionarPaciente != null){
                        selecionarPaciente.raioX();
                        break;
                    }
                    break;

                case 6:
                    System.out.println("Aferir temperatura");
                    System.out.println("Qual Paciente vai aferir a temperatura");
                    selecionarPaciente = escolherPaciente();

                    if (selecionarPaciente != null){
                        selecionarPaciente.aferirTemperatuda();
                        break;
                    } break;

                case 7:
                    System.out.println("Saindo do Hospital");
                    whileRodar = false;
                    break;
            }

        }


    }

}
