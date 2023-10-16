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
    public Employee(int age) {
        super(age);
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

public class q2 {
    public static void main(String[] args) {
        Employee employee = new Employee(30);

        Driver employee1 = employee;
        employee1.driveBike();
        employee1.driveCar();

        Singer employee2 = employee;
        employee2.riyaz();
        employee2.riyaz();
    }
}
