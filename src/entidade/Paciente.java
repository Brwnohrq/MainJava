package entidade;

public class Paciente {


    private String nome;
    private int idade;
    private boolean internado;
    private double saldo;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public boolean getInternado() {
        return internado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void mostrarPaciente() {
        System.out.println("Nome:" + nome);
        System.out.println("Idade:" + idade);
        System.out.println("Internado:" + internado);
        System.out.println("Saldo:" + saldo);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade <=0) {
            return;
        }
            this.idade = idade;
        }


    public void setInternado(boolean internado) {
        this.internado = internado;
    }

    public void setSaldo(double saldo) {
        if (saldo <0){
            return;
        }
        this.saldo = saldo;

    }

    public boolean internar() {
        if (!internado) {
            internado = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean darAlta() {
        if (internado) {
        internado = false;
        return true;

        } else {
            return false;
        }
    }

    public boolean pagarConta(double valorConta) {
        if (valorConta > saldo) {
            return false;
        }
        saldo -= valorConta;
        return true;

    }




}