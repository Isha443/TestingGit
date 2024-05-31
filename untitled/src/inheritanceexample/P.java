package inheritanceexample;
class PP{
    void show{
        System.out.println("Show Function");
    }
}
public class P extends PP {
    void display()
    {
        System.out.println("Display function");

    }
}
public class ClassFirst extends p{
    public static void main(String[] args){
        ClassFirst classFirst = new ClassFirst();
        classFirst.show();
        P p1 = new P();
        p1.show();
    }
}
