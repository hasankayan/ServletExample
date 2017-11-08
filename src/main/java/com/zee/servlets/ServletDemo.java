package com.zee.servlets;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by HYS on 3.11.2017.
 */
@WebServlet("/ServletDemo")
public class ServletDemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ad = request.getParameter("ad");
        String soyad = request.getParameter("soyad");
        String[] telnoList = request.getParameterValues("telno");

        response.setContentType("text.html");
        PrintWriter out = response.getWriter();
        int i = 1;
        out.println("<html><form>" +
                "Name:" + ad + "<br/>" +
                "Surname:" + soyad + "<br/>");
        for (String telno : telnoList) {
            out.println("Tel No " + i + ": " + telno + "<br/>");
            i++;
        }
        out.println("</form></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
