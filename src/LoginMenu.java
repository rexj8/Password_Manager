public class LoginMenu {

    private String id;
    private String pswrd;

    public void setCredentials(String id, String pswrd) {
//        Class.forName("com.mysql.cj.jdbc.Driver");
        this.id = id;
        this.pswrd = pswrd;

//        Encryption.MD5(id);
//        Encryption.SHA1(pswrd);


    }

    public String getID(String id) {
        return id;
    }

    public String getPswrd(String pswrd) {
        return pswrd;
    }

}
