package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Product;
import service.ProductsService;

import java.io.IOException;

@WebServlet(urlPatterns = "/create")
public class CreateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt((req.getParameter("id")));
        String name = req.getParameter("name");
        String img = req.getParameter("img");
        double price = Double.parseDouble(req.getParameter("price"));
        int amount = Integer.parseInt(req.getParameter("amount"));
        String detail = req.getParameter("detail");
        ProductsService.add(new Product(id,name,img,price,amount,detail));
        resp.sendRedirect("/admin");
    }
}
