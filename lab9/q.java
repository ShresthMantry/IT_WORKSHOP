import java.util.*; 
import java.lang.*; 
import java.io.*; 


class Student {
    public String name;
    public int roll;
    public int birthYear;

    public Student(String name, int roll, int birthYear) {
        this.name = name;
        this.roll = roll;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll: " + roll + ", Birth Year: " + birthYear;
    }
    
}

class Sortbyroll implements Comparator<Student> 
{ 
    public int compare(Student a, Student b) 
    { 
        return Integer.compare(b.roll, a.roll);
    } 
} 


class Sortbybirthyear implements Comparator<Student> 
{ 
    public int compare(Student a, Student b) 
    { 
        return Integer.compare(a.birthYear,b.birthYear);
    } 
} 

class SortByFirstName implements Comparator<Student> 
{ 
    public int compare(Student a, Student b) 
    { 
        return a.name.split(" ")[0].compareTo(b.name.split(" ")[0]);
    } 
} 


class SortByLastName implements Comparator<Student> 
{ 
    public int compare(Student a, Student b) 
    { 
        return a.name.split(" ")[1].compareTo(b.name.split(" ")[1]);
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
            String a = sc.nextLine();
            System.out.println("Enter Birth year");
            int birthYear = sc.nextInt();
            String b = sc.nextLine();
            System.out.println("Enter name");
            String name = sc.nextLine();
            students.add(new Student(name, roll, birthYear));
        }


        System.out.println("Sorted Roll number wise -> ");
        Collections.sort(students, new Sortbyroll());
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("Sorted Birth Year wise -> ");
        Collections.sort(students, new Sortbybirthyear());
        for (Student student : students) {
            System.out.println(student);
        }


        System.out.println("Sorted First name wise -> ");
        Collections.sort(students, new SortByFirstName());
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("Sorted Last Name wise -> ");
        Collections.sort(students, new SortByLastName());
        for (Student student : students) {
            System.out.println(student);
        }
        
    }
}
