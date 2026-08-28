package ma.rabih.enset.iibdcc.eommsapp;

/**
 * Etat EN MODERATION : le document attend la validation d'un administrateur.
 *
 * Cet etat montre qu'une transition peut etre CONDITIONNELLE : la meme action
 * `publier()` mene a deux etats differents selon qui la demande.
 */
public class ModerationState extends State {

    public ModerationState(Document document) {
        super(document);
    }

    @Override
    public void publier() {
        if (document.estAdministrateur()) {
            System.out.println("Validation administrateur : le document est publie.");
            document.changerState(new PublishedState(document));
        } else {
            System.out.println("Refuse : seul un administrateur peut publier ce document.");
            // Aucun changement d'etat : le document reste en moderation.
        }
    }

    @Override
    public String libelle() {
        return "EN MODERATION";
    }
}
