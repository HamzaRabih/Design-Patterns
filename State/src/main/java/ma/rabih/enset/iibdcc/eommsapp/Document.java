package ma.rabih.enset.iibdcc.eommsapp;

/**
 * Context : le document dont le comportement change avec l'etat.
 *
 * Remarquer ce que cette classe NE contient PAS : aucun `if (etat == BROUILLON)`,
 * aucun `switch`. Toute la logique de transition vit dans les classes d'etat.
 * Ajouter un etat ARCHIVE ne demanderait pas de modifier ce fichier.
 */
public class Document {

    private final String titre;
    private State state;
    private boolean administrateur;

    public Document(String titre) {
        this.titre = titre;
        // Tout document commence en brouillon : l'etat initial fait partie du contexte.
        this.state = new DraftState(this);
    }

    /** Appele par les etats eux-memes pour passer la main au suivant. */
    public void changerState(State state) {
        System.out.println("  [transition] " + this.state.libelle() + " -> " + state.libelle());
        this.state = state;
    }

    /** Le contexte se contente de deleguer : c'est l'etat courant qui decide. */
    public void publier() {
        state.publier();
    }

    public boolean estAdministrateur() {
        return administrateur;
    }

    public void setAdministrateur(boolean administrateur) {
        this.administrateur = administrateur;
    }

    public void afficher() {
        System.out.println("***********");
        System.out.println("Document : " + titre);
        System.out.println("Etat     : " + state.libelle());
        System.out.println("Profil   : " + (administrateur ? "administrateur" : "redacteur"));
        System.out.println("===========");
    }
}
