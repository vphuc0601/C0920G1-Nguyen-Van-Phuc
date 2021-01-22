import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "product_discount_calculatorServlet", urlPatterns = "/display-discount")
public class product_discount_calculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product=request.getParameter("product");
        double price=Double.parseDouble(request.getParameter("price"));
        double discount=Double.parseDouble(request.getParameter("discount"));
        double discountAmount = price* discount * 0.01;
        double discountPrice = price-discountAmount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product: " + product + "</h1>");
        writer.println("<h1>Price: " + price+ "</h1>");
        writer.println("<h1>Discount Percent: " + discount+ "</h1>");
        writer.println("<h1>Discount Amount: " + discountAmount+ "</h1>");
        writer.println("<h1>Discount Price: "+ discountPrice+ "</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
