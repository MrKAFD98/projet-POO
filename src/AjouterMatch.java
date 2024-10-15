import javax.swing.*;

public class AjouterMatch extends JFrame {

    private JLabel GESTIONNAIRE;

    // Constructeur
    public AjouterMatch() {
        // Configuration de la fenêtre
        setTitle("Ajouter un Match");
        setSize(400, 300); // Définit la taille de la fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centre la fenêtre à l'écran

        // Ajout de composants ici (boutons, champs de texte, etc.)

        setVisible(true); // Rend la fenêtre visible
    }

    // Méthode principale pour exécuter l'application
    public static void main(String[] args) {
        new AjouterMatch(); // Crée et affiche la fenêtre
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
