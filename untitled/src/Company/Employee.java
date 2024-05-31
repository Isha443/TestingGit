package Company;
import java.util.Scanner;

public class Employee {
    private int id;
    private String name;
    private double salary;
    public Employee()
    {
        this.id =0;
        this.name ="";
        this.salary =0.0;
    }

    public Employee(int i,String name,double salary)
    {
        this.id=i;
        this.name=name;
        this.salary=salary;

    }
    public int getId()
    {
        return this.id;
    }
    public String getname()
    {
        return this.name;
    }
    public double getSalary()
    {
        return this.salary;
    }
    public static void main(String[] args){
        Employee employee = new Employee();
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        //input section//
        System.out.println("Enter id=");
        int id =scanner1.nextInt();
        System.out.println("Enter name=");
        String name =scanner2.nextLine();
        System.out.println("Enter salary=");
        double salary =scanner2.nextDouble();


        //printing default value//
        System.out.println("id= "+employee.getId());
        System.out.println("name= "+employee.getname());
        System.out.println("salary= "+employee.getSalary());
        //parameterized value//
        Employee employee1 = new Employee(id,name,salary);
        System.out.println("id= "+employee1.getId());
        System.out.println("name= "+employee1.getname());
        System.out.println("salary= "+employee1.getSalary());




    }




}
