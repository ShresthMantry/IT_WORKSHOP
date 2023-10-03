import java.util.Scanner;

class Account {
    public int accountNumber;
    public String accountType;
    public String serviceBranchIFSC;
    public float minimumBalance;
    public float availableBalance;
    public int customerID;
    public String customerName;
    public static int totalAccountCreated = 0;

    public Account(int accountNumber, String accountType, String serviceBranchIFSC,
                   float minimumBalance, float availableBalance, int customerID, String customerName) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.serviceBranchIFSC = serviceBranchIFSC;
        this.minimumBalance = minimumBalance;
        this.availableBalance = availableBalance;
        this.customerID = customerID;
        this.customerName = customerName;
        totalAccountCreated++;
    }

    public void setDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account type: ");
        this.accountType = scanner.nextLine();
        System.out.print("Enter service branch IFSC: ");
        this.serviceBranchIFSC = scanner.nextLine();
        System.out.print("Enter minimum balance: ");
        this.minimumBalance = scanner.nextFloat();
        System.out.print("Enter customer ID: ");
        this.customerID = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        System.out.print("Enter customer name: ");
        this.customerName = scanner.nextLine();
        System.out.println("Account details set successfully.");
    }

    public String getDetails(int accountNo) {
        if (accountNo == this.accountNumber) {
            return "Account Details:\nAccount Number: " + this.accountNumber +
                    "\nAccount Type: " + this.accountType +
                    "\nService Branch IFSC: " + this.serviceBranchIFSC +
                    "\nMinimum Balance: " + this.minimumBalance +
                    "\nAvailable Balance: " + this.availableBalance +
                    "\nCustomer ID: " + this.customerID +
                    "\nCustomer Name: " + this.customerName;
        } else {
            return "Account not found.";
        }
    }

    public void updateDetails(int accountNo) {
        if (accountNo == this.accountNumber) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter new account type: ");
            this.accountType = scanner.nextLine();
            System.out.print("Enter new service branch IFSC: ");
            this.serviceBranchIFSC = scanner.nextLine();
            System.out.print("Enter new minimum balance: ");
            this.minimumBalance = scanner.nextFloat();
            scanner.nextLine();  // Consume the newline character
            System.out.print("Enter new customer ID: ");
            this.customerID = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            System.out.print("Enter new customer name: ");
            this.customerName = scanner.nextLine();
            System.out.println("Account details updated successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }

    public float getBalance(int accountNo) {
        if (accountNo == this.accountNumber) {
            return this.availableBalance;
        } else {
            System.out.println("Account not found.");
            return -1;
        }
    }

    public void deposit(int accountNo, float amount) {
        if (accountNo == this.accountNumber) {
            this.availableBalance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(int accountNo, float amount) {
        if (accountNo == this.accountNumber) {
            if (this.availableBalance - amount >= this.minimumBalance) {
                this.availableBalance -= amount;
                System.out.println("Amount withdrawn successfully.");
            } else {
                System.out.println("Insufficient funds. Withdrawal not allowed.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    public static int totalAccount() {
        return totalAccountCreated;
    }
}

public class q2 {
    private static Account[] accounts;

    public static void main(String[] args) {
        accounts = new Account[10];  // Assume a maximum of 10 accounts for simplicity

        // Create sample accounts
        accounts[0] = new Account(1001, "Savings", "ABC123", 1000, 5000, 1, "John Doe");
        accounts[1] = new Account(1002, "Current", "DEF456", 5000, 10000, 2, "Jane Smith");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Update Details");
            System.out.println("2. Get Details");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Total Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    int accNumUpdate = scanner.nextInt();
                    for (Account account : accounts) {
                        if (account.accountNumber==accNumUpdate) {
                            account.updateDetails(accNumUpdate);
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    int accNumGetDetails = scanner.nextInt();
                    for (Account account : accounts) {
                        System.out.println(account.accountNumber);
                        if (account.accountNumber==accNumGetDetails) {
                            System.out.println(account.getDetails(accNumGetDetails));
                            break;
                        } 
                    }
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    int accNumDeposit = scanner.nextInt();
                    System.out.print("Enter deposit amount: ");
                    float depositAmount = scanner.nextFloat();
                    for (Account account : accounts) {
                        if (account.accountNumber==accNumDeposit) {
                            account.deposit(accNumDeposit, depositAmount);
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    int accNumWithdraw = scanner.nextInt();
                    System.out.print("Enter withdrawal amount: ");
                    float withdrawAmount = scanner.nextFloat();
                    for (Account account : accounts) {
                        if (account.accountNumber==accNumWithdraw) {
                            account.withdraw(accNumWithdraw, withdrawAmount);
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Total accounts created: " + Account.totalAccount());
                    break;

                case 6:
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
