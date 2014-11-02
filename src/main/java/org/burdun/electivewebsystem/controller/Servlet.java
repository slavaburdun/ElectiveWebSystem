package org.burdun.electivewebsystem.controller;

import org.burdun.electivewebsystem.DAO.ProfessorDAO;
import org.burdun.electivewebsystem.model.Professor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import javax.servlet.annotation.WebServlet;

/**
 * Created by burdun on 30.09.2014.
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String out;

        ProfessorDAO professorDAO = new ProfessorDAO();
        List<Professor> list = professorDAO.findAll();
        /*
        if (list.size() > 0) {
            out = list.toString();
        } else {
            out = "Not found";
        }
        */
        professorDAO.closeConnection();

        request.setAttribute("list", list);
        request.getRequestDispatcher("/WEB-INF/jsp/result.jsp").forward(request, response);
    }
}
