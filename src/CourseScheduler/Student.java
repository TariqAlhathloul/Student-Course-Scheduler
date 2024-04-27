package CourseScheduler;

class Student extends UniversityMembers {

    private double GPA;
    private int studentCount;
    public Student(){
        studentCount ++;
    }
    public void setGPA(double GPA){
        this.GPA = GPA;
    }
    public double getGPA(){
        return GPA;
    }
}
