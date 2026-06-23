import HotelExo.Chambre;
import HotelExo.Client;
import HotelExo.Hotel;
import HotelExo.Reservation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class HotelTest {
    var hotel;
    var client;
    @BeforeEach
    public void setUp() {
        hotel = new Hotel("Le hot", "Ivandry", "0341111111", "hotel@hotel.com");
        hotel.ajouterChambre(new Chambre(101, 1, 50.0));
        hotel.ajouterChambre(new Chambre(102, 2, 80.0));
        hotel.ajouterChambre(new Chambre(103, 3, 120.0));

        client = new Client("Alice", "alice@mail.com", "1234");

        hotel.faireReservation(client, 3, LocalDate.of(2026, 7, 10), LocalDate.of(2026, 7, 15));
    }
    @Test
    public void testCalculerNuitReservation() {
        assertEquals(600.0, hotel.getReservations().get(0).calculerPrix());
    }
    @Test
    public void testFaireReservationValide() {
        assertFalse(hotel.getReservations().isEmpty());
    }
    @Test
    public void testFaireReservation_de_chambre_avec_nombre_de_lit_que_les_chambres_n_ont_pas() {
        assertNull(hotel.faireReservation(client, 10, LocalDate.of(2027, 7, 10), LocalDate.of(2026, 7, 15)));
    }
    @Test
    public void testFaireReservation_de_chambre_deja_reserve() {
        assertNull(hotel.faireReservation(client, 3, LocalDate.of(2026, 7, 10), LocalDate.of(2026, 7, 15)));
    }
}
