import java.util.Scanner;
class Grille {
    private final int lignes;
    private final int colonnes;
    private final char vide = '-';
    private final char joueur1 = 'X';
    private final char joueur2 = 'O';
    private char[][] grille;

    public Grille(int lignes, int colonnes) {
        this.lignes = lignes;
        this.colonnes = colonnes;
        grille = new char[lignes][colonnes];
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                grille[i][j] = vide;
            }
        }
    }

    public void afficherGrille() {
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                System.out.print("|" + grille[i][j]);
            }
            System.out.println("|");
        }
    }

    public boolean estColonneValide(int colonne) {
        return colonne >= 0 && colonne < colonnes && grille[0][colonne] == vide;
    }

    public boolean placerJeton(int colonne, char joueur) {
        if (!estColonneValide(colonne)) return false;
        for (int i = lignes - 1; i >= 0; i--) {
            if (grille[i][colonne] == vide) {
                grille[i][colonne] = joueur;
                return true;
            }
        }
        return false;
    }

    public boolean verifierVictoire(char joueur) {
        // Vérification horizontale
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j <= colonnes - 4; j++) {
                if (grille[i][j] == joueur &&
                        grille[i][j + 1] == joueur &&
                        grille[i][j + 2] == joueur &&
                        grille[i][j + 3] == joueur) {
                    return true;
                }
            }
        }
        // Vérification verticale
        for (int i = 0; i <= lignes - 4; i++) {
            for (int j = 0; j < colonnes; j++) {
                if (grille[i][j] == joueur &&
                        grille[i + 1][j] == joueur &&
                        grille[i + 2][j] == joueur &&
                        grille[i + 3][j] == joueur) {
                    return true;
                }
            }
        }
        // Vérification diagonale
        for (int i = 0; i <= lignes - 4; i++) {
            for (int j = 0; j <= colonnes - 4; j++) {
                if (grille[i][j] == joueur &&
                        grille[i + 1][j + 1] == joueur &&
                        grille[i + 2][j + 2] == joueur &&
                        grille[i + 3][j + 3] == joueur) {
                    return true;
                }
                if (grille[i][j + 3] == joueur &&
                        grille[i + 1][j + 2] == joueur &&
                        grille[i + 2][j + 1] == joueur &&
                        grille[i + 3][j] == joueur) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean estGrillePleine() {
        for (int j = 0; j < colonnes; j++) {
            if (grille[0][j] == vide) {
                return false;
            }
        }
        return true;
    }

}