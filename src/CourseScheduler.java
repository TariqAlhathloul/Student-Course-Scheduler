import java.util.*;

class Course {
    String id;
    List<String> prerequisites;
    int duration;

    public Course(String id, List<String> prerequisites, int duration) {
        this.id = id;
        this.prerequisites = prerequisites;
        this.duration = duration;
    }
}
public class CourseScheduler {

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

        private static boolean canTakeCourse(Course course, Set<String> scheduledCourses) {
            for (String prerequisite : course.prerequisites) {
                if (!scheduledCourses.contains(prerequisite)) {
                    return false;
                }
            }
            return true;
        }
}
