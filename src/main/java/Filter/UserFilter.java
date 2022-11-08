//package Filter;
//
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpFilter;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import models.Account;
//
//@WebServlet(urlPatterns = "")
//
//public class UserFilter extends HttpFilter {
//    @Override
//    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException, ServletException {
//        HttpSession session = req.getSession();
//        Account account = (Account) session.getAttribute("account");
//        if (account == null) {
//            res.sendRedirect("/login");
//        } else if (account.getId_role() == 1) {
//            chain.doFilter(req,res);
//        } else {
//            PrintWriter printWriter = res.getWriter();
//            printWriter.println("<h1>Quyền Admin Không có quyền truy cập</h1>");
//        }
//    }
//}
