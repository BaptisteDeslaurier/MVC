package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import classes.Division;

public class DivisionDAO extends DAO<Division> {

		public Division create(Division obj) {
			try {
				 	PreparedStatement prepare = this.connect.prepareStatement("INSERT INTO \"mvc\".division VALUES(?, ?)");
					prepare.setInt(1,obj.getCode());
					prepare.setString(2, obj.getLibelle());

					prepare.executeUpdate();
					obj = this.read(obj.getCode());
				}
		    catch (SQLException e) {
		            e.printStackTrace();
		    }
		    return obj;
		}



		public Division read(int i) {
			Division laDivision = new Division();
			try {
	            ResultSet result = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE).executeQuery("SELECT * FROM \"mvc\".division WHERE code = '" + i +"'");
	            if(result.first())
	            		laDivision = new Division(i, result.getString("libelle"));
			    } catch (SQLException e) {
			            e.printStackTrace();
			    }
			   return laDivision;
		}

		public Division update(Division obj) {
			try {
				this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE).executeUpdate("UPDATE \"mvc\".division SET libelle = '" + obj.getLibelle() + "'"+" WHERE code = '" + obj.getCode()+"'");
	            obj = this.read(obj.getCode());
		    } catch (SQLException e) {
		    	e.printStackTrace();
		    }
		    return obj;
		}


		public void delete(Division obj) {
			try {
				this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE).executeUpdate("DELETE FROM \"mvc\".division WHERE code = '" + obj.getCode()+"'");
			} catch (SQLException e) {
		    	e.printStackTrace();
		    }
		}


		public List<Division> readAll() {
			List<Division> lesDivision = new ArrayList<Division>();
			try {
	            ResultSet result = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE).executeQuery("SELECT * FROM \"mvc\".division");
	            while (result.next()) {
	            	  int code = result.getInt("code");
	            	  String libelle = result.getString("libelle");

	            	  Division div = new Division(code, libelle);

	            	  lesDivision.add(div);
	            	}
			} catch (SQLException e) {
				e.printStackTrace();
			}

			return lesDivision;
		}
}