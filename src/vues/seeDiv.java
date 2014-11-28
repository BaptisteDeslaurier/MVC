package vues;

import java.util.List;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import classes.Division;

import controleurs.ControleurPrincipal;
import dao.DAO;
import dao.DivisionDAO;

public class seeDiv extends JPanel {

	/**
	 * Create the panel.
	 */
	public seeDiv(ControleurPrincipal leControleur) {
		setLayout(null);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(194, 32, 102, 24);
		add(comboBox);

		DAO<Division> daoDiv = new DivisionDAO();
		List<Division> lesDiv = daoDiv.readAll();
		for (Division uneDiv : lesDiv ) {
			comboBox.addItem(uneDiv.getLibelle());
		}

		JLabel lblChoisirLaDivision = new JLabel("Choisir la division :");
		lblChoisirLaDivision.setBounds(36, 37, 157, 15);
		add(lblChoisirLaDivision);

	}
}
