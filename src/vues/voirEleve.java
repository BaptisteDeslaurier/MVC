package vues;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import classes.Division;
import classes.Eleve;
import controleurs.ControleurPrincipal;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import dao.EleveDAO;

public class voirEleve extends JPanel {
	public Division laDivision;
	public JComboBox comboBox = new JComboBox();
	public List<Eleve> listeEleves;

	/**
	 * Create the panel.
	 */
	public voirEleve(ControleurPrincipal leControleur) {
		setLayout(null);

		JLabel lblChoisirUnlve = new JLabel("Choisir un élève :");
		lblChoisirUnlve.setBounds(12, 57, 142, 15);
		add(lblChoisirUnlve);
		comboBox.setBounds(153, 52, 178, 24);
		add(comboBox);

		JLabel label = new JLabel("Classe de ");
		label.setBounds(33, 12, 70, 15);
		add(label);


	}
}
