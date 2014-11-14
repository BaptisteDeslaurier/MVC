package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import classes.Division;
import classes.Eleve;

public class EleveDAO extends DAO<Eleve> {
	private DAO<Division> dao = new DivisionDAO();

	public Eleve create(Eleve obj) {
		try {
			 	PreparedStatement prepare = this.connect.prepareStatement("INSERT INTO \"mvc\".eleve VALUES(?, ?, ?, ?, ?)");
				prepare.setInt(1,obj.getCode());
				prepare.setString(2, obj.getNom());
				prepare.setString(3, obj.getPrenom());
				prepare.setString(4, obj.getDateNaiss());
				prepare.setInt(5, obj.getCodeDivision().getCode());

				prepare.executeUpdate();
				obj = this.read(obj.getCode());
			}
	    catch (SQLException e) {
	            e.printStackTrace();
	    }
	    return obj;
	}



	public Eleve read(int i) {
		Eleve lEleve = new Eleve();
		try {
            ResultSet result = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE).executeQuery("SELECT * FROM \"mvc\".eleve WHERE code = '" + i +"'");
            if(result.first())
            	lEleve = new Eleve(i, result.getString("nom"), result.getString("prenom"), result.getString("datenaiss"), dao.read(result.getInt("codediv")));
		    } catch (SQLException e) {
		    	e.printStackTrace();
		    }
		   return lEleve;
	}

	public Eleve update(Eleve obj) {
		try {
			this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE).executeUpdate("UPDATE \"mvc\".eleve SET nom = '" + obj.getNom() + "', prenom = '" + obj.getPrenom() + "', datenaiss = '" + obj.getDateNaiss() + "', codediv = '" + obj.getCodeDivision() + "'"+" WHERE code = '" + obj.getCode()+"'");
            obj = this.read(obj.getCode());
	    } catch (SQLException e) {
	    	e.printStackTrace();
	    }
	    return obj;
	}


	public void delete(Eleve obj) {
		try {
			this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE).executeUpdate("DELETE FROM \"mvc\".eleve WHERE code = '" + obj.getCode()+"'");
		} catch (SQLException e) {
	    	e.printStackTrace();
	    }
	}
}