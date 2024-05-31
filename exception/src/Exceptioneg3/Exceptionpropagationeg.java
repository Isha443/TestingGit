package Exceptioneg3;

public class Exceptionpropagationeg {
    static void fun1(){
        fun2();
    }
    static void fun2(){
        fun3();
    }
    static void fun3(){
        String str = " Hello BCA";
        int num = Integer.parseInt(str);
        System.out.println("Parsed value =" + num);
    }
    public static void main(String)[] args){
   try {
   fun1();
   } catch (NumberFormatException e){
       System.out.println("NumberFormatException is handled");
   }
    }
}

