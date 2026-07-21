package entidade;

public class Oficina {

    Carros carro1 = new Carros("Honda", "Civic", "ABC-1234", 2020, false, 4);
    Carros carro2 = new Carros("Honda", "HRV", "BCD-3444", 2022, false, 4);
    Carros carro3 = new Carros("Ferrari", "Enzo", "FER-1234", 2024, false, 2);
    Motos moto1 = new Motos("Yamaha", "Xt-660R", "xxt-1234", 2010, false, 660);
    Motos moto2 = new Motos("Yamaha", "Fazer", "fzr-5434", 2015, false, 250);
    Motos moto3 = new Motos("Suzuki", "Suzukinha", "szk-3234", 2021, false, 125);

    private double valorTrocarOleo = 250;
    private double valorTrocarPneu = 250;
    private double revisao = 350;
    private double valorServico = 0;

    public void mostrarVeiculos() {

        System.out.println("========== CARRO 1 ==========");
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Placa: " + carro1.getPlaca());
        System.out.println("Ano de Fabricação: " + carro1.getAnoFabricacao());
        System.out.println("Número de Portas: " + carro1.getNumeroDePortas());
        System.out.println("Em Manutenção: " + carro1.isEmManutencao());

        System.out.println("\n========== CARRO 2 ==========");
        System.out.println("Marca: " + carro2.getMarca());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Placa: " + carro2.getPlaca());
        System.out.println("Ano de Fabricação: " + carro2.getAnoFabricacao());
        System.out.println("Número de Portas: " + carro2.getNumeroDePortas());
        System.out.println("Em Manutenção: " + carro2.isEmManutencao());

        System.out.println("\n========== CARRO 3 ==========");
        System.out.println("Marca: " + carro3.getMarca());
        System.out.println("Modelo: " + carro3.getModelo());
        System.out.println("Placa: " + carro3.getPlaca());
        System.out.println("Ano de Fabricação: " + carro3.getAnoFabricacao());
        System.out.println("Número de Portas: " + carro3.getNumeroDePortas());
        System.out.println("Em Manutenção: " + carro3.isEmManutencao());

        System.out.println("\n========== MOTO 1 ==========");
        System.out.println("Marca: " + moto1.getMarca());
        System.out.println("Modelo: " + moto1.getModelo());
        System.out.println("Placa: " + moto1.getPlaca());
        System.out.println("Ano de Fabricação: " + moto1.getAnoFabricacao());
        System.out.println("Cilindradas: " + moto1.getCilindradas());
        System.out.println("Em Manutenção: " + moto1.isEmManutencao());

        System.out.println("\n========== MOTO 2 ==========");
        System.out.println("Marca: " + moto2.getMarca());
        System.out.println("Modelo: " + moto2.getModelo());
        System.out.println("Placa: " + moto2.getPlaca());
        System.out.println("Ano de Fabricação: " + moto2.getAnoFabricacao());
        System.out.println("Cilindradas: " + moto2.getCilindradas());
        System.out.println("Em Manutenção: " + moto2.isEmManutencao());

        System.out.println("\n========== MOTO 3 ==========");
        System.out.println("Marca: " + moto3.getMarca());
        System.out.println("Modelo: " + moto3.getModelo());
        System.out.println("Placa: " + moto3.getPlaca());
        System.out.println("Ano de Fabricação: " + moto3.getAnoFabricacao());
        System.out.println("Cilindradas: " + moto3.getCilindradas());
        System.out.println("Em Manutenção: " + moto3.isEmManutencao());
    }



    public double getValorTrocarOleo() {
        return valorTrocarOleo;
    }

    public double getValorTrocarPneu() {
        return valorTrocarPneu;
    }

    public double getRevisao() {
        return revisao;
    }

    public void trocarOleo() {
        valorServico += valorTrocarOleo;
        System.out.println("Voce trocou o Oleo do Veiculo o valor desse serviço é de R$: " + valorTrocarOleo);
    }

    public void trocarPneus(int quantidadePneus) {
        double valorDesseServico = (quantidadePneus * valorTrocarPneu);
        valorServico += (quantidadePneus * valorTrocarPneu);
        System.out.printf("Voce Trocou %d Pneus do Veiculo, o total desse servico é R$: %.2f  %n", quantidadePneus,valorDesseServico);
    }

    public void fazerRevisao(){
        System.out.println("Revisao Completa valor desse servico é de R$:" + revisao);
        valorServico += revisao;
    }

    public double getValorServico(){
        return valorServico;
    }

    public void valorTotalServicos(){
        System.out.println("Valor Total dos Serivos: " +valorServico);
    }

    public void finalizarServico(){
        valorServico =0;
    }



}








