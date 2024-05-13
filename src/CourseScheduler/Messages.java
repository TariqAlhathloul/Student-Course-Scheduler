package CourseScheduler;

/**
 * This class contains static final strings that are used as messages in the application.
 * These messages are displayed to the user during the execution of the program.
 * The messages guide the user on how to interact with the program.
 */
public class Messages {

    // ASCII art borders
    static final String border = "┌─────────────────────────────────────┐\n";
    static final String separator = "├─────────────────────────────────────┤\n";
    static final String endBorder = "└─────────────────────────────────────┘\n";

    /**
     * This is the welcome message displayed to the user when the program starts.
     * It provides options for the user to log in as a student or a faculty member, or to exit the program.
     */
    static final String welcomeMessage = border +
            "      WELCOME TO THE COURSE SCHEDULER\n" +
            separator +
            "        press 0 to Exit the program\n" +
            "  press 1 to Log in as an Student\n" +
            "   press 2 to Log in as a Faculty\n" +
            endBorder;

    /**
     * This is the message displayed to the user when they log in as a student.
     * It provides options for the student to view the course schedule, their course list, their information,
     * enroll in a course, unenroll from a course, or to exit back to the main menu of the program.
     */
    static final String studentMessage = border +
            "       YOU ARE LOGGED IN AS STUDENT\n" +
            separator +
            "  press 0 to Exit - to COURSE SCHEDULER\n" +
            "   press 1 to View Course Schedule\n" +
            "   press 2 to View My Course List\n" +
            "   press 3 to View My Information\n" +
            "   press 4 to Enroll myself to a Course\n" +
            "   press 5 to Unroll myself from a Course\n" +
            endBorder;

    /**
     * This is the message displayed to the user when they log in as a faculty member.
     * It provides options for the faculty member to view the course schedule, their course list, their information,
     * assign themselves to a course, remove themselves from a course, or to exit back to the main menu of the program.
     */
    static final String facultyMessage = border +
            "       YOU ARE LOGGED IN AS FACULTY\n" +
            separator +
            "  press 0 to Exit - to COURSE SCHEDULER\n" +
            "   press 1 to View Course Schedule\n" +
            "   press 2 to View My Course List\n" +
            "   press 3 to View My Information\n" +
            "   press 4 to Assign myself to a Course\n" +
            "   press 5 to Remove myself from a Course\n" +
            endBorder;
}
