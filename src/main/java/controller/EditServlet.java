package controller;

import dao.ShowProductsDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Product;
import service.ProductsService;

import java.io.IOException;

@WebServlet(urlPatterns = "/edit")
public class EditServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        ShowProductsDao.getAll();
        for (Product p: ProductsService.products) {
            if(p.getId()==id){
                req.setAttribute("p",p);
            }
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/EditProducts.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String img = req.getParameter("img");
        double price = Double.parseDouble(req.getParameter("price"));
        int amount = Integer.parseInt(req.getParameter("amount"));
        String detail =req.getParameter("detail");

        ProductsService.editProduct(id,new Product(id,name,img,price,amount,detail));
        resp.sendRedirect("/admin");
    }
}
