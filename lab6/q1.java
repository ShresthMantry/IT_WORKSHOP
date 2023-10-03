import java.util.ArrayList;
import java.util.*;

public class q1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nArrayList Operations Menu:");
            System.out.println("1. Add Element");
            System.out.println("2. Remove Element");
            System.out.println("3. Search Element");
            System.out.println("4. Replace All Occurrences");
            System.out.println("5. Display ArrayList");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    
                    int elementToAdd = scanner.nextInt();
                    arrayList.add(elementToAdd);
                    System.out.println(elementToAdd + " added to the ArrayList.");
                    break;
                    
                case 2:
                    System.out.print("Enter element to remove: ");
                    int elementToRemove = scanner.nextInt();
                    if (arrayList.contains(elementToRemove)) {
                        arrayList.remove(Integer.valueOf(elementToRemove));
                        System.out.println(elementToRemove + " removed from the ArrayList.");
                    } else {
                        System.out.println(elementToRemove + " not found in the ArrayList.");
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter element to search: ");
                    int elementToSearch = scanner.nextInt();
                    if (arrayList.contains(elementToSearch)) {
                        System.out.println(elementToSearch + " found in the ArrayList.");
                    } else {
                        System.out.println(elementToSearch + " not found in the ArrayList.");
                    }
                    break;
                    
                case 4:
                    System.out.print("Enter element to replace all occurrences: ");
                    int oldElement = scanner.nextInt();
                    System.out.print("Enter the new element: ");
                    int newElement = scanner.nextInt();
                    int count = 0;
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (arrayList.get(i).equals(oldElement)) {
                            arrayList.set(i, newElement);
                            count++;
                        }
                    }
                    if (count > 0) {
                        System.out.println("Replaced " + count + " occurrences of " + oldElement + " with " + newElement + ".");
                    } else {
                        System.out.println(oldElement + " not found in the ArrayList.");
                    }
                    break;
                    
                case 5:
                    System.out.println("ArrayList: " + arrayList);
                    break;
                    
                case 6:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
