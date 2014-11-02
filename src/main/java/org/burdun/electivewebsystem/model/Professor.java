package org.burdun.electivewebsystem.model;

/**
 * Created by burdun on 26.09.2014.
 */
public class Professor {

    private int idProfessor;
    private String surname;

    public Professor() {
    }

    public Professor(int id, String surname) {
        this.idProfessor = id;
        this.surname = surname;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "idProfessor=" + idProfessor +
                ", surname='" + surname + '\'' +
                '}';
    }
}
