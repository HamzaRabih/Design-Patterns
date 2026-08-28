package ma.rabih.enset.iibdcc.eommsapp;

/**
 * State : l'etat abstrait du document.
 *
 * LA DIFFERENCE AVEC STRATEGY EST ICI, dans ce seul champ `document`.
 * Une Strategy recoit des donnees et rend un resultat : elle ignore qui l'appelle.
 * Un State, lui, garde une reference vers son contexte. Il peut donc faire une chose
 * qu'aucune Strategy ne sait faire : DECIDER LUI-MEME quel sera l'etat suivant,
 * en appelant document.changerState(...).
 *
 * Consequence : les etats se connaissent entre eux (Draft cite Moderation,
 * Moderation cite Published). Les strategies, elles, ne se citent jamais.
 */
public abstract class State {

    protected Document document;

    public State(Document document) {
        this.document = document;
    }

    /** L'action demandee par l'utilisateur. Son effet depend entierement de l'etat. */
    public abstract void publier();

    /** Le libelle affiche a l'ecran pour cet etat. */
    public abstract String libelle();
}
