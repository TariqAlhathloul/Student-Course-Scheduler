package CourseScheduler;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;
import java.util.Scanner;
/*
* subject: IT-245 Project.
* student name: Tariq Hassan.
* CRN: 21008.
* Date: 2024 Arp 24
* problem selected: Student Course Scheduler.
* */

public class Main extends Course {
    Scanner input = new Scanner(System.in);

    public Main(String id, List<String> prerequisites, int duration) {
        super(id, prerequisites, duration);
    }

    public static void main(String[] args) throws IOException, extends UniversityMembers {
        int logInOption = 0;
        Scanner input = new Scanner(System.in);

        System.out.println(Course.welcomeMessage);
        logInOption = input.nextInt();

        while (logInOption != 0) {
            switch (logInOption) {
                case 1 -> {
                    System.out.println(Course.studentMessage);
                    while (logInOption != 0) {
                        logInOption = input.nextInt();
                        System.out.println();
                        System.out.println("Enter you information in the following format:");
                        System.out.println("First Name, Last Name, ID, Birth Date, Email, Phone Number, City, Zip Code, Start Date");
                        firstName = input.next();
                        lastName = input.next();
                        id = input.next();
                        birthDate = input.next();
                        email = input.next();
                        phoneNumber = input.next();
                        city = input.next();
                        zipCode = input.next();
                        startDate = input.next();
                        switch (logInOption) {
                            case 1 -> {
                                System.out.println("View Course Schedule");
                                break;
                            }
                            case 2 -> {
                                System.out.println("View My Course List");
                                break;
                            }
                            case 3 -> {
                                System.out.println("View My Information");

                                break;
                            }
                            case 4 -> {
                                System.out.println("Enroll myself to a Course");
                                break;
                            }
                            case 5 -> {
                                System.out.println("Unroll myself from a Course");
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
                    break;
                }
                case 2 -> {
                    System.out.println(Course.facultyMessage);
                    while (logInOption != 0) {
                        logInOption = input.nextInt();
                        switch (logInOption) {
                            case 1 -> {
                                System.out.println("View Course Schedule");
                                break;
                            }
                            case 2 -> {
                                System.out.println("View My Course List");
                                break;
                            }
                            case 3 -> {
                                System.out.println("View My Information");
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
                    break;
                }
                case 0 -> {
                    System.out.println("Thank you for using the Course Scheduler");
                    break;

                }
                default -> { System.out.println("Invalid input");
                break;
            }

            }
//        CourseScheduler courseScheduler = new CourseScheduler();
//        courseScheduler.registerCourse();
        }
    }
}


//        Map<String, Course> courses = new HashMap<>();
//        courses.put("CSC101", new Course("CSC101", new ArrayList<>(), 2));
//        courses.put("CSC102", new Course("CSC102", Collections.singletonList("CSC101"), 3));
//        courses.put("CSC103", new Course("CSC103", Collections.singletonList("CSC101"), 4));
//        courses.put("CSC104", new Course("CSC104", Collections.singletonList("CSC102"), 3));
//        courses.put("MAT101", new Course("MAT101", new ArrayList<>(), 3));
//
//        Map<String, List<String>> studentAvailability = new HashMap<>();
//        studentAvailability.put("Monday", Arrays.asList("9:00-12:00", "14:00-17:00"));
//        studentAvailability.put("Wednesday", Collections.singletonList("9:00-12:00"));
//
//        Map<String, String> schedule = CourseScheduler.scheduleCourses(courses, studentAvailability);
//
//        System.out.println("Feasible Schedule:");
//        for (String courseId : schedule.keySet()) {
//            System.out.println(courseId + ": " + schedule.get(courseId));
//        }
//        try {
//            List<String> lines = Files.readAllLines(Paths.get("InputFiles/CourseINPUT.txt"));
//            // Now lines is a List of Strings where each string is a line from the file
//            for (String line : lines) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }