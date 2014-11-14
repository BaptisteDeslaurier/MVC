package classes;

public class Eleve {

	//*************   ATTRIBUTS    *************
	/**
	 * Le code d'un élève.
	 *
	 * @see code
	 */
	private int code;

	/**
	 * Le nom d'un élève.
	 *
	 * @see nom
	 */
	private String nom;

	/**
	 * Le prénom d'un élève.
	 *
	 * @see prenom
	 */
	private String prenom;

	/**
	 * La date de naissance d'un élève.
	 *
	 * @see dateNaiss
	 */
	private String dateNaiss;

	/**
	 * Le code division d'un élève.
	 *
	 * @see codeDivision
	 */
	private Division codeDivision;


	//*************   ACCESSEURS    *************
	/**
     * Retourne le code d'un élève.
     *
     * @return Le code d'un élève.
     */
	public int getCode()
	{
		return code;
	}

	/**
     * Retourne le nom d'un élève.
     *
     * @return Le nom d'un élève.
     */
	public String getNom()
	{
		return nom;
	}

	/**
     * Retourne le prénom d'un élève.
     *
     * @return Le prénom d'un élève.
     */
	public String getPrenom()
	{
		return prenom;
	}

	/**
     * Retourne la date de naissance d'un élève.
     *
     * @return La date de naissance d'un élève.
     */
	public String getDateNaiss()
	{
		return dateNaiss;
	}

	/**
     * Retourne le code division d'un élève.
     *
     * @return Le code division d'un élève.
     */
	public Division getCodeDivision()
	{
		return codeDivision;
	}

	//*************   MUTATEURS    *************
	/**
     * Met à jour le code de l'élève.
     *
     * @param code
     * Le nouveau code de l'élève.
     */
	public void setCode(int code)
	{
		this.code = code;
	}

	/**
     * Met à jour le nom de l'élève.
     *
     * @param nom
     * Le nouveau nom de l'élève.
     */
	public void setNom(String nom)
	{
		this.nom = nom;
	}

	/**
     * Met à jour le prénom de l'élève.
     *
     * @param prenom
     * Le nouveau prénom de l'élève.
     */
	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}

	/**
     * Met à jour la date de naissance de l'élève.
     *
     * @param dateNaiss
     * La nouvelle date de naissance de l'élève.
     */
	public void setDateNaiss(String dateNaiss)
	{
		this.dateNaiss = dateNaiss;
	}

	/**
     * Met à jour le code division de l'élève.
     *
     * @param codeDivision
     * Le nouveau code division de l'élève.
     */
	public void setCodeDivision(Division codeDivision)
	{
		this.codeDivision = codeDivision;
	}


	//*************   CONSTRUCTEURS   *************
	/**
     * Constructeur par défaut de Eleve.
     */
	public Eleve()
	{
		this.code = 1;
		this.nom = "Deslaurier";
		this.prenom = "Baptiste";
		this.dateNaiss = "01/09/1994";
		this.codeDivision = new Division();
	}

	/**
     * Constructeur avec une initialisation.
     *
     * @param code
     * Le code de l'élève.
     * @param nom
     * Le nom de l'élève.
     * @param prenom
     * Le v de l'élève.
     * @param dateNaiss
     * La date de naissance de l'élève.
     */
	public Eleve(int code, String nom, String prenom, String dateNaiss, Division codeDivision)
	{
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.codeDivision = codeDivision;
	}


	//*************   METHODES   *************
	/**
     * Méthode toString() retournant une chaîne de caractères composée des valeurs des attributs.
     */
	public String toString()
	{
		return "Code élève : " + this.code + ", se nomme : " + this.nom + " " + this.prenom + ", est né en " + this.dateNaiss + " et a pour code division : " + this.codeDivision;
	}
}