package tests;

import classes.Division;
import classes.Eleve;
import dao.DAO;
import dao.DivisionDAO;
import dao.EleveDAO;

public class testDAO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DAO<Eleve> eleve = new EleveDAO();
		DAO<Division> division = new DivisionDAO();

		// test de la recherche d'un élève en fonction de son code
		System.out.println(eleve.read(1));

		Eleve unEleve = new Eleve(100, "TITI", "TOTO","12/12/2000", new Division(1, "STS2"));
		// test de l'insertion d'un nouvel élève
		unEleve = eleve.create(unEleve);
		System.out.println(eleve.read(100));

		// test de la màj d'un élève
		Eleve unEleveUpdate = new Eleve(100, "test", "test","12/12/2000", new Division(1, "STS2"));
		unEleve = eleve.update(unEleveUpdate);
		System.out.println(eleve.read(100));

		// test de la suppression d'un élève
		eleve.delete(unEleve);



		// test de la recherche d'une division en fonction de son code
		System.out.println(division.read(1));

		Division uneDivision = new Division(100, "test");
		// test de l'insertion d'un nouvel élève
		uneDivision = division.create(uneDivision);
		System.out.println(division.read(100));

		// test de la màj d'un élève
		Division uneDivisionUpdate = new Division(100, "PIPO");
		uneDivision = division.update(uneDivisionUpdate);
		System.out.println(division.read(100));

		// test de la suppression d'un élève
		division.delete(uneDivision);
	}

}
