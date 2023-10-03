import java.util.Scanner;

class Student {
    int studentID;
    String studentName;
    int studentAge;
    String studentMajor;
    float studentGPA;
    static int totalStudentsEnrolled = 0;
    String gender;

    public Student() {
        totalStudentsEnrolled++;
    }

    public Student(int studentID, String studentName, int studentAge, String studentMajor, float studentGPA,String gender) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentMajor = studentMajor;
        this.studentGPA = studentGPA;
        this.gender=gender;
        totalStudentsEnrolled++;
    }

    public static int search(Student[] student, int id) {
        for (int i = 0; i < student.length; i++) {
            if (student[i].studentID == id) {
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
        System.out.println("Enter Student Gender");
        this.gender = scanner.next();
    }

    public void getDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Student Major: " + studentMajor);
        System.out.println("Student GPA: " + studentGPA);
        System.out.println("Student Count: " + totalStudentsEnrolled);
        System.out.println("Student gender: "+gender);
    }

    public static void getDetails(Student[] students, int id) {
        if(search(students, id)==-1)
        {
            System.out.println("Invalid Id");
            return;
        }
        students[search(students, id)].getDetails();
    }

    public void updateDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Age");
        this.studentAge = scanner.nextInt();
        System.out.println("Enter Student Name");
        this.studentName = scanner.next();
        System.out.println("Enter Student Major");
        this.studentMajor = scanner.next();
        System.out.println("Enter gender");
        this.gender = scanner.next();

    }

    public static void updateDetails(Student[] students, int id) {
        if(search(students, id)==-1)
        {
            System.out.println("Invalid Id");
            return;
        }
        students[search(students, id)].updateDetails();
    }

    public void getGPA() {
        System.out.println("Student GPA: " + studentGPA);
    }

    public static void getGPA(Student[] students, int id) {
        if(search(students, id)==-1)
        {
            System.out.println("Invalid Id");
            return;
        }
        students[search(students, id)].getGPA();
    }

    public void updateGPA() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student GPA");
        this.studentGPA = scanner.nextFloat();
    }

    public static void updateGPA(Student[] students, int id) {
        if(search(students, id)==-1)
        {
            System.out.println("Invalid Id");
            return;
        }
        students[search(students, id)].updateGPA();
    }

    public static void totalStudents() {
        System.out.println("Total Students are : " + totalStudentsEnrolled);
    }

    public static void compareGPA(Student[] students, int id1, int id2) {
        if(search(students, id1)==-1)
        {
            System.out.println("Invalid Id");
            return;
        }
        if(search(students, id2)==-1)
        {
            System.out.println("Invalid Id");
            return;
        }
        if (students[search(students, id1)].studentGPA >= students[search(students, id2)].studentGPA) {
            Student.getDetails(students, id1);
        } else {
            Student.getDetails(students, id2);
        }
    }

}

public class Stu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[2];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.println("Enter details for Student " + (i + 1));
            students[i].setDetails();
        }

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Update Details");
            System.out.println("2. Get Details");
            System.out.println("3. Update Student GPA");
            System.out.println("4. Compare Student GPA");
            System.out.println("5. Exit");
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
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 5);


    }
}
