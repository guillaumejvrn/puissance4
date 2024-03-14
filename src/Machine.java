class Machine extends Joueur {
    public Machine(char jeton) {
        super(jeton);
    }

    @Override
    public int jouerCoup() {
        Grille grilleTemp = new Grille(6, 7);
        int colonne;
        do {
            colonne = (int) (Math.random() * 7);
        } while (!grilleTemp.estColonneValide(colonne));
        return colonne;
    }
}