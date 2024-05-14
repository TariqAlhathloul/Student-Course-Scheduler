package CourseScheduler;
import java.util.Scanner;

public class Student extends UniversityMembers {


    Scanner input = new Scanner(System.in);
    private double GPA;
    private int studentCount;

    public Student() {
        studentCount++;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    private final String studentINPUT = "InputFiles/STUDENTSINPUT.txt";

    // method to set the student information
    public void studentINFO() {
        System.out.println("┌───────────────────────────────┐");
        System.out.println("│     Enter your Information    │");
        System.out.println("└───────────────────────────────┘");

        System.out.println("first name: ex. Mohammed");
        setFirstName(input.next());
        System.out.println("last name: ex. Ali");
        setLastName(input.next());
        System.out.println("id number: ex. s220012345");
        setId(input.next());
        System.out.println("Your GPA: ex. 3.5");
        setGPA(input.nextDouble());
        System.out.println("birth date: ex. 01/01/2000");
        setBirthDate(input.next());
        System.out.println("email: ex. someone@example.com");
        setEmail(input.next());
        System.out.println("phone number: ex. 966512345678");
        setPhoneNumber(input.next());
        System.out.println("city: ex. Riyadh");
        setCity(input.next());
        System.out.println("zip code: ex. 12345");
        setZipCode(input.next());
        System.out.println("start date: ex. 01/01/2022");
        setStartDate(input.next());
    }


    // method to display the student information
    public void displayStudent() {
        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃                        STUDENT DETAILS                    ┃");
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.println("┃    ╔═════════════════════════════════════════════════════╗┃");
        System.out.println("┃    ║                                                     ║┃");
        System.out.println("┃    ║                                                     ║┃");
        System.out.println("┃    ║          First Name:   " + getFirstName() + "         ║┃");
        System.out.println("┃    ║          Last Name:    " + getLastName() + "           ║┃");
        System.out.println("┃    ║          ID:           " + getId() + "                 ║┃");
        System.out.println("┃    ║          GPA:          " + getGPA() + "                ║┃");
        System.out.println("┃    ║          Birth Date:   " + getBirthDate() + "          ║┃");
        System.out.println("┃    ║          Email:        " + getEmail() + "              ║┃");
        System.out.println("┃    ║          Phone Number: " + getPhoneNumber() + "        ║┃");
        System.out.println("┃    ║          City:         " + getCity() + "               ║┃");
        System.out.println("┃    ║          Zip Code:     " + getZipCode() + "            ║┃");
        System.out.println("┃    ║          Start Date:   " + getStartDate() + "          ║┃");
        System.out.println("┃    ║                                                     ║┃");
        System.out.println("┃    ╚═════════════════════════════════════════════════════╝┃");
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
    }
}