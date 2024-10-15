public class Match {
    private int id;
    private String equipeDomicile;
    private String equipeExterieur;
    private String date;
    private String lieu;
    private String score;

    // Constructeur
    public Match(int id, String equipeDomicile, String equipeExterieur, String date, String lieu, String score) {
        this.id = id;
        this.equipeDomicile = equipeDomicile;
        this.equipeExterieur = equipeExterieur;
        this.date = date;
        this.lieu = lieu;
        this.score = score;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getEquipeDomicile() {
        return equipeDomicile;
    }

    public String getEquipeExterieur() {
        return equipeExterieur;
    }

    public String getDate() {
        return date;
    }

    public String getLieu() {
        return lieu;
    }

    public String getScore() {
        return score;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setEquipeDomicile(String equipeDomicile) {
        this.equipeDomicile = equipeDomicile;
    }

    public void setEquipeExterieur(String equipeExterieur) {
        this.equipeExterieur = equipeExterieur;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public void setScore(String score) {
        this.score = score;
    }

    // Méthode pour afficher les détails du match
    public String afficherDetails() {
        return "Match ID: " + id + ", Équipe Domicile: " + equipeDomicile +
                ", Équipe Extérieur: " + equipeExterieur + ", Date: " + date +
                ", Lieu: " + lieu + ", Score: " + score;
    }
}
