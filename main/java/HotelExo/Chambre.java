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
    @Getter
    private int numero;
    @Getter
    private int nombreLits;
    @Getter
    private double prixParNuit;
    //setter
    @Setter
    private boolean disponible;

    public Chambre(int numero, int nombreLits, double prixParNuit) {
        this.numero = numero;
        this.nombreLits = nombreLits;
        this.prixParNuit = prixParNuit;
        this.disponible = true;
    }

    public boolean estDisponible() { return disponible; }

    @Override
    public String toString() {
        return "Chambre n°" + numero + " | " + nombreLits + " lits | "
                + prixParNuit + "Ar/nuit | " + (disponible ? "Libre" : "Occupée");
    }
}
