package org.burdun.electivewebsystem.model;

/**
 * Created by burdun on 26.09.2014.
 */
public class Course {

    private int idCourse;
    private String Title;
    private int idProfessor;

    public Course() {
    }

    public Course(int idCourse, String title, int idProfessor) {
        this.idCourse = idCourse;
        Title = title;
        this.idProfessor = idProfessor;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "idCourse=" + idCourse +
                ", Title='" + Title + '\'' +
                ", idProfessor=" + idProfessor +
                '}';
    }
}
