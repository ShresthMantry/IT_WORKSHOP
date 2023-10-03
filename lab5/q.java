import java.util.Scanner;

class Student {
    private int studentID;
    private String studentName;
    private int studentAge;
    private String studentMajor;
    private float studentGPA;
    private static int totalStudentsEnrolled = 0;

    public Student(int studentID, String studentName, int studentAge, String studentMajor, float studentGPA) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentMajor = studentMajor;
        this.studentGPA = studentGPA;
        totalStudentsEnrolled++;
    }

    public void setDetails(int studentID, String studentName, int studentAge, String studentMajor, float studentGPA) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentMajor = studentMajor;
        this.studentGPA = studentGPA;
    }

    public String getDetails(int studentID) {
        if (this.studentID == studentID) {
            return "Student ID: " + studentID + "\nStudent Name: " + studentName + "\nStudent Age: " + studentAge
                    + "\nStudent Major: " + studentMajor + "\nStudent GPA: " + studentGPA;
        } else {
            return "Student not found!";
        }
    }

    public void updateDetails(int studentID, String studentName, int studentAge, String studentMajor) {
        if (this.studentID == studentID) {
            this.studentName = studentName;
            this.studentAge = studentAge;
            this.studentMajor = studentMajor;
        }
    }

    public float getGPA(int studentID) {
        if (this.studentID == studentID) {
            return studentGPA;
        } else {
            return -1; // Return a negative value to indicate student not found
        }
    }

    public void updateGPA(int studentID, float newGPA) {
        if (this.studentID == studentID) {
            studentGPA = newGPA;
        }
    }

    public static int totalStudents() {
        return totalStudentsEnrolled;
    }

    public static void compare(Student student1, Student student2) {
        if (student1.studentGPA > student2.studentGPA) {
            System.out.println("Student with higher GPA:\n" + student1.getDetails(student1.studentID));
        } else if (student1.studentGPA < student2.studentGPA) {
            System.out.println("Student with higher GPA:\n" + student2.getDetails(student2.studentID));
        } else {
            System.out.println("Both students have the same GPA.");
        }
    }
}

public class q {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        // Initialize three student objects
        students[0] = new Student(1, "Alice", 20, "Computer Science", 3.8f);
        students[1] = new Student(2, "Bob", 22, "Mathematics", 3.5f);
        students[2] = new Student(3, "Charlie", 21, "Physics", 3.9f);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Update Student Details");
            System.out.println("2. Get Student Details");
            System.out.println("3. Update Student GPA");
            System.out.println("4. Display Total Students Enrolled");
            System.out.println("5. Compare GPAs");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int updateID = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    for (Student student : students) {
                        student.updateDetails(updateID, "New Name", 0, "New Major");
                    }
                    break;
                case 2:
                    System.out.print("Enter Student ID: ");
                    int getID = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    for (Student student : students) {
                        System.out.println(student.getDetails(getID));
                    }
                    break;
                case 3:
                    System.out.print("Enter Student ID: ");
                    int updateGPAID = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter new GPA: ");
                    float newGPA = scanner.nextFloat();
                    for (Student student : students) {
                        student.updateGPA(updateGPAID, newGPA);
                    }
                    break;
                case 4:
                    System.out.println("Total Students Enrolled: " + Student.totalStudents());
                    break;
                case 5:
                    Student.compare(students[0], students[1]);
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
