public class ConstructorOverloading {

    int roll;
    String Student_name;
    String color;
    ConstructorOverloading(int n)
    {
        roll = n;
    }

    ConstructorOverloading(String name)
    {
        Student_name=name;
    }

    ConstructorOverloading(int n,String name)
    {
       roll=n;
        Student_name=name;
    }

    ConstructorOverloading(String name,int n,String colour)
    {
        Student_name=name;
        roll=n;
        color=colour;
    }

    void display()
    {
        System.out.println(Student_name+" "+roll+" "+color);
    }
    public static void main(String[] args) {
        System.out.println("Constructor OverLoading");

        ConstructorOverloading obj1=new ConstructorOverloading(10);

        ConstructorOverloading obj2=new ConstructorOverloading("Ali");

        ConstructorOverloading obj3=new ConstructorOverloading(10,"ali");

        ConstructorOverloading obj4=new ConstructorOverloading("ali",10,"red");

        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();

        
    }
}
