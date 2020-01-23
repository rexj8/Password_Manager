import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LoginMenu lm = new LoginMenu();
        Scanner sc = new Scanner(System.in);

//        System.out.println("================");
//        System.out.println("   LOGIN MENU   ");
//        System.out.println("================");
//
//        System.out.println("Enter LOGIN ID");
//        String inpLGNID = sc.nextLine().toLowerCase();
//        System.out.println("Enter LOGIN PSWRD");
//        String inpLGNPWD = sc.nextLine();
//
//        if (lm.checkID(inpLGNID) && lm.checkPswrd(inpLGNPWD))
        {
            System.out.println("Welcome Sir!");
            System.out.println("===============");
            System.out.println("   MAIN MENU   ");
            System.out.println("===============");
            System.out.println("1. ADD your data");
            System.out.println("2. REMOVE some data");
            System.out.println("3. OPEN url");
            System.out.println("4. EXIT");

            int inpMENU = sc.nextInt();

            if (inpMENU == 1) {
                System.out.print("URL-");
                String inpURL = sc.next();

                System.out.print("USER NAME-");
                String inpUsrNAME = sc.next();

                System.out.print("PASSWORD-");
                String inpPWD = sc.next();

                AddIntoDB.add(inpURL, inpUsrNAME, inpPWD);
            } else if (inpMENU == 4) System.exit(0);
            else System.out.println("Wrong input!!");
        }
//        else System.out.println("Your ID or PASSWORD did not match");

    }
}
