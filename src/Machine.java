import java.util.Scanner;
class Machine extends Joueur {
    public Machine(char jeton) {
        super(jeton);
    }

    @Override
    public int jouerCoup() {
        // Stratégie simple : jouer aléatoirement dans une colonne valide
        return (int) (Math.random() * 7);
    }
}