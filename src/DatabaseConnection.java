import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/nom_de_la_base_de_donnees"; // Remplacez par l'URL de votre base de données
    private static final String USER = "nom_utilisateur"; // Remplacez par votre nom d'utilisateur
    private static final String PASSWORD = "mot_de_passe"; // Remplacez par votre mot de passe

    public static Connection getConnection() throws SQLException {
        try {
            // Charger le driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("Driver JDBC non trouvé.");
        }

        // Établir la connexion
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
