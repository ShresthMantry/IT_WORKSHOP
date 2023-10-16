import java.util.ArrayList;

import java.io.*;

import java.util.Date;

class User {
    protected String userID;
    protected String name;
    protected Date dateOfBirth;
    protected String address;
    protected String PAN;
    static ArrayList<Item> items;
    static ArrayList<FoodItem> fooditems;
    static ArrayList<NonFoodItem> nonfooditems;

    User(String userID, String name, Date dateOfBirth, String address, String PAN) {
        this.userID = userID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.PAN = PAN;
    }
}

class Admin extends User {
    private Date dateOfJoining;
    private double salary;
    private String[] permissibleOperations;

    public Admin(String userID, String name, Date dateOfBirth, String address, String PAN,
                 Date dateOfJoining, double salary, String[] permissibleOperations) {
        super(userID, name, dateOfBirth, address, PAN);
        this.dateOfJoining = dateOfJoining;
        this.salary = salary;
        this.permissibleOperations = permissibleOperations;
    }

    public void addNewStock(Item item)
    {
        this.items.add(item);
    }


}

class General extends User {
    private Date dateOfJoining;
    private double salary;
    private int dutyHourPerDay;

    public General(String userID, String name, Date dateOfBirth, String address, String PAN,
                   Date dateOfJoining, double salary, int dutyHourPerDay) {
        super(userID, name, dateOfBirth, address, PAN);
        this.dateOfJoining = dateOfJoining;
        this.salary = salary;
        this.dutyHourPerDay = dutyHourPerDay;
    }
}

class Item {
    protected String itemCode;
    protected double price;
    protected int availableQty;

    public Item(String itemCode, double price, int availableQty) {
        this.itemCode = itemCode;
        this.price = price;
        this.availableQty = availableQty;
    }
}

class FoodItem extends Item {
    private Date dateOfExpiry;

    public FoodItem(String itemCode, double price, int availableQty, Date dateOfExpiry) {
        super(itemCode, price, availableQty);
        this.dateOfExpiry = dateOfExpiry;
    }
}

class NonFoodItem extends Item {
    private int returnCount;

    public NonFoodItem(String itemCode, double price, int availableQty, int returnCount) {
        super(itemCode, price, availableQty);
        this.returnCount = returnCount;
    }
}

class Sell {
    private Date dateOfSell;
    private String itemCode;
    private int quantity;
    private double totalAmount;

    public Sell(Date dateOfSell, String itemCode, int quantity, double totalAmount) {
        this.dateOfSell = dateOfSell;
        this.itemCode = itemCode;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
    }
}

class Return {
    private Date dateOfReturn;
    private String itemCode;
    private int quantity;
    private double returnAmount;

    public Return(Date dateOfReturn, String itemCode, int quantity, double returnAmount) {
        this.dateOfReturn = dateOfReturn;
        this.itemCode = itemCode;
        this.quantity = quantity;
        this.returnAmount = returnAmount;
    }
}

class prevq
{
    public static void main(String[] args) throws ParseException {
        Admin admin = new Admin(null, null, null, null, null, null, 0, args);
        Item a = new Item(null, 0, 0);
        admin.items.add(a);
        DateFormat simpleDateFormat;
        Date date1 = simpleDateFormat.parse("2022-12-06");
        Date date2 = simpleDateFormat.parse("2022-12-06");
        System.out.println(date2.compareTo(date1));

    }
}