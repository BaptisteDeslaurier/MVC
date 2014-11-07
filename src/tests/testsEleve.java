package tests;

import classes.Eleve;

public class testsEleve {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Eleve monEleveDefaut = new Eleve();
		Eleve monEleveInit = new Eleve(1, "Dabre", "Thomas", "14/12/1989");

		System.out.println(monEleveDefaut.getCode());
		System.out.println(monEleveDefaut.getNom());
		System.out.println(monEleveDefaut.getPrenom());
		System.out.println(monEleveDefaut.getDateNaiss());



		System.out.println(monEleveInit.getCode());
		System.out.println(monEleveInit.getNom());
		System.out.println(monEleveInit.getPrenom());
		System.out.println(monEleveInit.getDateNaiss());

		monEleveInit.setCode(3);
		monEleveInit.setNom("Legardinier");
		monEleveInit.setPrenom("Ronan");
		monEleveInit.setDateNaiss("21/02/1990");

		System.out.println(monEleveInit.toString());
	}

}
