package CourseScheduler;

import java.util.List;

class Course extends UniversityMembers {

    // for course
    private int hours;
    private String department;
    private int max;
    private int crn;

    // for course

    List<String> prerequisites;

    int duration;

        // constructor
    public Course(List < String > prerequisites, int duration){
        this.prerequisites = prerequisites;
        this.duration = duration;
    }

    public Course(String courseID, List<String> strings, int courseDuration) {
    }
}
