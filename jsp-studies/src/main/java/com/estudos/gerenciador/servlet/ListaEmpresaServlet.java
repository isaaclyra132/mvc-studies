package com.estudos.gerenciador.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "listaEmpresas", value = "/listaEmpresas")
public class ListaEmpresaServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        Banco banco = new Banco();
        List<Empresa> lista = banco.getEmpresas();

        // chamar o JSP
        RequestDispatcher rd = req.getRequestDispatcher("/listaEmpresas.jsp");
        req.setAttribute("empresas", lista);
        rd.forward(req, resp);
    }
}
