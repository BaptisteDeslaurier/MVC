package dao;

import java.sql.Connection;

public abstract class DAO<T> {

	//*************   ATTRIBUTS    *************
	/**
     * L'URL de la bdd.
     *
     * @see url
     */
	public static Connection connectDAO;

	public abstract T create(T obj);

	public abstract T update(T obj);

	public abstract T read(T obj);

	public abstract T delete(T obj);
}
