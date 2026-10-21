import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentDAO studentDAO = new StudentDAO();

        while (true) {

            System.out.println("\n================================");
            System.out.println("     STUDENT MANAGEMENT SYSTEM");
            System.out.println("================================");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student Marks");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.println("================================");

            int choice = readInt(scanner, "Enter your choice: ");

            switch (choice) {

                case 1:
                    String name = readText(scanner, "Enter student name: ");
                    String course = readText(scanner, "Enter student course: ");
                    int marks;

                    while (true) {
                        marks = readInt(scanner, "Enter student marks (0-100): ");

                        if (marks >= 0 && marks <= 100) {
                            break;
                        }

                        System.out.println("Invalid marks! Enter marks between 0 and 100.");
                    }

                    Student student = new Student(0, name, course, marks);
                    studentDAO.addStudent(student);
                    break;

                case 2:
                    studentDAO.viewAllStudents();
                    break;

                case 3:
                    int updateId = readInt(scanner, "Enter student ID to update: ");
                    int newMarks;

                    if (updateId <= 0) {
                        System.out.println("Student ID must be greater than zero.");
                        break;
                    }

                    while (true) {
                        newMarks = readInt(scanner, "Enter new marks (0-100): ");

                        if (newMarks >= 0 && newMarks <= 100) {
                            break;
                        }

                        System.out.println("Invalid marks! Enter marks between 0 and 100.");
                    }

                    studentDAO.updateStudentMarks(updateId, newMarks);
                    break;

                case 4:
                    int deleteId = readInt(scanner, "Enter student ID to delete: ");

                    if (deleteId <= 0) {
                        System.out.println("Student ID must be greater than zero.");
                        break;
                    }

                    studentDAO.deleteStudent(deleteId);
                    break;

                case 5:
                    System.out.println("Thank you for using Student Management System!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please select 1 to 5.");
            }
        }
    }

    public static int readInt(Scanner scanner, String message) {

        while (true) {
            System.out.print(message);
            String input = scanner.nextLine();

            try {
                return Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }
    }

    public static String readText(Scanner scanner, String message) {

        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            }

            System.out.println("Input cannot be empty. Please try again.");
        }
    }

}