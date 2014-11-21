package defaut;

import vues.GUI;
import dao.DAO;
import classes.Division;
import dao.DivisionDAO;
import classes.Eleve;
import dao.EleveDAO;
import controleurs.ControleurPrincipal;

public class PointEntree {
	public static GUI interfaceGraph;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DAO<Division> modeleDivision = new DivisionDAO();
		DAO<Eleve> modeleEleve = new EleveDAO();
		ControleurPrincipal leControleur = new ControleurPrincipal(modeleDivision,modeleEleve);
		interfaceGraph = new GUI(leControleur);
		leControleur.lienVue(interfaceGraph);
		//ConnectionPostgreSQL.Arreter(); // Méthode arrêtant la connexion en cours à la bdd

	}

}
