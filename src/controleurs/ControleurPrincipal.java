package controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import vues.GUI;
import dao.DAO;
import classes.Division;
import dao.DivisionDAO;
import classes.Eleve;
import dao.EleveDAO;

public class ControleurPrincipal implements ActionListener {

	private GUI vue;
	private DAO<Division> laDivision = new DivisionDAO();
	private DAO<Eleve> leleve = new EleveDAO();

	 // Constructeur
	 public ControleurPrincipal(DAO<Division> modeleD, DAO<Eleve> modeleE) {
		 this.laDivision=modeleD;
		 this.leleve=modeleE;
	 }

	 public void lienVue(GUI laVue) {
		 this.vue = laVue;
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == vue.mntmQuitter) {
			System.exit(0);
		}else if (e.getSource() == vue.mntmVoir){
				vue.panelVoirDiv.setVisible(true);
			}else if (e.getSource() instanceof JMenuItem)
				{
					vue.panelEleve.setVisible(true);
				}
	}
}