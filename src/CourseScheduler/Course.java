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
    final static String filePathCourse = "InputFiles/CourseINPUT.txt";
    public Course(String courseCode, String courseName, int creditHours, String prerequisite) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.prerequisite = prerequisite;
    }

    // Getter and setter methods
    public String getCourseCode() {
        return courseCode;
    }

public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

public String getCourseName() {
        return courseName;
    }

public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

public int getCreditHours() {
        return creditHours;
    }

public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

public String getPrerequisite() {
        return prerequisite;
    }

public void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }



    // toString method
    public String toString() {
        return "Course code: " + courseCode + ", Course name: " + courseName + ", Credit hours: " + creditHours + ", Prerequisite: " + prerequisite;
    }
    public static class CourseReader {
        public static Map<String, Map<String, Course>> readCourseData(String filePathCourse) {
            Map<String, Map<String, Course>> departments = new HashMap<>();
            try (BufferedReader br = new BufferedReader(new FileReader(filePathCourse))) {
                String line;
                String currentDepartment = null;

                while ((line = br.readLine()) != null) {
                    if (line.startsWith("Department of")) {
                        currentDepartment = line.substring("Department of".length()).trim();
                        departments.put(currentDepartment, new HashMap<>());
                    } else if (!line.isEmpty() && !line.startsWith("(")) {
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
                // Proper error handling
                e.printStackTrace();
            }

            return departments;
        }
    }

    public static void main(String[] args) {
        // Read the data from the file and store it in the departments map
        Map<String, Map<String, Course>> departments = CourseReader.readCourseData(filePathCourse);

        // Print a sample course from each department
        departments.forEach((department, courses) -> {
            System.out.println(department + " Department:");
            courses.values().forEach(System.out::println);
        });

    }

}