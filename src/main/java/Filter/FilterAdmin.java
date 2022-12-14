package Filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.Account;

import java.io.IOException;
import java.io.PrintWriter;

@WebFilter
public class FilterAdmin extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpSession session = req.getSession();
        Account account = (Account) session.getAttribute("account");
        if(account == null){
            res.sendRedirect("/login");
        }else if(account.getId_role()==1){
            chain.doFilter(req,res);
        }else {
            PrintWriter printWriter =res.getWriter();
            printWriter.println("<p>Không có quyền</p>");
        }
    }
}
