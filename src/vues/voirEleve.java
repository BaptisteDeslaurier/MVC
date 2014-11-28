package vues;

import javax.swing.JPanel;

import controleurs.ControleurPrincipal;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class voirEleve extends JPanel {

	/**
	 * Create the panel.
	 */
	public voirEleve(ControleurPrincipal leControleur) {
		setLayout(null);

		JLabel lblChoisirUnlve = new JLabel("Choisir un élève :");
		lblChoisirUnlve.setBounds(12, 57, 142, 15);
		add(lblChoisirUnlve);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(153, 52, 178, 24);
		add(comboBox);


	}
}
