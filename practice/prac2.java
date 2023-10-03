// class shape
// {
//     shape()
//     {
//         System.out.println("Parent Class");
//     }
//     public void area()
//     {
//         System.out.println("Area of shape");
//     }
//     public void perimeter()
//     {
//         System.out.println("Perimeter");
//     } 
// }

// class Square extends shape
// {
//     int side;
//     Square(int x)
//     {
//         side = x;

//     }
//     public void area()
//     {
//         System.out.println("Area is "+side*side);
//         super.perimeter();
//     }
// }


// public class prac2 {

//     public static void main(String[] args) {
//         Square s1 = new Square(5);
//         s1.area();
//         // s1.perimeter();
//     }
// }


abstract class shape
{
    shape()
    {
        System.out.println("Parent Class");
    }
    public abstract void area();
    
    public void perimeter()
    {
        System.out.println("Perimeter");
    } 
}

class Square extends shape
{
    int side;
    Square(int x)
    {
        side = x;

    }
    public void area()
    {
        System.out.println("Area is "+side*side);
        super.perimeter();
    }
}


public class prac2 {

    public static void main(String[] args) {
        Square s1 = new Square(5);
        s1.area();
        // s1.perimeter();
    }
}
