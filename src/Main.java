import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {


        Banco b = new Banco();

        try{
            b.fistConection();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}