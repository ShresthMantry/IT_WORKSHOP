import java.util.*; 
import java.lang.*; 
import java.io.*; 


class Student {
    public String name;
    public int roll;
    public String birthYear;

    public Student(String name, int roll, String birthYear) {
        this.name = name;
        this.roll = roll;
        this.birthYear = birthYear;
    }
    
}

class Sortbyroll implements Comparator<Student> 
{ 
    public int compare(Student a, Student b) 
    { 
        return a.roll-b.roll;
    } 
} 

public class q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        for(int i = 0;i<5;i++)
        {
            System.out.println("Enter Roll for student "+(i+1));
            int roll = sc.nextInt();
            System.out.println("Enter Birth year");
            int birthYear = sc.nextInt();
            System.out.println("Enter name");
            String name = sc.nextLine();
            students.add(new Student(name, roll, name));
        }



        
    }
}
