package DBTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectingToDB {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:mysql://" + "localhost" + ":" + "3306" + "/qadbt";

		Connection con = DriverManager.getConnection(url, "root", "root");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from empInfo where location = 'Ambad'");
		while (rs.next()) {
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("id"));
			System.out.println(rs.getString("age"));
		}
	}

}
