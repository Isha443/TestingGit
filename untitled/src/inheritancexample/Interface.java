package inheritancexample;

interface A{
    void print();//virtual function
}
interface B{
    void printdisplay();

}
public class MultipleInheritance implements A,B{

    @Override
    public void print() {
       System.out.println("PrintFunction");
    }
}