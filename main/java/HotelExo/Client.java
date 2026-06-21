package HotelExo;

import lombok.AllArgsConstructor;
import lombok.Data;

// Client.java
import java.util.ArrayList;
import java.util.List;

public class Client extends Utilisateur {
    private List<Reservation> reservations;

    public Client(String nom, String email, String motDePasse) {
        super(nom, email, motDePasse);
        this.reservations = new ArrayList<>();
    }

    public void ajouterReservation(Reservation r) {
        reservations.add(r);
    }

    public List<Reservation> getReservations() { return reservations; }
}
