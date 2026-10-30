import java.math.BigDecimal;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

    Banco b = new Banco();


    try {
        System.out.println(b.saque(new BigDecimal(1),35));
    } catch (SQLException | InvalidOrIncorrectValue | InvalidIdNumber e){
        System.out.println(e.getMessage());
    }



}
}
