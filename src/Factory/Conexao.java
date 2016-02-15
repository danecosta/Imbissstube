package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dane
 */
public class Conexao {

    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            String urlDriver = "jdbc:derby://localhost:1527/DaneDB";
            Connection conexao = DriverManager.getConnection(urlDriver, "Daniela", "toor");
            connection = conexao;
        }
        return connection;
    }

    public static void closeConnection() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

}
