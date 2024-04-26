import java.util.*;

class Course extends UniversityMembers{

    // for course
    private int hours;
    private String description;
    private String department;
    private int max;
    private int crn;

    private final String studentINPUT = "InputFiles/STUDENTSINPUT.txt";
    private final String facultyINPUT = "InputFiles/FacultyINPUT.txt";
    private final String courseINPUT = "InputFiles/CourseINPUT.txt";

    List<String> prerequisites;

    int duration;

    final String WelcomeMessage = "\n-------------------------------" +
            "\nWELCOME TO THE COURSE SCHEDULER" +
            "\n-------------------------------" +
            "\npress 0 to Exit the program" +
            "\npress 1 to Log in as an Student" +
            "\npress 2 to Log in as a  Faculty";
    final String StudentMessage ="\n----------------------------" +
            "\nYOU ARE LOGGED IN AS STUDENT" +
            "\n----------------------------" +
            "\npress 0 to Exit - to COURSE SCHEDULER" +
            "\npress 1 to View Course Schedule" +
            "\npress 2 to View My Course List" +
            "\npress 3 to View My Information" +
            "\npress 4 to Enroll myself to a Course" +
            "\npress 5 to Unroll myself from a Course";
    final String courseDescription = "";
    final String facultyMessage =   "\n----------------------------" +
            "\nYOU ARE LOGGED IN AS FACULTY" +
            "\n----------------------------" +
            "\npress 0 to Exit - to COURSE SCHEDULER" +
            "\npress 1 to View Course Schedule" +
            "\npress 2 to View My Course List" +
            "\npress 3 to View My Information" +
            "\npress 4 to Assign myself to a Course" +
            "\npress 5 to Remove myself from a Course";


    public Course(String id, List<String> prerequisites, int duration) {
        this.id = id;
        this.prerequisites = prerequisites;
        this.duration = duration;
    }
}
class CourseScheduler extends UniversityMembers{

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

class HashTable {


    public static void main(String[] args) {

        Hashtable<Integer, String> hash = new Hashtable<>();
        hash.put(22001, "Tariq");
        hash.put(22002, "Hassan");
        hash.put(22003, "Mohammed");
        hash.put(22004, "Faris");
        hash.put(22005, "Amar");

        for(Integer h : hash.keySet())
            System.out.println(h);
    }

}