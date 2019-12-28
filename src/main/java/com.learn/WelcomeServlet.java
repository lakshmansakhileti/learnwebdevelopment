package com.learn;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WelcomeServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws  IOException {
        res.setContentType("text/html");//setting the content type

        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        PrintWriter pw = res.getWriter();//get the stream to write the data


        //writing html in the stream
        pw.println("<html><body>");
        pw.println("Welcome to servlet");
        pw.println("</body></html>");

        pw.close();//closing the stream
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws  IOException {
        res.setContentType("text/html");//setting the content type

        try {
            Thread.currentThread().sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        PrintWriter pw = res.getWriter();//get the stream to write the data


        //writing html in the stream
        pw.println("<html><body>");
        pw.println("I am from post method");
        pw.println("</body></html>");

        pw.close();//closing the stream
    }
}

