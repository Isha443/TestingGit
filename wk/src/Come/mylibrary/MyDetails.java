package Come.mylibrary;
import java.util.InputMismatchException;
import Come.mylibrary.Container;
public class MyDetails {
    int roll;
    String name,email,faculty;
   char section;
        public MyDetails(int roll,String name,String email,String faculty, char section){
            this.roll = 0;
            this.name = null;
            this.email = null;
            this.faculty = null;
            this.section = '/';

        }
        public static void main(String[] args){
            new MyDetails();
        }
        try{

            Container.printMessage("Enter roll");
            roll = Container.readInt();
            Container.printMessage("Enter name");
            name = Container.readString();
        Container.printMessage("Enter email");
        email = Container.readString();
        Container.printMessage("Enter faculty");
        faculty = Container.readString();
        Container.printMessage("Enter section"); section=Container.readCharacter();

    } catch(InputMismatchException ex)

    {
        Container.printMessage(ex.getClass()+ex.getMessage());

    }
Container.printMessage("Roll", roll);
Container.printMessage("Name", name);
Container.printMessage("Email", email);
Container.printMessage("Faculty", faculty);
container.printMessage("Section",section);
        }
}
