import java.sql.*;

public class ShowItemsInList {

    public static void showList() {


        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pms", "root", "root");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM CREDENTIALS;");

            int i = 0;
            while (rs.next()) {

                String id = rs.getString("url");
                String name = Encryption.BEA1Decode(rs.getString("uname"));
                String pswd = Encryption.BEA1Decode(rs.getString("pswd"));
                System.out.println(id + "  " + name + "  " + pswd);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
