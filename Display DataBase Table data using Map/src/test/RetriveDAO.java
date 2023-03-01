package test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

public class RetriveDAO {
	public Map<String,ProductValues> retrive(Map<String,ProductValues> ob)
	{
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("select * from Product48");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
   			 String ob1 = new String(rs.getString(1));
   			 ProductValues ob2 = new ProductValues (rs.getString(2),rs.getFloat(3),rs.getInt(4));
   					 
   			 ob.put(ob1, ob2);
   		 }//end of loop

		}catch(Exception e) {e.printStackTrace();}
		return ob;
	}
}