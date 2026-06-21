package HotelExo;

import lombok.Data;
import lombok.Setter;

import java.time.LocalDate;


// Reservation.java
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservation {
    private static int compteur = 1;
    private int id;
    private Client client;
    private Chambre chambre;
    private LocalDate dateArrivee;
    private LocalDate dateDepart;

    public Reservation(Client client, Chambre chambre,
                       LocalDate dateArrivee, LocalDate dateDepart) {
        this.id = compteur++;
        this.client = client;
        this.chambre = chambre;
        this.dateArrivee = dateArrivee;
        this.dateDepart = dateDepart;
        chambre.setDisponible(false);
    }

    public double calculerPrix() {
        //long nbNuits = dateDepart.toEpochDay() - dateArrivee.toEpochDay();
        long nbNuits = ChronoUnit.DAYS.between(dateArrivee, dateDepart);
        return nbNuits * chambre.getPrixParNuit();
    }

    @Override
    public String toString() {
        return "Réservation #" + id + " | " + client.getNom()
                + " | Chambre " + chambre.getNumero()
                + " | " + dateArrivee + " → " + dateDepart
                + " | " + ChronoUnit.DAYS.between(dateArrivee, dateDepart) + " nuit(s)"
                + " | Total : " + calculerPrix() + "€";
    }
}
