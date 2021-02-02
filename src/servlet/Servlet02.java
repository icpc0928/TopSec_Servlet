package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/Servlet01")
public class Servlet02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //設置服務器端向客戶端響應的內容的類型(MIME) ; 以及編碼格式
        response.setContentType("text/html;charset=utf-8");
        //要使用這個對象中的方法在頁面中輸出內容
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>標題</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<H1>hello</H1>");

        out.println("</body>");

        out.println("</html>");
        out.flush();
        out.close();
    }
}
