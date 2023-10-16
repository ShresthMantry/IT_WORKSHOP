class A
{
    static int a=1;
    A()
    {
        a++;
    }
}
class B extends A{

}

class check {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);
        B c = new B();
        System.out.println(c.a);
        System.out.println(b.a);
    }
}