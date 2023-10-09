package com.estudos.gerenciador.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("Cadastrando nova empresa");
        PrintWriter out = resp.getWriter();

        String nomeEmpresa = req.getParameter("nome");

        out.println("<html><body>Empresa " + nomeEmpresa +" cadastrada com sucesso!</body></html>");
    }
}
