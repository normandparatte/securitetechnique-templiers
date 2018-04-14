package vue;

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
  int LARGEUR_IMAGE=10;
  int HAUTEUR_BARRE_FENENTRE = 40;

  public FenetreTempliers(String phraseACoder) throws HeadlessException {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Code des templiers");
    this.setSize(phraseACoder.length()*(LARGEUR_IMAGE+45), HAUTEUR_BARRE_FENENTRE+LARGEUR_IMAGE+50);
    this.setLocationRelativeTo(null);

    JPanel pan = new JPanel();

    for(int i=0;i<phraseACoder.length();++i){
      pan.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("imagesLettres/"+phraseACoder.charAt(i)+".jpg"))));
    }
    this.setContentPane(pan);
    this.setVisible(true);
  }
}
