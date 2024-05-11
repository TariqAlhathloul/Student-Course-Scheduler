package CourseScheduler;

import java.util.List;

class Course extends UniversityMembers {


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
