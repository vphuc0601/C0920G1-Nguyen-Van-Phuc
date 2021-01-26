import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CaculatorServlet",urlPatterns = {""})
public class CaculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       double num1= Double.parseDouble(request.getParameter("num1"));
       double num2= Double.parseDouble(request.getParameter("num2"));
       double result=0;
       String operator=request.getParameter("operator");
       switch (operator){
           case "Addition": result=num1+num2;break;
           case "Subtraction":result=num1-num2;break;
           case "Multiplication":result=num1*num2;break;
           case "Division":if(num2!=0){
               result=num1/num2;
           }else {
               System.out.printf("Mẫu số phải khác 0!!");
           }
           request.setAttribute("Result", result);
           request.getRequestDispatcher("Result.jsp").forward(request,response);

       }
       
       
    }
}
