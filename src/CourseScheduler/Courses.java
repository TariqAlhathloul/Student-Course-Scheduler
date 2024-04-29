package CourseScheduler;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Courses {

    private String CourseName;
    private String CourseCode;
    private String prerequisite;
    private String creditHours;
    private String CourseDepartment;


    public void displayCourses(){
        File courseFile = new File("InputFiles/CourseINPUT.txt");
        Scanner courseScanner;
        try {
            courseScanner = new Scanner(courseFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (courseScanner.hasNextLine()){
            String data = courseScanner.nextLine();
            System.out.println(data);
        }
    }
}
