import java.util.Scanner;

public class Puissance4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nom du joueur 1 : ");
        String nom1 = sc.nextLine();
        System.out.println("Entrez le symbole du joueur 1 : ");
        String symbole1 = sc.nextLine();
        Joueur joueur1 = new Joueur(nom1, symbole1);

        System.out.println("Entrez le nom du joueur 2 : ");
        String nom2 = sc.nextLine();
        System.out.println("Entrez le symbole du joueur 2 : ");
        String symbole2 = sc.nextLine();
        Joueur joueur2 = new Joueur(nom2, symbole2);


        boolean fin = false;

        while (fin == false){
            for (int i = 0; i < 6; i++) {
                for (int k = 0; k < 8; k++) {
                    System.out.print("|");
                    System.out.print(" ");
                }
                System.out.println();
            }
            fin = true;
        }

        System.out.println("le joueur " + " a gagné");
    }
}
