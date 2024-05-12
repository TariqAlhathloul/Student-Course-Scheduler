package CourseScheduler;
import java.util.*;
 class test {
    // main method
    public static void main(String[] args) {


// Course class to represent a course
        class Course {
            private String courseId;
            private String courseName;
            // Other course details like timing, prerequisites, etc.

            public Course(String courseId, String courseName) {
                this.courseId = courseId;
                this.courseName = courseName;
            }

            // Getters and setters
            public String getCourseId() {
                return courseId;
            }

            public String getCourseName() {
                return courseName;
            }
        }

// Student class to represent a student
        class Student {
            private String studentId;
            private String studentName;

            public Student(String studentId, String studentName) {
                this.studentId = studentId;
                this.studentName = studentName;
            }

            // Getters and setters
            public String getStudentId() {
                return studentId;
            }

            public String getStudentName() {
                return studentName;
            }
        }

         class CourseSchedulingApp {
            public static void main(String[] args) {
                // HashMaps to store courses, students, and their relationships
                HashMap<String, Course> courseMap = new HashMap<>();
                HashMap<String, Student> studentMap = new HashMap<>();
                HashMap<String, List<Course>> studentCourseMap = new HashMap<>();

                // Adding sample courses to courseMap
                Course c1 = new Course("CSE101", "Introduction to Computer Science");
                Course c2 = new Course("MTH201", "Calculus I");
                courseMap.put(c1.getCourseId(), c1);
                courseMap.put(c2.getCourseId(), c2);

                // Adding sample students to studentMap
                Student s1 = new Student("S101", "Alice");
                Student s2 = new Student("S102", "Bob");
                studentMap.put(s1.getStudentId(), s1);
                studentMap.put(s2.getStudentId(), s2);

                // Enrolling students in courses
                List<Course> aliceCourses = new ArrayList<>();
                aliceCourses.add(c1);
                aliceCourses.add(c2);
                studentCourseMap.put(s1.getStudentId(), aliceCourses);

                List<Course> bobCourses = new ArrayList<>();
                bobCourses.add(c2);
                studentCourseMap.put(s2.getStudentId(), bobCourses);

                // Displaying enrolled courses for each student
                for (Map.Entry<String, List<Course>> entry : studentCourseMap.entrySet()) {
                    String studentId = entry.getKey();
                    List<Course> courses = entry.getValue();
                    System.out.println("Courses enrolled by Student " + studentId + ":");
                    for (Course course : courses) {
                        System.out.println(course.getCourseId() + ": " + course.getCourseName());
                    }
                    System.out.println();
                }
            }
        }

    }
}
