package EnglishInstitute;

import java.util.Scanner;

public class subMenu1 extends mainMenu {
    public Course[] courses;
    public int courseCount;

    public subMenu1() {
        courses = new Course[100];
        courseCount = 0;
        addDefaultCourses();
    }

    private void addDefaultCourses() {
        addCourse(new Course("Beginner English", 25, 8000000, "9:00 AM", "11:00 AM", "2024-06-30"));
        addCourse(new Course("Intermediate English", 20, 8500000, "1:00 PM", "3:00 PM", "2024-07-15"));
        addCourse(new Course("Advanced English Conversation", 18, 15000000, "4:00 PM", "6:00 PM", "2024-08-01"));
        addCourse(new Course("Ielts English", 22, 6800000, "10:00 AM", "12:00 PM", "2024-09-01"));
        addCourse(new Course("Russian Language", 28, 9000000, "6", "8", "2024-10-01"));
        addCourse(new Course("French", 28, 9000000, "6", "8", "2024-11-15"));
    }

    private void addCourse(Course course) {
        courses[courseCount++] = course;
    }

    public void professorMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        
        while (!quit) {
            System.out.println("\nProfessor Panel");
            System.out.println("1. Add a new course");
            System.out.println("2. View course details");
            System.out.println("3. Update course details");
            System.out.println("4. Quit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                addCourseByScanner(scanner);
                    break;
                case 2:
                    viewCourseDetails();
                    break;
                case 3:
                    updateCourse(scanner);
                    break;
                case 4:
                    quit = true;
                    System.out.println("Exiting Professor Panel.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        mainMenu.displayMainMenu();
    }

    private void addCourseByScanner(Scanner scanner) {
        System.out.print("Enter course name: ");
        String name = scanner.nextLine();

        System.out.print("Enter course capacity: ");
        int capacity = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter course price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter course start time: ");
        String startTime = scanner.nextLine();

        System.out.print("Enter course end time: ");
        String endTime = scanner.nextLine();

        System.out.print("Enter course exam date: ");
        String examDate = scanner.nextLine();

        Course course = new Course(name, capacity, price, startTime, endTime, examDate);
        addCourse(course);
        System.out.println("Course added successfully!");
    }

    private void viewCourseDetails() {
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
    private void updateCourse(Scanner scanner){
        viewCourseDetails();
        System.out.print("Enter the index of the course you want to update: ");
        int index = scanner.nextInt() - 1;
        Course course = courses[index];

        //check the index
        if (index < 0 || index >= courseCount) {
            System.out.println("Invalid course index.");
            return;
        }
        System.out.println("What do you want to update?");
        System.out.println("1. Name");
        System.out.println("2. Capacity");
        System.out.println("3. Price");
        System.out.println("4. Start Time");
        System.out.println("5. End Time");
        System.out.println("6. Exam Date");
        System.out.println("7. Cancel");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        //updating process:
        switch (choice) {
            case 1:
                System.out.print("Enter new course name (current: " + course.getName() + "): ");
                String newName = scanner.nextLine();
                course.setName(newName);
                break;
            case 2:
                System.out.print("Enter new course capacity (current: " + course.getCapacity() + "): ");
                int newCapacity = scanner.nextInt();
                scanner.nextLine();
                course.setCapacity(newCapacity);
                break;
            case 3:
                System.out.print("Enter new course price (current: " + course.getPrice() + "): ");
                double newPrice = scanner.nextDouble();
                scanner.nextLine();
                course.setPrice(newPrice);
                break;
            case 4:
                System.out.print("Enter new course start time (current: " + course.getStartTime() + "): ");
                String newStartTime = scanner.nextLine();
                course.setStartTime(newStartTime);
                break;
            case 5:
                System.out.print("Enter new course end time (current: " + course.getEndTime() + "): ");
                String newEndTime = scanner.nextLine();
                course.setEndTime(newEndTime);
                break;
            case 6:
                System.out.print("Enter new course exam date (current: " + course.getExamDate() + "): ");
                String newExamDate = scanner.nextLine();
                course.setExamDate(newExamDate);
                break;
            case 7:
                System.out.println("Canceled course update.");
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
                return;
        }
    
        System.out.println("Course updated successfully!");
    }
}