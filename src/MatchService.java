import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MatchService {
    public void ajouterMatch(Match match) {
        String query = "INSERT INTO Matchs (equipeDomicile, equipeExterieur, date, lieu, score) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, match.getEquipeDomicile());
            stmt.setString(2, match.getEquipeExterieur());
            stmt.setString(3, match.getDate());
            stmt.setString(4, match.getLieu());
            stmt.setString(5, match.getScore());
            stmt.executeUpdate();
            System.out.println("Match ajouté avec succès !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Match chercherMatchParId(int id) {
        String query = "SELECT * FROM Matchs WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Match(
                        rs.getInt("id"),
                        rs.getString("equipeDomicile"),
                        rs.getString("equipeExterieur"),
                        rs.getString("date"),
                        rs.getString("lieu"),
                        rs.getString("score")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
