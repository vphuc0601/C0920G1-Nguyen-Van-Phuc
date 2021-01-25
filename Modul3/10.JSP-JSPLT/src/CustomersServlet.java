import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomersServlet", urlPatterns = {""})
public class CustomersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList=new ArrayList<>();
        customerList.add(new Customer("Phuc", "06/01/2000", "DaNang", "img/image1.jpg"));
        customerList.add(new Customer("Luong", "12/07/2005", "Hue", "img/image2.jpg"));
        customerList.add(new Customer("Tuan", "23/11/2005", "HaNoi", "img/image3.jpg"));
        customerList.add(new Customer("Giang", "11/10/1985", "HCM", "img/image4.jpg"));

        request.setAttribute("customerslist", customerList);
        request.getRequestDispatcher("customers.jsp").forward(request,response);
    }
}
