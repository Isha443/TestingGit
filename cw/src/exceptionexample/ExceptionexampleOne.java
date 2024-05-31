package exceptionexample;

public class ExceptionexampleOne {
    public static void main(String[] args) {
        int a = 0;
        try {
            a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getClass() + e.getMessage());
            //system.out.println(e); wrong method
            //e.printStackTrace;
        }
        System.out.println(a);
    }
}
