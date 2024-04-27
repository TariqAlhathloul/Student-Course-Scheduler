package CourseScheduler;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Courses {

    private String CourseName;
    private String CourseID;
    private String CourseDescription;
    private String CourseDepartment;

    //read from file


    public Courses() {
        System.out.println("CourseINPUT: ");
    }
    public static void main(String[] args) {
        File courseFile = new File("InputFiles/CourseINPUT.txt");
        Scanner courseScanner = null;
        try {
            courseScanner = new Scanner(courseFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (courseScanner.hasNextLine()){
            String data = courseScanner.nextLine();
            System.out.println(data);
        }
        Courses course = new Courses();
    }
}
