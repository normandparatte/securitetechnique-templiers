package vue;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FenetreTempliers extends JFrame {
  int LARGEUR_IMAGE=50;
  int HAUTEUR_BARRE_FENENTRE = 40;

  public FenetreTempliers(String phraseACoder) throws HeadlessException {
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Code des templiers");
    this.setSize(phraseACoder.length()*LARGEUR_IMAGE, HAUTEUR_BARRE_FENENTRE+LARGEUR_IMAGE);

    JPanel pan = new JPanel();
    this.setContentPane(pan);

    this.setVisible(true);

    affecterImages(phraseACoder);
  }

  private void affecterImages(String phraseACoder) {

  }
}
