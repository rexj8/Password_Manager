import java.sql.*;

public class AddIntoDB {

    public static void add(String url, String Uname, String pwd) {

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pms", "root", "root");
            String qry = "INSERT INTO CREDENTIALS(URL,UNAME,PSWD) VALUES(?,?,?);";
            PreparedStatement pstmt = con.prepareStatement(qry);

            pstmt.setString(1, url);
            pstmt.setString(2, Uname);
            pstmt.setString(3, pwd);

            Statement stmt = con.createStatement();
            ResultSet results = stmt.executeQuery("SELECT * FROM CREDENTIALS;");

            System.out.println(results);


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
