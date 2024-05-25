package EnglishInstitute;

import java.util.Scanner;

public class Signup extends mainMenu {
    private static String[] username = new String[100];
    private static String[] pass = new String[100];
    private static int userCount = 0;

    public void signupMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your email:");
        String email = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        // Check if the user is already registered.
        boolean userExists = false;
        if (userCount == 0 ){
            username[userCount] = email;
            pass[userCount] = password;
            userCount += 1;
            System.out.println("Signup successful!");
            return;
        }
        for (int i = 0; i < userCount; i++) {
            if (username[i].equals(email)) {
                userExists = true;
                if (pass[i].equals(password)) {
                    System.out.println("User already signed up. welcome back!");
                } else {
                    System.out.println("User already signed up with a different password.");
                }
            }
        }

        // If the user is not registered:
        if (!userExists) {
            username[userCount] = email;
            pass[userCount] = password;
            userCount += 1;
            System.out.println("huhuhuhuhuuh\n");
            System.out.println("Signup successful!");
        }
    }
}