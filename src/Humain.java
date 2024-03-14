import java.util.Scanner;
class Humain extends Joueur {
    public Humain(char jeton) {
        super(jeton);
    }

    @Override
    public int jouerCoup() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le numéro de la colonne (0-6) : ");
        int colonne = scanner.nextInt();
        return colonne;
    }
}