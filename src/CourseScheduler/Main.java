package CourseScheduler;


import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 * Main class for the Course Scheduler application.
 */

/*
* Name: Tariq Hassan
* Date: 2024 April 1
* subject: IT-245 final project
**/
@SuppressWarnings("unused")
public class Main{
    Scanner input = new Scanner(System.in);
    // A HashMap to store all the courses with their course code as the key
    static HashMap<String, Course> courseMap = new HashMap<>();

    /**
     * The main method of the application.
     * @param args command line arguments
     * @throws IOException if an I/O error occurs
     */
    public static void main(String[] args) throws IOException {

        // Read the course data and store it in the departments map
        Map<String, Map<String, Course>> departments = Course.CourseReader.readCourseData(Course.filePathCourse);

        // Populate the courseMap with the courses from all departments
        for (Map<String, Course> courses : departments.values()) {
            courseMap.putAll(courses);
        }
        Course course = new Course();
        Scanner input = new Scanner(System.in);
        int logInOption = 0;

        System.out.println(Messages.welcomeMessage);
        logInOption = input.nextInt();

        // Main loop for the application
        while (logInOption != 0) {
            try {
                // Switch case to handle different user options
                switch (logInOption) {
                    case 1 -> {
                        System.out.println();
                        System.out.println(Messages.studentMessage);
                        Student student = new Student();
                        student.studentINFO();
                        logInOption = input.nextInt();
                        // Loop for student options
                        while (logInOption != 0) {
                            logInOption = input.nextInt();
                            // Switch case to handle different student options
                            switch (logInOption) {
                                case 1 -> {
                                    System.out.println("View Course Schedule");
                                    course.enrolledCourses.forEach(System.out::println);
                                    break;
                                }
                                case 2 -> {
                                    System.out.println("View Available Courses");
                                    Course showCourse = new Course();
                                    showCourse.displayCourses();
                                    break;
                                }
                                case 3 -> {
                                    System.out.println("View My Information");
                                    student.displayStudent();
                                    break;
                                }
                                case 4 -> {
                                    System.out.println("Enroll myself to a Course");
                                    System.out.println("Enter the course code:");
                                    String courseCode = input.next();

                                    Course Ecourse = courseMap.get(courseCode);
                                    if (Ecourse != null) {
                                        course.enrollCourse(Ecourse);
                                    } else {
                                        System.out.println("Course not found, press 2 to view available courses or 4 to retry");
                                    }
                                    break;
                                }
                                case 5 -> {
                                    System.out.println("Unroll myself from a Course");
                                    System.out.println("Enter the course code:");
                                    String courseCode = input.next();
                                    Course Ucourse = courseMap.get(courseCode);
                                    if (Ucourse != null) {
                                        course.unenrollCourse(Ucourse);
                                    } else {
                                        System.out.println("Course not found");
                                    }
                                    break;
                                }
                                case 0 -> {
                                    System.out.println("Thank you for using the Course Scheduler");
                                    break;
                                }
                                default -> {
                                    System.out.println("Invalid input");
                                    break;
                                }
                            }
                            System.out.println(Messages.studentMessage);
                        }
                    }
                    case 2 -> {
                        System.out.println(Messages.facultyMessage);
                        System.out.println();
                        Faculty faculty = new Faculty();
                        faculty.facultyINFO();
                        logInOption = input.nextInt();
                        // Loop for faculty options
                        while (logInOption != 0) {
                            logInOption = input.nextInt();
                            // Switch case to handle different faculty options
                            switch (logInOption) {
                                case 1 -> {
                                    System.out.println("View Course Schedule");
                                    break;
                                }
                                case 2 -> {
                                    System.out.println("View My Course List");
                                    course.displayCourses();
                                    break;
                                }
                                case 3 -> {
                                    System.out.println("View My Information");
                                    faculty.displayFaculty();
                                    break;
                                }
                                case 4 -> {
                                    System.out.println("Assign myself to a Course");
                                    break;
                                }
                                case 5 -> {
                                    System.out.println("Remove myself from a Course");
                                    break;
                                }
                                case 0 -> {
                                    System.out.println("Thank you for using the Course Scheduler");
                                    break;
                                }
                                default -> {
                                    System.out.println("Invalid input");
                                    break;
                                }
                            }
                        }
                    }
                    case 0 -> {
                        System.out.println("Thank you for using the Course Scheduler");
                        break;
                    }
                    default -> {
                        System.out.println("Invalid input");
                        break;
                    }
                }
            }catch (InputMismatchException e ) {
                System.out.println("Invalid input");
                input.next();
                break;
            }
            input.close();
        }
    }
}