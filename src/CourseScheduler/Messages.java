package CourseScheduler;

/**
 * This class contains static final strings that are used as messages in the application.
 * These messages are displayed to the user during the execution of the program.
 * The messages guide the user on how to interact with the program.
 */
public class Messages {

    /**
     * This is the welcome message displayed to the user when the program starts.
     * It provides options for the user to log in as a student or a faculty member, or to exit the program.
     */
    static final String welcomeMessage = "\n-------------------------------" +
            "\nWELCOME TO THE COURSE SCHEDULER" +
            "\n-------------------------------" +
            "\npress 0 to Exit the program" +
            "\npress 1 to Log in as an Student" +
            "\npress 2 to Log in as a  Faculty";

    /**
     * This is the message displayed to the user when they log in as a student.
     * It provides options for the student to view the course schedule, their course list, their information,
     * enroll in a course, unenroll from a course, or to exit back to the main menu of the program.
     */
    static final String studentMessage ="\n----------------------------" +
            "\nYOU ARE LOGGED IN AS STUDENT" +
            "\n----------------------------" +
            "\npress 0 to Exit - to COURSE SCHEDULER" +
            "\npress 1 to View Course Schedule" +
            "\npress 2 to View My Course List" +
            "\npress 3 to View My Information" +
            "\npress 4 to Enroll myself to a Course" +
            "\npress 5 to Unroll myself from a Course";

    /**
     * This is the message displayed to the user when they log in as a faculty member.
     * It provides options for the faculty member to view the course schedule, their course list, their information,
     * assign themselves to a course, remove themselves from a course, or to exit back to the main menu of the program.
     */
    static final String facultyMessage =   "\n----------------------------" +
            "\nYOU ARE LOGGED IN AS FACULTY" +
            "\n----------------------------" +
            "\npress 0 to Exit - to COURSE SCHEDULER" +
            "\npress 1 to View Course Schedule" +
            "\npress 2 to View My Course List" +
            "\npress 3 to View My Information" +
            "\npress 4 to Assign myself to a Course" +
            "\npress 5 to Remove myself from a Course";
}