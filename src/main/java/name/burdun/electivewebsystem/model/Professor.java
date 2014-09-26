package name.burdun.electivewebsystem.model;

/**
 * Created by burdun on 26.09.2014.
 */
public class Professor {

    private int ID_Professor;
    private String Surname;

    public Professor() {
    }

    public Professor(int ID, String surname) {
        this.ID_Professor = ID;
        Surname = surname;
    }

    public int getID_Professor() {
        return ID_Professor;
    }

    public void setID_Professor(int ID_Professor) {
        this.ID_Professor = ID_Professor;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "ID_Professor=" + ID_Professor +
                ", Surname='" + Surname + '\'' +
                '}';
    }
}
