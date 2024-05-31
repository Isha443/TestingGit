package exceptioneg3;

public class ExceptionPropagationeg {
    static void fun1(){
        fun2();
    }
    static void fun2(){
        fun3;
    }
    static void fun3(){
        String str = " Hello BCA";
        int num = Integer.parseInt(str);
        System.out.println("Parsed value =" + num);
    }
    public void
}
