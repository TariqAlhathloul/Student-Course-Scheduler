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

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    // method to set the faculty count
    Scanner input = new Scanner(System.in);

    // method to set the faculty information
    public void facultyINFO() {
        System.out.println("Enter your Information:");
        System.out.println("first name:");
        setFirstName(input.next());
        System.out.println("last name:");
        setLastName(input.next());
        System.out.println("id");
        setId(input.next());
        System.out.println("office hours: ");
        setOfficeHours(input.next());
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
    }

    // method to display the faculty information
    public void displayFaculty(){
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("ID: " + getId());
        System.out.println("Office Hours: " + officeHours);
        System.out.println("Birth Date: " + getBirthDate());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("City: " + getCity());
        System.out.println("Zip Code: " + getZipCode());
        System.out.println("Start Date: " + getStartDate());
    }
}
