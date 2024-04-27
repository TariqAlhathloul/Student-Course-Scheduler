package CourseScheduler;
import java.util.Scanner;

class Student extends UniversityMembers {

    Scanner input = new Scanner(System.in);
    private double GPA;
    private int studentCount;
    public Student(){
        studentCount ++;
    }
    public void setGPA(double GPA){
        this.GPA = GPA;
    }
    public double getGPA(){
        return GPA;
    }

    // method to set the student information
    public void studentINFO() {
            System.out.println("Enter your Information:");
            System.out.println("first name:");
            setFirstName(input.next());
            System.out.println("last name:");
            setLastName(input.next());
            System.out.println("id");
            setId(input.next());
            System.out.println("Your GPA: ");
            setGPA(input.nextDouble());
            System.out.println("birth date: ");
            setBirthDate(input.next());
            System.out.println("email: ");
            setEmail(input.next());
            System.out.println("phone number: ");
            setPhoneNumber(input.next());
            System.out.println("city: ");
            setCity(input.next());
            System.out.println("zip code: ");
            setZipCode(input.next());
            System.out.println("start date: ");
            setStartDate(input.next());
        }


    // method to display the student information
    public void displayStudent(){
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("ID: " + getId());
        System.out.println("GPA: " + getGPA());
        System.out.println("Birth Date: " + getBirthDate());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("City: " + getCity());
        System.out.println("Zip Code: " + getZipCode());
        System.out.println("Start Date: " + getStartDate());
    }
}
