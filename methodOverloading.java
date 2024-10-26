public class methodOverloading {

    public static void main(String[] args) {
        System.out.println("hyy");

        method();
        method(10);
        method("ali");
        method("ashan",654);
        method(654,"ashan");
        main();




    }
    public static void main()
    {
        System.out.println("Overloaded Main Method");
    }

    static void method()
    {
        System.out.println("method1");
    }
    static void method(int n)
    {
        System.out.println("method2");
    }
    static void method(String name)
    {
        System.out.println("method3");
    }
    static void method(String name,int roll)
    {
        System.out.println("method4");
    }
    static void method(int roll,String name)
    {
        System.out.println("method5");
    }
}
