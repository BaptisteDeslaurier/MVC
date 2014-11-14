package dao;

import java.sql.Connection;

public abstract class DAO<T> {

	//*************   ATTRIBUTS    *************
	/**
     * L'URL de la bdd.
     *
     * @see url
     */
	public Connection connect = ConnectionPostgreSQL.getInstance();;

	public abstract T create(T obj);

	public abstract T update(T obj);

	public abstract T read(int numDiv);

	public abstract void delete(T obj);
}
