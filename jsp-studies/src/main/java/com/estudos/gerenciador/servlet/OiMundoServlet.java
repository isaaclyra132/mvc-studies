package com.estudos.gerenciador.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "oi", value = "/oi")
public class OiMundoServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("Oi mundo, parabens vc escreveu o primeiro servlets.");
        out.println("</body>");
        out.println("</html>");

        System.out.println("O Servlet OiMundoServlet foi chamado");
    }
}
