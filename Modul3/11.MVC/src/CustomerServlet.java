import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {"", "/customers"})
public class CustomerServlet extends HttpServlet {
    private CustomerService customerService=new CustomerServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action= request.getParameter("action");
        if(action==null){
            action="";
        }
        switch (action){
            case "create":
                createCustomers(request,response);
                break;
            case "edit":
                updateCustomer(request,response);
                break;
            case "delete":
                deleteCustomer(request,response);
                break;
            default:
                viewCustomer(request,response);
            break;
        }
    }

    private void viewCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.customerService.findById(id);
        RequestDispatcher dispatcher;
        if(customer == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("customer", customer);
            dispatcher = request.getRequestDispatcher("customer/view.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id=Integer.parseInt(request.getParameter("id"));
        Customer customers=this.customerService.findById(id);
        RequestDispatcher dispatcher;
        if(customers==null){
            dispatcher =request.getRequestDispatcher("error-404.jsp");
        }else {
            this.customerService.remove(id);
        }
        try {
            response.sendRedirect("/customers");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id=Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String address=request.getParameter("address");
        Customer customers=this.customerService.findById(id);
        RequestDispatcher dispatcher;
        if(customers==null){
            dispatcher=request.getRequestDispatcher("error-404.jsp");
        }else {
            customers.setName(name);
            customers.setEmail(email);
            customers.setAddress(address);
            this.customerService.update(id,customers);
            request.setAttribute("customers", customers);
            request.setAttribute("message", "Customer information was updated");
            dispatcher=request.getRequestDispatcher("/customers/edit.jsp");
        }
        try{
            dispatcher.forward(request,response);
        }catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void createCustomers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String address=request.getParameter("address");
        int id=(int) (Math.random()*10000);
        Customer customers=new Customer(id, name, email, address);
        this.customerService.save(customers);
        RequestDispatcher dispatcher=request.getRequestDispatcher("/customers/create.jsp");
        request.setAttribute("message","New customers was Create");
        try {
            dispatcher.forward(request,response);
        }catch (ServletException | IOException e){
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action= request.getParameter("action");
        if(action==null){
            action="";
        }
        switch (action){
            case "create":
                showCreateForm(request,response);
                break;
            case "edit":
                showEditForm(request,response);
                break;
            case "delete":
                showDeleteForm(request,response);
                break;
            case "view":
                viewCustomer(request,response);
                break;
            default:
                listCustomers(request,response); break;
        }
    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) {
        int id=Integer.parseInt(request.getParameter("id"));
        Customer customers= this.customerService.findById(id);
        RequestDispatcher dispatcher;
        if(customers==null){
            dispatcher=request.getRequestDispatcher("error-404.jsp");
        }else {
            request.setAttribute("customers", customers);
            dispatcher=request.getRequestDispatcher("/customers/delete.jsp");
            try{
                dispatcher.forward(request,response);
            } catch (ServletException | IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int id=Integer.parseInt(request.getParameter("id"));
        Customer customers=this.customerService.findById(id);
        RequestDispatcher dispatcher;
        if(customers==null){
            dispatcher=request.getRequestDispatcher("error-404.jsp");
        }else {
            request.setAttribute("customers",customers);
            dispatcher=request.getRequestDispatcher("/customers/edit.jsp");
        }
        try{
           dispatcher.forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher=request.getRequestDispatcher("/customers/create.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException | IOException e){
            e.printStackTrace();
        }
    }

    private void listCustomers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers=this.customerService.findALl();
        request.setAttribute("customers", customers);
        RequestDispatcher dispatcher=request.getRequestDispatcher("/customers/list.jsp");
        try{
            dispatcher.forward(request, response);
        }catch (ServletException | IOException e){
            e.printStackTrace();
        }

    }
}
