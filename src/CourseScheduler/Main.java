package CourseScheduler;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;
import java.util.List;
import java.util.Scanner;

/*
 * subject: IT-245 Project.
 * student name: Tariq Hassan.
 * CRN: 21008.
 * Date: 2024 Arp 29.
 * problem selected: Student Course Scheduler.
 * */


/**
 * This is the main class for the Student Course Scheduler project.
 * It extends the Course class and contains the main method for the application.
 * The main method handles the user interface and user input for the application.
 * It allows users to log in as a student or faculty member and perform various actions.
 */

// extends Course class
public class Main{
    Scanner input = new Scanner(System.in);

    /**
     * This is the constructor for the Main class.
     * It calls the super constructor of the Course class.
     * @param id The ID of the course.
     * @param prerequisites The list of prerequisites for the course.
     * @param duration The duration of the course.
     */

    /**
     * This is the main method for the application.
     * It handles the user interface and user input for the application.
     * It allows users to log in as a student or faculty member and perform various actions.
     * @param args The command line arguments for the application.
     * @throws IOException If an input or output exception occurred.
     */

    // HashMaps to store courses, students, and their relationships

    
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        HashMap<String, Course> courseMap = new HashMap<>();
        HashMap<String, Faculty> facultyMap = new HashMap<>();
        HashMap<String, List<Course> > studentMap = new HashMap<>();
        Course course = new Course();

        Scanner input = new Scanner(System.in);
        int logInOption = 0;

        System.out.println(Messages.welcomeMessage);
        logInOption = input.nextInt();

        while (logInOption != 0) {

            switch (logInOption) {
                // Student login
                case 1 -> {
                    System.out.println();
                    System.out.println(Messages.studentMessage);
                    Student student = new Student();
                    student.studentINFO();
                    logInOption = input.nextInt();
                    while (logInOption != 0) {
                        logInOption = input.nextInt();
                        switch (logInOption) {
                            // View course schedule
                            case 1 -> {
                                System.out.println("View Course Schedule");
                                break;
                            }
                            // View available courses
                            case 2 -> {
                                System.out.println("View Available Courses");
                                Course showCourse = new Course();
                                showCourse.displayCourses();
                                break;
                            }
                            // View student information
                            case 3 -> {
                                System.out.println("View My Information");
                                student.displayStudent();
                                break;
                            }
                            // Enroll in a course
                            case 4 -> {
                                System.out.println("Enroll myself to a Course");
                                System.out.println("Enter the course code:");
                                String courseCode = input.next();
                                Course Ecourse = courseMap.get(courseCode);
                                if (Ecourse != null) {
                                    course.enrollCourse(Ecourse);
                                } else {
                                    System.out.println("Course not found");
                                }
                                break;
                            }
                            // Unenroll from a course
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
                            // Exit the application
                            case 0 -> {
                                System.out.println("Thank you for using the Course Scheduler");
                                break;
                            }
                            // Invalid input
                            default -> {
                                System.out.println("Invalid input");
                                break;
                            }
                        }
                        System.out.println(Messages.studentMessage);
                    }
                    break;
                }
                // Faculty login
                case 2 -> {
                    System.out.println(Messages.facultyMessage);
                    System.out.println();
                    Faculty faculty = new Faculty();
                    faculty.facultyINFO();
                    logInOption = input.nextInt();
                    while (logInOption != 0) {
                        logInOption = input.nextInt();
                        switch (logInOption) {
                            // View course schedule
                            case 1 -> {
                                System.out.println("View Course Schedule");
                                break;
                            }
                            // View faculty's course list
                            case 2 -> {
                                System.out.println("View My Course List");
                                Course showCourse = new Course();
                                showCourse.displayCourses();
                                break;
                            }
                            // View faculty information
                            case 3 -> {
                                System.out.println("View My Information");
                                faculty.displayFaculty();
                                break;
                            }
                            // Assign faculty to a course
                            case 4 -> {
                                System.out.println("Assign myself to a Course");
                                break;
                            }
                            // Remove faculty from a course
                            case 5 -> {
                                System.out.println("Remove myself from a Course");
                                break;
                            }
                            // Exit the application
                            case 0 -> {
                                System.out.println("Thank you for using the Course Scheduler");
                                break;
                            }
                            // Invalid input
                            default -> {
                                System.out.println("Invalid input");
                                break;
                            }
                        }
                    }
                    break;
                }
                // Exit the application
                case 0 -> {
                    System.out.println("Thank you for using the Course Scheduler");
                    break;
                }
                // Invalid input
                default -> { System.out.println("Invalid input");
                    break;
                }
            }
        }
    }
}
