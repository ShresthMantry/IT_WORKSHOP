import java.util.*;

class Student {
    int studentID;
    String studentName;
    int studentAge;
    String studentMajor;
    float studentGPA;
    static int totalStudentsEnrolled = 0;

    public Student() {
        totalStudentsEnrolled++;
    }

    public Student(int studentID, String studentName, int studentAge, String studentMajor, float studentGPA) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentMajor = studentMajor;
        this.studentGPA = studentGPA;
        totalStudentsEnrolled++;
    }

    public static int search(ArrayList<Student> students, int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).studentID == id) {
                return i;
            }
        }
        return -1;
    }

    public void setDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Id");
        this.studentID = scanner.nextInt();
        System.out.println("Enter Student Age");
        this.studentAge = scanner.nextInt();
        System.out.println("Enter Student Gpa");
        this.studentGPA = scanner.nextFloat();
        System.out.println("Enter Student Major");
        this.studentMajor = scanner.next();
        System.out.println("Enter Student Name");
        this.studentName = scanner.next();
    }

    public void getDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Student Major: " + studentMajor);
        System.out.println("Student GPA: " + studentGPA);
        System.out.println("Student Count: " + totalStudentsEnrolled);
    }

    public static void getDetails(ArrayList<Student> students, int id) {
        if (search(students, id) == -1) {
            System.out.println("Invalid Id");
            return;
        }
        students.get(search(students, id)).getDetails();
    }

    public void updateDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Age");
        this.studentAge = scanner.nextInt();
        System.out.println("Enter Student Name");
        this.studentName = scanner.next();
        System.out.println("Enter Student Major");
        this.studentMajor = scanner.next();

    }

    public static void updateDetails(ArrayList<Student> students, int id) {
        if (search(students, id) == -1) {
            System.out.println("Invalid Id");
            return;
        }
        students.get(search(students, id)).updateDetails();
    }

    public void getGPA() {
        System.out.println("Student GPA: " + studentGPA);
    }

    public static void getGPA(ArrayList<Student> students, int id) {
        if (search(students, id) == -1) {
            System.out.println("Invalid Id");
            return;
        }
        students.get(search(students, id)).getGPA();
    }

    public void updateGPA() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student GPA");
        this.studentGPA = scanner.nextFloat();
    }

    public static void updateGPA(ArrayList<Student> students, int id) {
        if (search(students, id) == -1) {
            System.out.println("Invalid Id");
            return;
        }
        students.get(search(students, id)).updateGPA();
    }

    public static void totalStudents() {
        System.out.println("Total Students are : " + totalStudentsEnrolled);
    }

    public static void compareGPA(ArrayList<Student> students, int id1, int id2) {
        if (search(students, id1) == -1) {
            System.out.println("Invalid Id");
            return;
        }
        if (search(students, id2) == -1) {
            System.out.println("Invalid Id");
            return;
        }
        if (students.get(search(students, id1)).studentGPA >= students.get(search(students, id2)).studentGPA) {
            Student.getDetails(students, id1);
        } else {
            Student.getDetails(students, id2);
        }
    }

}

public class q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>(2);
        // Student[] students = new Student[2];

        for (int i = 0; i < 1; i++) {
            students.add(new Student());
            System.out.println("Enter details for Student " + (i + 1));
            students.get(i).setDetails();
        }

        System.out.println(students);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Update Details");
            System.out.println("2. Get Details");
            System.out.println("3. Update Student GPA");
            System.out.println("4. Compare Student GPA");
            System.out.println("5. Create a new Record");
            System.out.println("6. Delete a record by id");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            int studentID;
            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    studentID = scanner.nextInt();
                    Student.updateDetails(students, studentID);
                    break;
                case 2:
                    System.out.print("Enter Student ID: ");
                    studentID = scanner.nextInt();
                    Student.getDetails(students, studentID);
                    break;
                case 3:
                    System.out.print("Enter Student ID: ");
                    studentID = scanner.nextInt();
                    Student.updateGPA(students, studentID);
                    break;
                case 4:
                    System.out.print("Enter Student ID1: ");
                    int studentID1 = scanner.nextInt();
                    System.out.print("Enter Student ID2: ");
                    int studentID2 = scanner.nextInt();
                    Student.compareGPA(students, studentID1, studentID2);
                    break;
                case 5:
                    Student s = new Student();
                    s.setDetails();
                    students.add(s);
                    break;
                case 6:
                    System.out.print("Enter Student ID: ");
                    studentID = scanner.nextInt();
                    if(Student.search(students, studentID)!=-1)
                    {
                        students.remove(students.get(Student.search(students, studentID)));
                    }
                    else
                        System.out.println("Invalid ID");
                case 7:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 7);

    }
}
