package Str;

import java.util.Scanner;

public class St {

    public static  void main(String arg[]) {
        String name = "Isha";
        int count=0;
        for (int i = 0; i < name.length(); i++) {
            char character= name.charAt(i);
            System.out.println(character);
            if (name.charAt(i) == 'a' ||

                    name.charAt(i) == 'e' || name.charAt(i) == 'i'

                    || name.charAt(i) == 'u') {
                        count =count+1;}
        }
System.out.println("Name is "+name);
        System.out.println("Vowel letter is "+count);
                String n="Ram";
                String m="Bahadur";
           String lastName="Thapa";
    char first=n.charAt(0);
    char middle=m.charAt(0);

System.out.println(Character.toString(first)+"." +
        Character.toString(middle)+" "+ lastName);
    String nam ="Ram";
    String output = "M"+nam+"M";
    System.out.println(output);

    //reverse
        StringBuffer sb=new StringBuffer("Welcome");
        sb.reverse();
        System.out.println(sb);

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Letter:");
        String na = scanner.nextLine();
        int limits=2;
        if(na.length()<limits){
            System.out.println("Enter more:");
        }else{
            System.out.println(na+na+na);
        }
}
}


