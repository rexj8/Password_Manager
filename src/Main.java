import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoginMenu lm = new LoginMenu();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter LOGIN ID");
        String inpid = sc.nextLine().toLowerCase();

        System.out.println("Enter LOGIN PSWRD");
        String inppwd = sc.nextLine();

        System.out.println("Welcome Sir!");

//        try {
//            Runtime.getRuntime().exec("clear");
//        } catch (IOException e) {
//
//        }

        if (lm.checkID(inpid) && lm.checkPswrd(inppwd)) System.out.println(Encryption.MD5("java"));

    }
}
