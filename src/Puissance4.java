public class Puissance4 {

    public static void main(String[] args) {
        Grille grille = new Grille(6, 7);
        Joueur joueur1 = new Humain('X');
        Joueur joueur2 = new Machine('O');
        Joueur joueurActuel = joueur1;

        System.out.println("Bienvenue dans le jeu Puissance 4 !");

        while (true) {
            grille.afficherGrille();
            System.out.println("Joueur " + joueurActuel.getJeton() + " - Votre tour :");

            int colonne = joueurActuel.jouerCoup();

            if (grille.estColonneValide(colonne)) {
                grille.placerJeton(colonne, joueurActuel.getJeton());
                if (grille.verifierVictoire(joueurActuel.getJeton())) {
                    grille.afficherGrille();
                    System.out.println("Le joueur " + joueurActuel.getJeton() + " a gagné !");
                    break;
                } else if (grille.estGrillePleine()) {
                    grille.afficherGrille();
                    System.out.println("Match nul !");
                    break;
                }
                joueurActuel = (joueurActuel == joueur1) ? joueur2 : joueur1;
            } else {
                System.out.println("Colonne invalide. Réessayez !");
            }
        }
    }
}
