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
  int LARGEUR_IMAGE=20;
  int HAUTEUR_BARRE_FENENTRE = 60;

  public FenetreTempliers(String phraseACoder) throws HeadlessException {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Code des templiers");
    this.setSize(phraseACoder.length()*(LARGEUR_IMAGE+10), HAUTEUR_BARRE_FENENTRE+LARGEUR_IMAGE);
    this.setLocationRelativeTo(null);

    JPanel pan = new JPanel();
    pan.setBackground(Color.WHITE);
    char lettre;

    for(int i=0;i<phraseACoder.length();++i){
      if((phraseACoder.charAt(i)>=65 && phraseACoder.charAt(i)<=90) || ((phraseACoder.charAt(i)>=97 && phraseACoder.charAt(i)<=122))){
        lettre = phraseACoder.toLowerCase().charAt(i);
        pan.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("imagesLettres/"+lettre+".png"))));
      }else{
        pan.add(new JLabel("     "));
      }
    }
    this.setContentPane(pan);
    this.setVisible(true);
  }
}
