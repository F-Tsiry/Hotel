package HotelExo;

// Hotel.java (classe principale)
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.*;

@AllArgsConstructor
@Data
public class Hotel {
    private String nom;
    private String adresse;
    private String telephone;
    private String email;
    private List<Chambre> chambres;
    private List<Reservation> reservations;

    public Hotel(String nom, String adresse, String telephone, String email) {
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.chambres = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    public void ajouterChambre(Chambre c) { chambres.add(c); }

    public Reservation faireReservation(Client client, int nombreLits,
                                        LocalDate arrivee, LocalDate depart) {
        for (Chambre c : chambres) {
            if (c.isDisponible() && c.getNombreLits() >= nombreLits) {
                Reservation r = new Reservation(client, c, arrivee, depart);
                reservations.add(r);
                client.ajouterReservation(r);
                System.out.println("✅ " + r);
                return r;
            }
        }
        System.out.println("❌ Aucune chambre disponible avec " + nombreLits + " lits.");
        return null;
    }
}
