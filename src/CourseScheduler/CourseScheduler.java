package CourseScheduler;
import java.util.*;
import java.util.Scanner;

// class to schedule
class CourseScheduler extends UniversityMembers {
    // method to schedule courses
    Scanner scanner = new Scanner(System.in);
    public static Map<String, String> scheduleCourses(Map<String, Course> courses, Map<String, List<String>> studentAvailability) {
        Map<String, String> schedule = new HashMap<>();
        Set<String> scheduledCourses = new HashSet<>();

        for (String day : studentAvailability.keySet()) {
            List<String> availableSlots = studentAvailability.get(day);
            for (String slot : availableSlots) {
                for (String courseId : courses.keySet()) {
                    if (!scheduledCourses.contains(courseId) && canTakeCourse(courses.get(courseId), scheduledCourses)) {
                        schedule.put(courseId, day + " " + slot);
                        scheduledCourses.add(courseId);
                        break;
                    }
                }
            }
        }

        return schedule;
    }

    // method to register a course
    public void registerCourse(){
        System.out.println("Enter the course ID: ");
        String courseID = scanner.nextLine();
        System.out.println("Enter the course name: ");
        String courseName = scanner.nextLine();
        System.out.println("Enter the course department: ");
        String courseDepartment = scanner.nextLine();
        System.out.println("Enter the course description: ");
        String courseDescription = scanner.nextLine();
        System.out.println("Enter the course hours: ");
        int courseHours = scanner.nextInt();
        System.out.println("Enter the course max: ");
        int courseMax = scanner.nextInt();
        System.out.println("Enter the course CRN: ");
        int courseCRN = scanner.nextInt();
        System.out.println("Enter the course prerequisites: ");
        String coursePrerequisites = scanner.nextLine();
        System.out.println("Enter the course duration: ");
        int courseDuration = scanner.nextInt();
        Course course = new Course(courseID, Collections.singletonList(coursePrerequisites), courseDuration);
    }

    // method to check if a course can be taken
    private static boolean canTakeCourse(Course course, Set<String> scheduledCourses) {
        for (String prerequisite : course.prerequisites) {
            if (!scheduledCourses.contains(prerequisite)) {
                return false;
            }
        }
        return true;
    }
}
