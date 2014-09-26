package name.burdun.electivewebsystem.model;

/**
 * Created by burdun on 26.09.2014.
 */
public class Course {

    private int ID_Course;
    private String Title;
    private int ID_Professor;

    public Course(int ID_Course, String title, int ID_Professor) {
        this.ID_Course = ID_Course;
        Title = title;
        this.ID_Professor = ID_Professor;
    }

    public int getID_Course() {
        return ID_Course;
    }

    public void setID_Course(int ID_Course) {
        this.ID_Course = ID_Course;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getID_Professor() {
        return ID_Professor;
    }

    public void setID_Professor(int ID_Professor) {
        this.ID_Professor = ID_Professor;
    }
}
