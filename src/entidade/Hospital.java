package entidade;

public class Hospital {

    Paciente carlos = new Paciente();
    Paciente lucas = new Paciente();

    PacienteConvenio ana = new PacienteConvenio();
    PacienteConvenio luana = new PacienteConvenio();


    public Hospital(){
        cadastrarPaciente();
    }

public void cadastrarPaciente(){
    carlos.setNome("Carlos");
    carlos.setIdade(25);
    carlos.setSaldo(550);
    carlos.setInternado(true);
    System.out.println("");


    lucas.setNome("Lucas");
    lucas.setIdade(50);
    lucas.setSaldo(175);
    lucas.setInternado(false);
    System.out.println("");


    ana.setNome("Ana");
    ana.setIdade(6);
    ana.setSaldo(300);
    ana.setInternado(false);
    ana.setNomeConvenio("Unimed");
    ana.setValorDesconto(100);
    System.out.println("");

    luana.setNome("Luana");
    luana.setIdade(24);
    luana.setSaldo(1000);
    luana.setInternado(true);
    luana.setNomeConvenio("Bradesco");
    luana.setValorDesconto(200);
    System.out.println("");


}
public Paciente getCarlos(){
    return carlos;

}
    public Paciente getLucas(){
        return lucas;

    }
    public PacienteConvenio getAna(){
        return ana;

    }

    public PacienteConvenio getLuana(){
        return luana;

    }

    public void mostrarPacientes (){
        getLucas().mostrarPaciente();
        System.out.println("");

        getCarlos().mostrarPaciente();
        System.out.println("");

        getAna().mostrarPaciente();
        System.out.println("");

        getLuana().mostrarPaciente();
    }
}
