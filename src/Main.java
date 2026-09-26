import java.util.ArrayList;

public class Main{

public  static void main(String[] args) {

    ArrayList <Pagamento> pagamentos = new ArrayList <Pagamento> ();

 Pagamento pg = new PagamentoCartao("Alessandra",1000,4);
 Pagamento pg1 = new PagamentoCartao("Bruno",1000,5);
 Pagamento pg2 = new PagamentoDinheiro("Cleber",100);
 Pagamento pg3 = new PagamentoPix("Lu",1123);
 Pagamento pg4 = new PagamentoBoleto("Va",1231,6);

 pagamentos.add(pg);
 pagamentos.add(pg1);
 pagamentos.add(pg2);
 pagamentos.add(pg3);
 pagamentos.add(pg4);

 for (Pagamento pagamento : pagamentos){
     if (!pagamento.validar()){
         System.out.println("Pagamento recusado" + pagamento.getNome() + pagamento.getTipo());
         continue;
     }
         pagamento.gerarComprovante();
         System.out.println(" ");
     }


 }
}




