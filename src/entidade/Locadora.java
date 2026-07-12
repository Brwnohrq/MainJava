package entidade;

public class Locadora {


    Veiculo veiculo1 = new Veiculo();
    Veiculo veiculo2 = new Veiculo();
    Veiculo veiculo3 = new Veiculo();


    public Locadora (){

        veiculo1.marca = "Chevrolet";
        veiculo1.modelo = "Onix";
        veiculo1.ano = 2020;
        veiculo1.placa = "ABC-1234";
        veiculo1.valorDiaria = 120;
        veiculo1.disponivel = true;


        veiculo2.marca = "BMW";
        veiculo2.modelo = "X1";
        veiculo2.ano = 2022;
        veiculo2.placa = "ACK-3412";
        veiculo2.valorDiaria = 180;
        veiculo2.disponivel = true;

        veiculo3.marca = "Mercedes-Benz";
        veiculo3.modelo = "c180";
        veiculo3.ano = 2025;
        veiculo3.placa = "ACF-4412";
        veiculo3.valorDiaria = 300;
        veiculo3.disponivel = true;

    }

    public void mostrarCarros(){

       veiculo1.mostrarCarro();
       veiculo2.mostrarCarro();
       veiculo3.mostrarCarro();

    }


}
