public class Main{

public  static void main(String[] args) {

    PagamentoBoleto p1 = new PagamentoBoleto(1000,"Bruno",);

   if (p1.validar()){
       System.out.println(p1.calcularValorFinal());
   }else {
       System.out.println("Pagamento recusado");
   }


}
}