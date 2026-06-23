package HotelExo;

import java.util.ArrayList;
import java.util.List;

public class Gerant extends Utilisateur {
    public Gerant(String nom, String email, String motDePasse) {
        super(nom, email, motDePasse);
    }

    public List<Chambre> rechercherChambresDisponibles(
            List<Chambre> chambres, int nombreLits) {
        List<Chambre> resultat = new ArrayList<>();
        for (Chambre c : chambres) {
            if (c.isDisponible() && c.getNombreLits() >= nombreLits) {
                resultat.add(c);
            }
        }
        return resultat;
    }
}
