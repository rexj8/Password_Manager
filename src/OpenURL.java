import java.awt.*;
import java.net.URI;
import java.sql.*;
import java.util.ArrayList;

public class OpenURL {

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
                System.out.println((i + 1) + "  " + arrayListurl.get(i) + "  " + arrayListuname.get(i));
                i++;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void getLink(int n) {
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            int index = n - 1;
            String url = arrayListurl.get(index);
            URI oURL = new URI(url);
            desktop.browse(oURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
