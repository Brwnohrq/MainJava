public class Hospital {

    Paciente paciente = new Paciente();
    Paciente paciente1 = new Paciente();
    Paciente paciente2 = new Paciente();

    public Hospital(){
        paciente.setNome("Bruno");
        paciente.setIdade(28);
        paciente.setTemperatura(37);
        paciente.setInternado(false);
        paciente.setNumeroConsultas(0);


        paciente1.setNome("Alessandra");
        paciente1.setIdade(27);
        paciente1.setTemperatura(37);
        paciente1.setInternado(false);
        paciente1.setNumeroConsultas(0);

        paciente2.setNome("Joaquim");
        paciente2.setIdade(34);
        paciente2.setTemperatura(40);
        paciente2.setInternado(true);
        paciente2.setNumeroConsultas(0);
    }

    public void mostrarPaciente(){
        paciente.cadastrarPaciente();
        System.out.println(" ");
        paciente1.cadastrarPaciente();
        System.out.println(" ");
        paciente2.cadastrarPaciente();
        System.out.println(" ");
    }
}
