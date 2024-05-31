package Encap;

public class Encapstd {
    private String name;
    private int rollNo;
    private int phoneNo;
    private String faculty;
    private String email;
    public String getName(String name) {
        return name;
    }
    public void getFaculty(String faculty) {
        this.faculty = faculty;
    }
    public void void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public void getPhoneNo(int phoneNo ){
        this.phoneNo = phoneNo;
    }
    public void getEmail(String email){
        this.email = email;
    }
    public int getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getFaculty() {
        return faculty;
    }
    public String getEmail() {
        return email;
    }
    public int getRollNo() {
        return rollNo;
    }

}
