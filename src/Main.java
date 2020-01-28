import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LoginMenu lm = new LoginMenu();
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("_______________Password_Management_System_______________\n");
        System.out.println("================");
        System.out.println("   LOGIN MENU   ");
        System.out.println("================");

        System.out.println("Enter LOGIN ID");
        String inpLGNID = sc.nextLine().toLowerCase();
        System.out.println("Enter LOGIN PSWRD");
        String inpLGNPWD = sc.nextLine();

        if (lm.checkID(inpLGNID) && lm.checkPswrd(inpLGNPWD)) {
            System.out.println("                      Welcome Sir!");
            while (true) {
                System.out.println("\n\n===============");
                System.out.println("   MAIN MENU   ");
                System.out.println("===============");
                System.out.println("1. SHOW list");
                System.out.println("2. ADD your data");
                System.out.println("3. REMOVE some data");
                System.out.println("4. OPEN url");
                System.out.println("5. EXIT");

                int inpMENU = sc.nextInt();

                if (inpMENU == 1) {
                    ShowItemsInList.showList();
                } else if (inpMENU == 2) {
                    System.out.print("URL-");
                    String inpURL = sc.next();

                    System.out.print("USER NAME-");
                    String inpUsrNAME = sc.next();

                    System.out.print("PASSWORD-");
                    String inpPWD = sc.next();

                    AddIntoDB.add(inpURL, inpUsrNAME, inpPWD);
                } else if (inpMENU == 3) {
                    DelFromDB.showList();
                    System.out.println("\nEnter which data you wanna remove");
                    int n = sc.nextInt();
                    int temp = n - 1;
                    DelFromDB.remove(temp);
                } else if (inpMENU == 4) {
                    OpenURL.showList();
                    System.out.println("\nEnter which URL you wanna open");
                    int n = sc.nextInt();
                    OpenURL.getLink(n);
                    break;
                } else if (inpMENU == 5) System.exit(0);
                else System.out.println("\n                      Wrong input!!");
            }
        } else System.out.println("Your ID or PASSWORD did not match");
    }

}
