package Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getActionCommand() == "Nouvelle Partie"){
			EcranJeu.reset();
		}
		if(e.getActionCommand() == "Sauvegarder"){
			
		}
		if(e.getActionCommand() == "Reprendre une partie"){
		
		}
		
		if(e.getActionCommand() == "Highscore"){
			
		}
		if(e.getActionCommand() == "Règles & controles du jeu"){
			new Regle().setVisible(true);
		}
		System.out.println("Selected: " + e.getActionCommand());
	}

}
