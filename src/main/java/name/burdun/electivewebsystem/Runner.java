package name.burdun.electivewebsystem;

import name.burdun.electivewebsystem.DAO.ProfessorDAO;
import name.burdun.electivewebsystem.model.Professor;

import java.util.List;

/**
 * Created by burdun on 26.09.2014.
 */
public class Runner {

    public static void main(String[] args) {

        ProfessorDAO professorDAO = new ProfessorDAO();
        List<Professor> list = professorDAO.findAll();
        if (list.size() > 0) {
            System.out.println(list);
        } else {
            System.out.println("Not found");
        }
        professorDAO.closeConnection();

    }
}
