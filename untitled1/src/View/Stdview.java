package View;
import java.util.Scanner;
import Encap.StdEncap;
import impl.Stdimpl;
import interf.Stdinter;

public class Stdview {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2");
        int num2 = scanner.nextInt();

        StdEncap stdencap = new StdEncap();
        stdencap.setNum1(num1);
        stdencap.setNum2(num2);

        Stdinter ss = new Stdimpl();//dependency injection
        ss.add(stdencap);
        System.out.println("Substract = "+ss.subtract(stdencap));


    }
}
