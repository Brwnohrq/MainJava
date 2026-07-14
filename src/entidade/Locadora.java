package entidade;

public class Locadora {

    Carro veiculo1 = new Carro();
    Carro veiculo2 = new Carro();
    Carro veiculo3 = new Carro();
    Carro veiculo4 = new Carro();

    public Locadora() {


        veiculo1.marca = "Chevrolet";
        veiculo1.modelo = "Onix";
        veiculo1.placa = "ABC-1234";
        veiculo1.anoFabricacao = 2020;
        veiculo1.valorDiaria = 150;
        veiculo1.disponivel = true;

        veiculo2.marca = "Honda";
        veiculo2.modelo = "Civic";
        veiculo2.placa = "GHK-3412";
        veiculo2.anoFabricacao = 2025;
        veiculo2.valorDiaria = 224;
        veiculo2.disponivel = true;


        veiculo3.marca = "Mercedes-Benz";
        veiculo3.modelo = "GLA-200";
        veiculo3.placa = "GGI-5412";
        veiculo3.anoFabricacao = 2022;
        veiculo3.valorDiaria = 389;
        veiculo3.disponivel = true;


        veiculo4.marca = "Volkswagem";
        veiculo4.modelo = "Nivus";
        veiculo4.placa = "NVS-1112";
        veiculo4.anoFabricacao = 2025;
        veiculo4.valorDiaria = 212;
        veiculo4.disponivel = true;
    }


    public void mostrarCarros(){

        System.out.println("Veiculos Locadora GPT");
        veiculo1.mostrarCarros();
        System.out.println("");
        veiculo2.mostrarCarros();
        System.out.println("");
        veiculo3.mostrarCarros();
        System.out.println("");
        veiculo4.mostrarCarros();
        System.out.println("");
    }



}
