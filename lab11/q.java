import java.util.Scanner;

// Custom exception classes
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class InvalidPINException extends Exception {
    public InvalidPINException(String message) {
        super(message);
    }
}

class InvalidRollNumberException extends Exception {
    public InvalidRollNumberException(String message) {
        super(message);
    }
}

class InvalidEmployeeIDException extends Exception {
    public InvalidEmployeeIDException(String message) {
        super(message);
    }
}

class Person {
    protected String firstName;
    protected String lastName;
    protected String PAN;
    protected String addressPIN;

    public Person(String firstName, String lastName, String PAN, String addressPIN) throws InvalidPINException, InvalidEmailException, InvalidRollNumberException, InvalidEmployeeIDException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.PAN = PAN;
        this.addressPIN = addressPIN;
        validate();
    }

    public void validate() throws InvalidPINException, InvalidEmailException, InvalidRollNumberException, InvalidEmployeeIDException {
        if (!addressPIN.matches("\\d{6}")) {
            throw new InvalidPINException("Invalid PIN code format");
        }
    }
}

class Student extends Person {
    private String emailID;
    private String rollNumber;

    public Student(String firstName, String lastName, String PAN, String addressPIN, String emailID, String rollNumber)
            throws InvalidEmailException, InvalidRollNumberException, InvalidPINException, InvalidEmployeeIDException {
        super(firstName, lastName, PAN, addressPIN);
        this.emailID = emailID;
        this.rollNumber = rollNumber;
        validate();
    }

    public void validate() throws InvalidEmailException, InvalidRollNumberException, InvalidPINException, InvalidEmployeeIDException {
        super.validate();
        if (!emailID.matches("^[a-zA-Z0-9]+[@][a-zA-Z0-9]+[.][a-zA-Z0-9]+")
                || !emailID.matches(".*[@!#\\$&\\*].*")) {
            throw new InvalidEmailException("Invalid email ID format");
        }
        if (!rollNumber.matches("stud\\d{5}")) {
            throw new InvalidRollNumberException("Invalid roll number format");
        }
    }
}

class Employee extends Person {
    private String emailID;
    private String employeeID;

    public Employee(String firstName, String lastName, String PAN, String addressPIN, String emailID, String employeeID)
            throws InvalidEmailException, InvalidEmployeeIDException, InvalidPINException, InvalidRollNumberException {
        super(firstName, lastName, PAN, addressPIN);
        this.emailID = emailID;
        this.employeeID = employeeID;
        validate();
    }

    public void validate() throws InvalidEmailException, InvalidEmployeeIDException, InvalidPINException, InvalidRollNumberException {
        super.validate();
        if (!emailID.matches("^[a-zA-Z0-9]+[@][a-zA-Z0-9]+[.][a-zA-Z0-9]+")
                || !emailID.matches(".*[@!#\\$&\\*].*")) {
            throw new InvalidEmailException("Invalid email ID format");
        }
        if (!employeeID.matches("emp\\d{3}")) {
            throw new InvalidEmployeeIDException("Invalid employee ID format");
        }
    }
}

public class q {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Input for a Student
            System.out.println("Enter Student Details:");
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("PAN: ");
            String PAN = scanner.nextLine();
            System.out.print("Address PIN: ");
            String addressPIN = scanner.nextLine();
            System.out.print("Email ID: ");
            String emailID = scanner.nextLine();
            System.out.print("Roll Number: ");
            String rollNumber = scanner.nextLine();

            Student student = new Student(firstName, lastName, PAN, addressPIN, emailID, rollNumber);

            // Input for an Employee
            System.out.println("Enter Employee Details:");
            System.out.print("First Name: ");
            firstName = scanner.nextLine();
            System.out.print("Last Name: ");
            lastName = scanner.nextLine();
            System.out.print("PAN: ");
            PAN = scanner.nextLine();
            System.out.print("Address PIN: ");
            addressPIN = scanner.nextLine();
            System.out.print("Email ID: ");
            emailID = scanner.nextLine();
            System.out.print("Employee ID: ");
            String employeeID = scanner.nextLine();

            Employee employee = new Employee(firstName, lastName, PAN, addressPIN, emailID, employeeID);

            scanner.close();
        } catch (InvalidEmailException | InvalidPINException | InvalidRollNumberException | InvalidEmployeeIDException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }

        // Demonstrating ArrayOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayOutOfBoundsException: " + e.getMessage());
        }

        // Demonstrating NullPointerException
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }
}
