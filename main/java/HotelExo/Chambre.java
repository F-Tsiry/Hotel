package HotelExo;

public class Chambre {

    @Getter
    private int numero;
    @Getter
    private int nombreLits;
    @Getter
    private double prixParNuit;
    
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
