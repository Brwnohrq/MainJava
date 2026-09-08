import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Veiculo> veiculos = new ArrayList<>();

        Carros carro1 = new Carros(
                "abc-123",
                "Sedan",
                150,
                true,
                "cinza");


        Carros carro2 = new Carros(
                "DEF-456",
                "SUV",
                220,
                true,
                "preto"
        );

        Carros carro3 = new Carros(
                "GHI-789",
                "Hatch",
                120,
                true,
                "branco"
        );

        Motos moto1 = new Motos("MOT-111", "Street", 100, true, 160);
        Motos moto2 = new Motos("MOT-222", "Naked", 180, true, 500);
        Motos moto3 = new Motos("MOT-333", "Esportiva", 300, true, 1000);

        veiculos.add(carro1);
        veiculos.add(carro2);
        veiculos.add(carro3);
        veiculos.add(moto1);
        veiculos.add(moto2);
        veiculos.add(moto3);

        double somaAluguel = 0;
    int quantidadeDisponiveis = 0;

    for (Veiculo veiculo : veiculos) {

        if (!veiculo.getDisponivel()) {
            continue;
        }
        quantidadeDisponiveis++;
        somaAluguel += veiculo.calcularValorAluguel(5);

    }



        System.out.println("Unidades Disponiveis: " + quantidadeDisponiveis + " |  "  + " Valor Total da Locacao " + somaAluguel
        );

        }

    }

