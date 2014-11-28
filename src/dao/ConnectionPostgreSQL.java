package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPostgreSQL {

	//*************   ATTRIBUTS    *************
	/**
     * L'URL de la bdd.
     *
     * @see url
     */
	private static String url = "jdbc:postgresql://172.16.99.2:5432/bdeslaurier";

	/**
     * L'utilisateur de la bdd.
     *
     * @see user
     */
	private static String user = "b.deslaurier";

	/**
     * Le mot de passe de l'utilisateur de la bdd.
     *
     * @see passwd
     */
	private static String passwd = "passe";

	/**
     * Un objet Connection
     *
     * @see connect
     */
	private static Connection connect;


	//*************   METHODES   *************
	/**
     * Méthode getInstance() permet la connection à la base de données.
     */
	public static Connection getInstance(){
		if(connect == null){
			try {
	    		connect = DriverManager.getConnection(url, user, passwd);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return connect;
		}
	public static void Stop(){
		try {
			connect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}