package Exceptioneg3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CustomException {
    static void comeFutsalInTime(int time)throws FutsalTimeException
    {
        if(time > 11)
          {
              throw new FutsalTimeException("Wait for 20 min");
          }
        else {
              System.out.println("You can play full time");
          }
        }
        public static void main(String[] args) {
        int time=0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Kati time ma aepugxas");
            try{
                time = scanner.nextInt();
            }
            catch (InputMismatchException ex)
            {
                System.out.println(ex.getClass()+ex.getMessage());
            }
            try{
            comeFutsalInTime(time);
        }
            catch (FutsalTimeException ex)
            {
                System.out.println(ex.getClass()+ex.getMessage());
            }
    }
}
