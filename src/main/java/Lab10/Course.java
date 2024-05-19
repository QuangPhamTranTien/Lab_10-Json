package Lab10;
public class Course {
    private String courseName;
    private double courseGrade;

    public Course(String courseName, double courseGrade) {
        this.courseName = courseName;
        this.courseGrade = courseGrade;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(double courseGrade) {
        this.courseGrade = courseGrade;
    }
}
