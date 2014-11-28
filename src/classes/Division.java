package classes;

/**
 * Division est la classe représentant une division
 *
 * @author BaptisteDeslaurier
 * @version 1.0
 */
public class Division {

	//*************   ATTRIBUTS    *************
	/**
     * Le code d'une division.
     *
     * @see code
     */
	private int code;

	/**
     * Le libelle d'une division.
     *
     * @see libelle
     */
	private String libelle;


	//*************   ACCESSEURS    *************
	/**
     * Retourne le code d'une division.
     *
     * @return Le code d'une division.
     */
	public int getCode()
	{
		return code;
	}

	/**
     * Retourne le libelle d'une division.
     *
     * @return Le libelle d'une division.
     */
	public String getLibelle()
	{
		return libelle;
	}


	//*************   MUTATEURS    *************
	/**
     * Met à jour le code de la division.
     *
     * @param code
     * Le nouveau code de la division.
     */
	public void setCode(int code)
	{
		this.code = code;
	}

	/**
     * Met à jour le libelle de la division.
     *
     * @param libelle
     * Le nouveau libelle de la division.
     */
	public void setLibelle(String libelle)
	{
		this.libelle = libelle;
	}


	//*************   CONSTRUCTEURS   *************
	/**
     * Constructeur par défaut de Division.
     */
	public Division()
	{
		this.code = 1;
		this.libelle = "STS2";
	}

	/**
     * Constructeur avec une initialisation.
     *
     * @param code
     * Le code de la division.
     * @param libelle
     * Le libelle de la division.
     */
	public Division(int code, String libelle)
	{
		this.code = code;
		this.libelle = libelle;
	}

	public Division(Division laDivision)
	{
		this.code = laDivision.getCode();
		this.libelle = laDivision.getLibelle();
	}


	//*************   METHODES   *************
	/**
     * Méthode toString() retournant une chaîne de caractères composée des valeurs des attributs.
     */
	public String toString()
	{
		return "Code division : " + this.code + " et son libelle : " + this.libelle;
	}
}
