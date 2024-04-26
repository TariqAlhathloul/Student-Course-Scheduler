import java.util.*;
import java.io.*;
/*
* subject: IT-245 Project.
* student name: Tariq Hassan.
* CRN: 21008.
* Date: 2024 Arp 24
* problem selected: Student Course Scheduler.
* */

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, Course> courses = new HashMap<>();
        courses.put("CSC101", new Course("CSC101", new ArrayList<>(), 2));
        courses.put("CSC102", new Course("CSC102", Collections.singletonList("CSC101"), 3));
        courses.put("CSC103", new Course("CSC103", Collections.singletonList("CSC101"), 4));
        courses.put("CSC104", new Course("CSC104", Collections.singletonList("CSC102"), 3));
        courses.put("MAT101", new Course("MAT101", new ArrayList<>(), 3));

        Map<String, List<String>> studentAvailability = new HashMap<>();
        studentAvailability.put("Monday", Arrays.asList("9:00-12:00", "14:00-17:00"));
        studentAvailability.put("Wednesday", Collections.singletonList("9:00-12:00"));

        Map<String, String> schedule = CourseScheduler.scheduleCourses(courses, studentAvailability);

        System.out.println("Feasible Schedule:");
        for (String courseId : schedule.keySet()) {
            System.out.println(courseId + ": " + schedule.get(courseId));
        }
    }
}