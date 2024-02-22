public class Puissance4 {

    public static void main(String[] args) {

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
