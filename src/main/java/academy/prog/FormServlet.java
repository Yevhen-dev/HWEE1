package academy.prog;


import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;


// Req -> (S -> S) -> jsp

public class FormServlet extends HttpServlet {

    ArrayList<User> users = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String name = request.getParameter("name");
        String lastname = request.getParameter("lastname");
        String age = request.getParameter("age");
        String fruit = request.getParameter("fruits");
        String animal = request.getParameter("animal");

        User user = new User(name, age, lastname, fruit, animal);

        users.add(user);

        request.getSession(true).setAttribute("users", users);

        response.sendRedirect("usersResponse.jsp");


    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    }
}
