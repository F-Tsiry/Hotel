package HotelExo;

import lombok.Getter;

@Getter
public abstract class Utilisateur {
    private String nom;
    private String email;
    private String motDePasse;

    public Utilisateur(String nom, String email, String motDePasse) {
        this.nom = nom;
        this.email = email;
        this.motDePasse = motDePasse;
    }
}
