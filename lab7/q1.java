class q1 {
    public static void add(int... a)
    {
        int sum = 0;
        for(int i : a)
        {
            sum = sum+i;
        }
        System.out.println("Sum is : "+sum);
    }
    public static void main(String[] args) {
        add(1,2,3,4,5,6,7,8,9,10);
    }
}