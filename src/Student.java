class Student extends UniversityMembers{

    double GPA;
    int studentCount;
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
