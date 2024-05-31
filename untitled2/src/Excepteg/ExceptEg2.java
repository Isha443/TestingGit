package Excepteg;

public class ExceptEg2 {
    public static void main(String[] args){
        try{
            String str = null;
            System.out.println(str.length());
        }
        catch(Exception e) {
            System.out.println(e.getClass()+e.getMessage());
        }
        System.out.println("Isha");
        }
    }
}
