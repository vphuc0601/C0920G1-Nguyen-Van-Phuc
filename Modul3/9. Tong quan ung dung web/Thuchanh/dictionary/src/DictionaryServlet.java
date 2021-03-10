import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "DictionaryServlet", urlPatterns = {"","/translate"})
public class DictionaryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> dictionary= new HashMap<>();
        dictionary.put("dog","con chó");
        dictionary.put("cat", "con mèo");
        dictionary.put("elephant", "con voi");
        dictionary.put("bird","con chim");
        String search=request.getParameter("textSearch");
        String result=dictionary.get(search);
        if(result != null){
            request.setAttribute("text", result);
        }else {
            request.setAttribute("text","Not Found");

        }
        RequestDispatcher dispatcher=request.getRequestDispatcher("translate/translate.jsp");
        dispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("/translate/home.jsp");
    }
}
