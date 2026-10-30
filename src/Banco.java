import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

public class Banco {
    private String url = "jdbc:mysql://localhost:3306/banco_java";
    private String login = "root";
    private String senha = "a996104003";


    public String mostrarUsuarios() throws SQLException{

        String total = "";
        try (Connection connection = DriverManager.getConnection(url,login,senha))  {
            var comando = connection.prepareStatement("SELECT * FROM CLIENTE");
            var resultado = comando.executeQuery();
            while (resultado.next()){
                String nome = resultado.getString("NOME");
                int id = resultado.getInt("ID");
                String cpf = resultado.getString("CPF");
                boolean ativado = resultado.getBoolean("ATIVADO");
                String a = String.format("NOME %s CPF %s ID %d STATUS %s\n",nome,cpf,id,ativado);

                total = total + a;
            }
            return total;

        }
    }

    public String buscarUsuarioID (int id)throws SQLException,InvalidIdNumber{

        String total = "";

     validarIdNegativo(id);

        try (Connection c1 = DriverManager.getConnection(url,login,senha)){
            var comando = c1.prepareStatement("SELECT * FROM CLIENTE WHERE ID = ?");
            comando.setInt(1,id);
            var resultado = comando.executeQuery();
            if (!resultado.next()){
                throw new InvalidIdNumber("Id incorreta");
            } else
            {
                String nome = resultado.getString("NOME");
                String cpf = resultado.getString("CPF");
                int idd = resultado.getInt("ID");
                boolean ativado = resultado.getBoolean("ATIVADO");
                String a = String.format("NOME %s CPF %s ID %d STATUS %s",nome,cpf,idd,ativado);

                total = total + a;
            }
            return total;
        }
    }

    public String buscarUsuarioCPF (String cpf)throws SQLException,InvalidIdNumber{

        String total = "";

        if (cpf.isEmpty()){
            throw new InvalidIdNumber("Digite um cpf valida");
        }
        if (!cpf.matches("^\\d{11}$")){
            throw new InvalidIdNumber("Digite os 11 digitos do CPF");
        }

        try (Connection c1 = DriverManager.getConnection(url,login,senha)){
            var comando = c1.prepareStatement("SELECT * FROM CLIENTE WHERE CPF = ?");
            comando.setString(1,cpf);
            var resultado = comando.executeQuery();
            if (!resultado.next()){
                throw new InvalidIdNumber("CPF NAO CADASTRADO");
            } else
            {
                String nome = resultado.getString("NOME");
                String cpff = resultado.getString("CPF");
                int idd = resultado.getInt("ID");
                boolean ativado = resultado.getBoolean("ATIVADO");
                String a = String.format("NOME %s CPF %s ID %d STATUS %s",nome,cpff,idd,ativado);

                total = total + a;
            }
            return total;
        }
    }

    public String buscarSaldo (int id)throws SQLException,InvalidIdNumber{

     validarIdNegativo(id);
        try(Connection c1 = DriverManager.getConnection(url,login,senha)){

            var comando = c1.prepareStatement("SELECT * FROM CONTA WHERE ID = ?");
            comando.setInt(1,id);
            var resultado = comando.executeQuery();
            if (!resultado.next()){
                throw new InvalidIdNumber("ID nao cadastrada");
            } else
            {
                int idd = resultado.getInt("ID");
                BigDecimal saldo = resultado.getBigDecimal("SALDO");
                boolean status = resultado.getBoolean("ATIVADO");

                String a = String.format("ID %d SALDO %.2f",idd,saldo);
                return a;
            }
        }
    }

    public String depositar (BigDecimal valor, int id)
            throws SQLException,InvalidIdNumber, InvalidOrIncorrectValue {
        validarValorNegativo(valor);
        validarIdNegativo(id);

        BigDecimal a = BigDecimal.valueOf(0);

        try (Connection c1 = DriverManager.getConnection(url,login,senha)) {

            var buscarSaldo = c1.prepareStatement("SELECT * FROM CONTA WHERE ID =?");
            buscarSaldo.setInt(1, id);
            var comando = buscarSaldo.executeQuery();
            if (!comando.next()) {
                throw new InvalidIdNumber("ID invalido");
            } else {
                BigDecimal saldoinicial = comando.getBigDecimal("SALDO");
                a = saldoinicial.add(a);
            }



            var comando1 = c1.prepareStatement("UPDATE CONTA SET SALDO = SALDO + ? WHERE ID = ?");
            comando1.setBigDecimal(1, valor);
            comando1.setInt(2, id);
            int linhasAfetadas = comando1.executeUpdate();

            if (linhasAfetadas <=0){
                throw new InvalidIdNumber("ID Invalido");
            }else
            {
                String b = String.format("SALDO INICIAL %s, VALOR DO DEPOSITO %s, VALOR FINAL %s",a,valor,(a.add(valor)));
                return b;
            }
        }
    }

    public String saque (BigDecimal valor, int id)
            throws SQLException, InvalidIdNumber, InvalidOrIncorrectValue {

        validarValorNegativo(valor);
        validarIdNegativo(id);

        BigDecimal saldoInicial = BigDecimal.valueOf(0);

        try (Connection c1 = DriverManager.getConnection(url,login,senha)){
            var comando = c1.prepareStatement("SELECT * FROM CONTA WHERE ID = ?");
            comando.setInt(1,id);
            var buscarsaldo = comando.executeQuery();
            if (!buscarsaldo.next()){
                throw new InvalidIdNumber("ID INVALIDA");
            } else
            {
                BigDecimal saldoIni = buscarsaldo.getBigDecimal("SALDO");
                saldoInicial = saldoIni.add(saldoInicial);
            }

            if (valor.compareTo(saldoInicial) >0){
                throw new InvalidOrIncorrectValue("Saldo indisponivel para saque! voce tem R$: " + saldoInicial);
            } else {
                var saquee = c1.prepareStatement("UPDATE CONTA SET SALDO = SALDO - ? WHERE ID = ?");
                saquee.setBigDecimal(1, valor);
                saquee.setInt(2, id);
                int linhasAfetadas = saquee.executeUpdate();
                if (linhasAfetadas <=0){
                    throw new InvalidIdNumber("ID INVALIDA");
                } else {
                String resultFinal = String.format("SALDO INICIAL R$:%s \nVALOR DO SAQUE R$:%s \nVALOR FINAL R$:%s",saldoInicial,valor, (saldoInicial.subtract(valor)));
                return resultFinal;
            }
            }


            }
    }


    public String deposito (BigDecimal valor, int id)
            throws SQLException, InvalidIdNumber, InvalidOrIncorrectValue{

    }



    public void validarIdNegativo (int id) throws InvalidIdNumber{
        if (id <=0){
            throw new InvalidIdNumber("Digite uma id valida");
        }
    }
    public void validarValorNegativo (BigDecimal valor) throws InvalidOrIncorrectValue {
    if (valor == null || valor.compareTo(BigDecimal.ZERO) <=0) {
        throw new InvalidOrIncorrectValue("Digite um valor valido que seja maior que zero");
    }
    }



}





