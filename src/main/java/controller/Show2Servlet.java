package controller;

import dao.ShowProductsDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/show")
public class Show2Servlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("products", ShowProductsDao.getAll());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/user.jsp");
        requestDispatcher.forward(req,resp);

    }
}
