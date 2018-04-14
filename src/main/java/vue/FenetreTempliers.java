package vue;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Cours :       Sécurité technique
 * Description : Programme permettant de chiffrer un message
 *               selon le code des templiers
 * Auteurs :     Francis Hêche & Normand Paratte
 * Date    :     Avril 2018
 */

public class FenetreTempliers extends JFrame {

  int LARGEUR_IMAGE = 20;
  int HAUTEUR_BARRE_FENENTRE = 60;

  public FenetreTempliers(String phraseACoder) throws HeadlessException {
    // ----- Propriétés de la fenêtre -----
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Code des templiers");
    // La taille dépend de la largeur des images
    this.setSize(phraseACoder.length() * (LARGEUR_IMAGE + 10),
        HAUTEUR_BARRE_FENENTRE + LARGEUR_IMAGE);
    // Permet de centrer la fenêtre
    this.setLocationRelativeTo(null);

    // Création d'un panel avec fond blanc
    JPanel pan = new JPanel();
    pan.setBackground(Color.WHITE);

    // ----- Parcours toutes les lettres de la phrase -----
    char lettre;
    for (int i = 0; i < phraseACoder.length(); ++i) {
      // Si c'est une lettre
      if ((phraseACoder.charAt(i) >= 65 && phraseACoder.charAt(i) <= 90) || ((
          phraseACoder.charAt(i) >= 97 && phraseACoder.charAt(i) <= 122))) {
        // Affiche l'image correspondante
        lettre = phraseACoder.toLowerCase().charAt(i);
        pan.add(new JLabel(new ImageIcon(
            getClass().getClassLoader().getResource("imagesLettres/" + lettre + ".png"))));
      } else {
        // Sinon mets des espaces
        pan.add(new JLabel("     "));
      }
    }

    // Affecte le panel à la fenêtre
    this.setContentPane(pan);
  }
}
