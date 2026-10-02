package com.demo.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/user")
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        User user = new User("Lewis", "Backend Developer", 27);
        Course course = new Course("IWEB", 6, 5);

        Equipo equipo = new Equipo();

        Connection connection = JdbcConnection.getConnection();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM equipos WHERE id = 1");
            resultSet.next();
            int idEquipo = resultSet.getInt(1);
            String nombre = resultSet.getString(2);
            String area = resultSet.getString(3);
            equipo.setId(idEquipo);
            equipo.setNombre(nombre);
            equipo.setArea(area);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



        req.setAttribute("equipo", equipo);
        req.setAttribute("user", user);
        req.setAttribute("materia", course);
        req.setAttribute("serverTime", LocalDateTime.now());

        req.getRequestDispatcher("/WEB-INF/views/user.jsp")
           .forward(req, resp);
    }
}
