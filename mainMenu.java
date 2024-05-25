package EnglishInstitute;

import java.util.Scanner;

public class mainMenu {
    public Course[] courses;
    public int courseCount;

    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Welcome to the English Institute");
            System.out.println("Main Menu:");
            System.out.println("1. Signup");
            System.out.println("2. Instructors Options");
            System.out.println("3. Students Options");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Signup signup = new Signup();
                    signup.signupMenu();
                    break;
                case 2:
                    subMenu1 submenu1 = new subMenu1();
                    submenu1.professorMenu();
                    break;
                case 3:
                    subMenu2 submenu2 = new subMenu2();
                    submenu2.studentMenu();
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);
        scanner.close();
    }
}
