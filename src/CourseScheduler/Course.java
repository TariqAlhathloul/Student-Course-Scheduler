package CourseScheduler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    public Course(String courseCode, String courseName,
                  int creditHours, String prerequisite)
    {
        setCourseCode(courseCode);
        setCourseName(courseName);
        setCreditHours(creditHours);
        setPrerequisite(prerequisite);
    }
    // Default constructor

    public Course() {
        this.courseCode = getCourseCode();
        this.courseName = getCourseName();
        this.creditHours = getCreditHours();
        this.prerequisite = getPrerequisite();
    }

    // Getter methods
    public String getCourseCode() { return courseCode; }

    public String getCourseName() { return courseName; }


    public int getCreditHours() { return creditHours; }

    public String getPrerequisite() { return prerequisite; }

    // Setter methods
    public void setCourseCode(String courseCode) { this.courseCode = courseCode;}
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public void setCreditHours(int creditHours) { this.creditHours = creditHours; }

    public void setPrerequisite(String prerequisite) { this.prerequisite = prerequisite; }

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

     List<Course> enrolledCourses = new ArrayList<>();

    public void enrollCourse(Course course) {
        if(enrolledCourses.contains(course)) {
            System.out.println("You are already enrolled in " + course.getCourseCode());
            return;
        }
        enrolledCourses.add(course);
        System.out.println("Successfully enrolled in " + course.getCourseCode());
    }

    public void unenrollCourse(Course course) {
        if(!enrolledCourses.contains(course)) {
            System.out.println("You are not enrolled in " + course.getCourseCode());
            return;
        }
        enrolledCourses.remove(course);
        System.out.println("Successfully unenrolled from " + course.getCourseCode());
    }

    public String findCourseByCode(String courseCode) {
        for (Course course : enrolledCourses) {
            if (course.getCourseCode().equals(courseCode)) {
                return courseName;
            }
        }
        return null;
    }
    public void displayCourses() {
        Map<String, Map<String, Course>> departments = CourseReader.readCourseData(filePathCourse);

        System.out.println("┌───────────────────────────────────────┐");
        System.out.println("│          COURSE INFORMATION           │");
        System.out.println("└───────────────────────────────────────┘");

        departments.forEach((department, courses) -> {
            System.out.println("┌───────────────────────────────────────┐");
            System.out.println("│   " + department + " Department:");
            System.out.println("├───────────────────────────────────────┤");
            courses.values().forEach(course -> System.out.println("│   " + course));
            System.out.println("└───────────────────────────────────────┘");
        });
    }


}