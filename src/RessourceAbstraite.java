import java.util.ArrayList;
import java.util.List;

public abstract class RessourceAbstraite extends ObjetPersistant {
    private final String libelle;

    public String getLibelle() {
        // Automatically generated method. Please do not modify this code.
        return this.libelle;
    }

    private final transient List<EtatRessourceAbstraite> etat = new ArrayList<EtatRessourceAbstraite> ();

    public List<EtatRessourceAbstraite> getEtat() {
        // Automatically generated method. Please do not modify this code.
        return this.etat;
    }

}
