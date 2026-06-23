package HotelExo;

public class Chambre {
    private int numero;
    private int nombreLits;
    private double prixParNuit;
    private boolean disponible;

    public Chambre(int numero, int nombreLits, double prixParNuit) {
        this.numero = numero;
        this.nombreLits = nombreLits;
        this.prixParNuit = prixParNuit;
        this.disponible = true;
    }

    // Getters
    public int getNumero() { return numero; }
    public int getNombreLits() { return nombreLits; }
    public double getPrixParNuit() { return prixParNuit; }
    public boolean estDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    @Override
    public String toString() {
        return "Chambre n°" + numero + " | " + nombreLits + " lits | "
                + prixParNuit + "Ar/nuit | " + (disponible ? "Libre" : "Occupée");
    }
}
