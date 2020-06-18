/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import datos.FuncionarioJDBC;
import domain.Funcionario;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Cesar
 */
@WebServlet("/ServletCargos")
public class ServletCargos extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        List<Funcionario> funcionarios;
        try {
            funcionarios = new FuncionarioJDBC().listar();
            System.out.println("funcionarios="+funcionarios);
            request.setAttribute("funcionarios", funcionarios);
            request.getRequestDispatcher("funcionarios.jsp").forward(request, response);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

    }
}
