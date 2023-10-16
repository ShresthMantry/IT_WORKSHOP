import java.util.Arrays;
import java.util.Scanner;

interface Driver {
    int driveCar();

    int driveBike();
}

interface Singer {
    void riyaz();

    int sing();
}

class Person {
    int age;

    public Person(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("Person is eating.");
    }

    public void sleep() {
        System.out.println("Person is sleeping.");
    }
}

class Employee extends Person implements Driver, Singer {
    int eif;

    public Employee(int age) {
        super(age);
        this.eif = this.driveBike() + this.driveCar() + this.sing() + this.officeWork();
    }

    public int driveCar() {
        int drivingScore = (age < 40) ? 10 : 0;
        System.out.println("Driving car score: " + drivingScore);
        return drivingScore;
    }

    public int driveBike() {
        int drivingScore = (age < 40) ? 5 : 0;
        System.out.println("Driving bike score: " + drivingScore);
        return drivingScore;
    }

    public int sing() {
        int singingScore = (age < 20) ? 15 : 0;
        System.out.println("Singing score: " + singingScore);
        return singingScore;
    }

    public void riyaz() {
        System.out.println("Employee is practicing");
    }

    public int officeWork() {
        int officeWorkScore = (age < 40) ? 20 : 10;
        System.out.println("Office work score: " + officeWorkScore);
        return officeWorkScore;
    }

}

public class q3 {

    public static void solve(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[j].eif < employees[i].eif) {
                    Employee temp = employees[j];
                    employees[j] = employees[i];
                    employees[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter age of employee " + (i + 1));
            int age = sc.nextInt();
            employees[i] = new Employee(age);
        }

        solve(employees);
        for(int i = 0;i<employees.length;i++)
        {
            System.out.println("Employee"+(i+1));
            System.out.println("Age "+employees[i].age+" EIF "+employees[i].eif);
        }

    }
}
