import java.util.Scanner;

public class Joueur {
    //creation des attributs
    private String nom;
    private String symbole;

    //creation du constructeur
    public Joueur(String nom, String symbole){
        this.nom = nom;
        this.symbole = symbole;
    }

    //creation des methodes
    public String getNom(){
        return this.nom;
    }
    public String getSymbole(){
        return this.symbole;
    }


}
