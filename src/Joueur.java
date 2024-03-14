
class Joueur {
    protected char jeton;
    public Joueur(char jeton) {
        this.jeton = jeton;
    }
    public char getJeton() {
        return jeton;
    }
    public int jouerCoup() {
        return -1;
    }
}