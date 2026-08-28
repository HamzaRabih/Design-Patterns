package ma.rabih.enset.iibdcc.eommsapp;

/**
 * Etat BROUILLON : le document est en cours de redaction, personne d'autre ne le voit.
 */
public class DraftState extends State {

    public DraftState(Document document) {
        super(document);
    }

    @Override
    public void publier() {
        System.out.println("Le brouillon est envoye a la moderation.");
        // C'est l'etat lui-meme qui declenche la transition : impossible avec une Strategy.
        document.changerState(new ModerationState(document));
    }

    @Override
    public String libelle() {
        return "BROUILLON";
    }
}
