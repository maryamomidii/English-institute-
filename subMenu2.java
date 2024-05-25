package EnglishInstitute;

import java.util.Scanner;

public class subMenu2 extends subMenu1 {
    private Course[] courses;
    private int courseCount;
    private Student[] students;
    private int studentCount = 0;

    public subMenu2() {
        courses = super.courses;
        courseCount = super.courseCount;
        students = new Student[100];
    }

    

    public void studentMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.println("\nStudent Panel");
            System.out.println("1. View available courses");
            System.out.println("2. Register in a course");
            System.out.println("3. Quit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    viewAvailableCourses();
                    break;
                case 2:
                    registerInCourse(scanner);
                    break;
                case 3:
                    quit = true;
                    System.out.println("Exiting Student Panel.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        mainMenu.displayMainMenu();
    }


    private void viewAvailableCourses() {
        if (courseCount == 0) {
            System.out.println("No courses available.");
            return;
        }

        for (int i = 0; i < courseCount; i++) {
            Course course = courses[i];
            System.out.println(i + 1 +" ) Course Name: " + course.getName());
            System.out.println("Capacity: " + course.getCapacity());
            System.out.println("Price: " + course.getPrice());
            System.out.println("Start Time: " + course.getStartTime());
            System.out.println("End Time: " + course.getEndTime());
            System.out.println("Exam Date: " + course.getExamDate());
            System.out.println("--------------------------------------");
        }
    }

    private void registerInCourse(Scanner scanner) {
        if (courseCount == 0) {
            System.out.println("No courses available to register in.");
            return;
        }

        viewAvailableCourses();

        System.out.print("Enter the index of the course you want to register in: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index < 0 || index >= courseCount) {
            System.out.println("Invalid course index.");
            return;
        }

        Course selectedCourse = courses[index];

        Student student = new Student();
        student.registerInCourse(selectedCourse);
        students[studentCount++] = student;

        System.out.println("You have successfully registered in the course.");
    }
}

    
