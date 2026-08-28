package ma.rabih.enset.iibdcc.eommsapp;

/**
 * Etat PUBLIE : etat final. C'est le seul etat qui ne mene nulle part.
 *
 * Interet du pattern : ce cas ne demande AUCUN `if` dans le Document.
 * Ne rien faire est ici un comportement a part entiere, porte par une classe.
 */
public class PublishedState extends State {

    public PublishedState(Document document) {
        super(document);
    }

    @Override
    public void publier() {
        System.out.println("Le document est deja publie : il n'y a plus rien a faire.");
    }

    @Override
    public String libelle() {
        return "PUBLIE";
    }
}
