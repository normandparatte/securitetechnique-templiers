import java.util.Scanner;
import vue.FenetreTempliers;

/**
 * Cours :       Sécurité technique
 * Description : Programme permettant de chiffrer un message
 *               selon le code des templiers
 * Auteurs :     Francis Hêche & Normand Paratte
 * Date    :     Avril 2018
 */

public class Main {
  public static void main(String[] args) {
    // Demande la phrase à l'utilisateur
    Scanner sc = new Scanner(System.in);
    System.out.println("\nVeuillez entrer la phrase à chiffrer :");

    // Création de la fenêtre selon la phrase saisie
    FenetreTempliers fenetreTempliers = new FenetreTempliers(sc.nextLine());
    // Affiche la fenêtre en question
    fenetreTempliers.setVisible(true);
  }
}
