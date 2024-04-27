package CourseScheduler;
import java.util.Scanner;

class Student extends UniversityMembers {

    Scanner input = new Scanner(System.in);
    UniversityMembers student = new UniversityMembers();

    // method to set the student information
    public void studentINFO() {
        System.out.println("Enter your Information:");
        System.out.println("first name:");
        student.setFirstName(input.next());
        System.out.println("last name:");
        student.setLastName(input.next());
        System.out.println("id");
        student.setId(input.next());
        System.out.println("birth date: ");
        student.setBirthDate(input.next());
        System.out.println("email: ");
        student.setEmail(input.next());
        System.out.println("phone number: ");
        student.setPhoneNumber(input.next());
        System.out.println("city: ");
        student.setCity(input.next());
        System.out.println("zip code: ");
        student.setZipCode(input.next());
        System.out.println("start date: ");
    }
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
}
