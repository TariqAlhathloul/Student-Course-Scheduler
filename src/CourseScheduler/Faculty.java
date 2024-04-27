package CourseScheduler;
import java.util.Scanner;

class Faculty extends UniversityMembers {

    // faculty office hours
    private String officeHours;
    // faculty department
    private int facultyCount;
    // constructor
    public Faculty(){
        facultyCount ++;
    }

    // method to set the faculty count
    Scanner input = new Scanner(System.in);
    UniversityMembers faculty = new UniversityMembers();

    // method to set the faculty information
    public void studentINFO() {
        System.out.println("Enter your Information:");
        System.out.println("first name:");
        faculty.setFirstName(input.next());
        System.out.println("last name:");
        faculty.setLastName(input.next());
        System.out.println("id");
        faculty.setId(input.next());
        System.out.println("birth date: ");
        faculty.setBirthDate(input.next());
        System.out.println("email: ");
        faculty.setEmail(input.next());
        System.out.println("phone number: ");
        faculty.setPhoneNumber(input.next());
        System.out.println("city: ");
        faculty.setCity(input.next());
        System.out.println("zip code: ");
        faculty.setZipCode(input.next());
        System.out.println("start date: ");
    }
}
