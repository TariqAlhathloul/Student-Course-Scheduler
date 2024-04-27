package CourseScheduler;

import CourseScheduler.UniversityMembers;

import java.util.List;

class Course extends UniversityMembers {

    static final String welcomeMessage = "\n-------------------------------" +
            "\nWELCOME TO THE COURSE SCHEDULER" +
            "\n-------------------------------" +
            "\npress 0 to Exit the program" +
            "\npress 1 to Log in as an Student" +
            "\npress 2 to Log in as a  Faculty";
    static final String studentMessage ="\n----------------------------" +
            "\nYOU ARE LOGGED IN AS STUDENT" +
            "\n----------------------------" +
            "\npress 0 to Exit - to COURSE SCHEDULER" +
            "\npress 1 to View Course Schedule" +
            "\npress 2 to View My Course List" +
            "\npress 3 to View My Information" +
            "\npress 4 to Enroll myself to a Course" +
            "\npress 5 to Unroll myself from a Course";
    static final String facultyMessage =   "\n----------------------------" +
            "\nYOU ARE LOGGED IN AS FACULTY" +
            "\n----------------------------" +
            "\npress 0 to Exit - to COURSE SCHEDULER" +
            "\npress 1 to View Course Schedule" +
            "\npress 2 to View My Course List" +
            "\npress 3 to View My Information" +
            "\npress 4 to Assign myself to a Course" +
            "\npress 5 to Remove myself from a Course";

    // for course
    private int hours;
    private String description;
    private String department;
    private int max;
    private int crn;

    private final String studentINPUT = "InputFiles/STUDENTSINPUT.txt";
    private final String facultyINPUT = "InputFiles/FacultyINPUT.txt";
    private final String courseINPUT = "InputFiles/CourseINPUT.txt";


    // for course

    List<String> prerequisites;

    int duration;

        // constructor
    public Course(String id, List < String > prerequisites, int duration){
        this.id = id;
        this.prerequisites = prerequisites;
        this.duration = duration;
    }
    }
