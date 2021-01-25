import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {""})
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customers> customersList= new ArrayList<>();
        customersList.add(new Customers("Phuc", "06/01/2000", "Da Nang", "image1"));
        customersList.add(new Customers("Luong", "12/12/2004", "Hue", "image2"));
        customersList.add(new Customers("Tuan", "05/04/2006", "HaNoi", "image3"));

        request.setAttribute("customerlist", customersList);
        request.getRequestDispatcher("customer.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
