package CourseScheduler;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Course {
        private String courseCode;
        private String courseName;
        private int creditHours;
        private String prerequisite;

        public Course(String courseCode, String courseName, int creditHours, String prerequisite) {
            this.courseCode = courseCode;
            this.courseName = courseName;
            this.creditHours = creditHours;
            this.prerequisite = prerequisite;
        }
        public Course(){}

        // Getters and setters
        // You can generate them automatically in most IDEs or write them manually

        public String toString() {
            return "Course code: " + courseCode + ", Course name: " + courseName + ", Credit hours: " + creditHours + ", Prerequisite: " + prerequisite;
        }


    public static class readCourseData {
        public static void main(String[] args) {
            // Map to store courses for each department
            Map<String, Map<String, Course>> departments = new HashMap<>();

            try (BufferedReader br = new BufferedReader(new FileReader("InputFiles/CourseINPUT.txt"))) {
                String line;
                String currentDepartment = null;

                while ((line = br.readLine()) != null) {
                    if (line.startsWith("Department:")) {
                        currentDepartment = line.substring("Department:".length()).trim();
                        departments.put(currentDepartment, new HashMap<>());
                    } else {
                        String[] parts = line.split(",");
                        if (currentDepartment != null && parts.length == 4) {
                            String courseCode = parts[0].trim();
                            String courseName = parts[1].trim();
                            int creditHours = Integer.parseInt(parts[2].trim());
                            String prerequisite = parts[3].trim();

                            departments.get(currentDepartment).put(courseCode, new Course(courseCode, courseName, creditHours, prerequisite));
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Print a sample course from each department
            departments.forEach((department, courses) -> {
                System.out.println(department + " Department:");
                System.out.println(courses.get("CS001")); // Change course code as needed
            });
        }
    }

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
