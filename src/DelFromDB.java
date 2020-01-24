import java.sql.*;

public class DelFromDB {

    public static void remove(int n) {

    }

    public static void showList() {


        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pms", "root", "root");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM CREDENTIALS;");


//            for (int i=0;i<1;i++) {
//                rs.next();
//                System.out.println("   "+(i+1)+"."+" "+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
//
//            }

            while (rs.next()) {
                String id = rs.getString("url");
                String name = rs.getString("uname");
                String job = rs.getString("pswd");
                System.out.println(id + "   " + name + "    " + job);
            }
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
