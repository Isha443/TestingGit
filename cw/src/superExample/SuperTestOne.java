package superExample;
class STestOne{
    String country = "Nepal";//varible
    void show()
    {
        System.out.println("I am show function");//function
    }
    public STestOne(String name){
        this.name = name;
    }

}
public class SuperTestOne extends STestOne {
    void print(){
        System.out.println(super.country);
    }

    public static void main(String[] args) {
        SuperTestOne superTestOne = new SuperTestOne();
        superTestOne.print();
    }
}
