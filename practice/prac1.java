import java.util.*;
class Student
{
    int studentId;
    String studentName;
    double gpa;
    Student(int id,String name,double gpa)
    {
        studentId=id;
        studentName=name;
        this.gpa=gpa;
    }
    public void setDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Id");
        studentId=sc.nextInt();
        System.out.println("Enter Student Gpa");
        this.gpa = sc.nextDouble();
        System.out.println("Enter Student Name");
        this.studentName=sc.next();
    }
    public void getDetails(int id)
    {
        if(studentId==id)
        {
            System.out.println(this.studentId+" "+this.studentName+" "+this.gpa);
        }
    }
}

class prac1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Student[] students = new Student[2];
        ArrayList<Student> students = new ArrayList<>(2);


        for(int i = 0;i<2;i++)
        {
            int id = sc.nextInt();
            double gpa = sc.nextDouble();
            String name = sc.next();
            students.add(new Student(id, name, gpa));
        }

        System.out.println("Enter id to search");
        int id = sc.nextInt();

        for(int i = 0;i<students.size();i++)
        {
            students.get(i).getDetails(id);
        }

    }
}