public class Paciente {


    private String nome;
    private int idade;
    private int temperatura;
    private boolean internado;
    private int numeroConsultas;


    public String getNome() {
        return nome;
    }

    public int getNumeroConsultas() {
        return numeroConsultas;
    }

    public boolean isInternado() {
        return internado;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public int getIdade() {
        return idade;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroConsultas(int numeroConsultas) {
        this.numeroConsultas = numeroConsultas;
    }

    public void setInternado(boolean internado) {
        this.internado = internado;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }


    public boolean internar() {
        if (!internado) {
            internado = true;
            System.out.println("Esse paciente foi internado");
            return true;
        } else {
            System.out.println("Esse paciente ja esta internado");
            return false;
        }
    }

    public boolean darAlta() {
        if (internado) {
            internado = false;
            System.out.println("Esse paciente recebeu alta");
            return true;
        } else {
            System.out.println("Esse Paciente nao pode ter alta, ele nao estava internado");
        }
        return false;
    }

    public void cadastrarPaciente() {
        System.out.println("Nome:" + nome);
        System.out.println("Idade:" + idade);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Internado: " + internado);
        System.out.println("Numero de Consultas " + numeroConsultas);
    }


    public boolean tirarSangue() {
        if (internado) {
            System.out.println("Tirando Sangue");
            numeroConsultas ++;
            return true;

        } else {
            System.out.println("Voce precisa estar internado pra fazer esse exame");
            return false;
        }
    }

    public boolean raioX() {
        if (internado) {
            System.out.println("Fazendo Raio-X");
            numeroConsultas ++;
            return true;

        } else {
            System.out.println("Voce precisa estar internado pra fazer esse exame");
            return false;
        }
    }

    public boolean aferirTemperatuda(){
        if (internado){
            System.out.println("Aferindo Temperatura");
            numeroConsultas ++;
            return true;
        } else {
            System.out.println("Voce precisa estar internado pra fazer esse exame");
            return false;
        }
    }



}