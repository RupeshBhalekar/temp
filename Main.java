class calculator{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }
};



class Main{
    public static void main(String a[])
    {
        
        calculator obj = new calculator();
        int res = obj.add(3,4);
        System.out.println(res);
        // calculator obj = new calculator();
        // int res2 = obj.add(3,4,5);
        // System.out.println(res2);
        System.out.println("Hello Mandy");
        // System.out.println("Hello Rupesh");
    }
}