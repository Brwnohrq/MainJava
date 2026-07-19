package entidade;

public class PacienteConvenio extends Paciente {

    private String nomeConvenio;
    private double valorDesconto;







    public String getNomeConvenio() {
        return nomeConvenio;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }


    public boolean pagarConta(double valorConta) {

        double total = valorConta - getValorDesconto();

        if (total < 0) {
            total = 0;
        }

        if (total > getSaldo()) {
            return false;
        }

        setSaldo(getSaldo() - total);
        return true;
    }

    public void setNomeConvenio(String nomeConvenio){
        this.nomeConvenio = nomeConvenio;
    }
    public void setValorDesconto(double valorDesconto){
        this.valorDesconto = valorDesconto;
    }


    @Override
    public void mostrarPaciente() {
        super.mostrarPaciente();

        System.out.println("Convênio: " + nomeConvenio);
        System.out.println("Valor do desconto: R$ " + valorDesconto);
    }
}
