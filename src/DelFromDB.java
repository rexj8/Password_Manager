import java.sql.*;
import java.util.ArrayList;

public class DelFromDB {

    static ArrayList<String> arrayListurl = new ArrayList<String>();
    static ArrayList<String> arrayListuname = new ArrayList<String>();
    static ArrayList<String> arrayListpswd = new ArrayList<String>();

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
                arrayListurl.add(id);
                arrayListuname.add(name);
                arrayListpswd.add(pswd);
                System.out.println((i + 1) + "  " + arrayListurl.get(i) + "  " + arrayListuname.get(i) + "  " + arrayListpswd.get(i));
                i++;

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void remove(int index) {

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pms", "root", "root");
            String qry = "DELETE FROM CREDENTIALS(URL,UNAME,PSWD) WHERE URL='?' AND UNAME='?' AND PSWD='?';";
            PreparedStatement pstmt = con.prepareStatement(qry.toString());

            System.out.println((index) + "  " + arrayListurl.get(index) + "  " + arrayListuname.get(index) + "  " + arrayListpswd.get(index));

            pstmt.setString(1, arrayListurl.get(index));
            pstmt.setString(2, arrayListuname.get(index));
            pstmt.setString(3, arrayListpswd.get(index));

            pstmt.executeUpdate();

            System.out.println("                      Successfully removed!!");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
