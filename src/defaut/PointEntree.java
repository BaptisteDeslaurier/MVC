package defaut;

import vues.GUI;
import dao.DAO;
import classes.Division;
import dao.DivisionDAO;
import classes.Eleve;
import dao.EleveDAO;
import controleurs.ControleurPrincipal;
import dao.ConnectionPostgreSQL;

public class PointEntree {
	public static GUI interfaceGraph;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DAO<Division> modeleDivision = new DivisionDAO();
		DAO<Eleve> modeleEleve = new EleveDAO();
		ControleurPrincipal leControleur = new ControleurPrincipal(modeleDivision,modeleEleve);
		GUI interfaceGraph = new GUI(leControleur);
		leControleur.lienVue(interfaceGraph);
		// Méthode arrêtant la connexion en cours à la bdd
		ConnectionPostgreSQL.Stop();
	}

}
