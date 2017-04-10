import sun.misc.Request;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.lang.reflect.Array;
import java.sql.Date;
import java.util.ArrayList;

/**
 * Created by byteforce on 2017.04.10..
 */
@WebServlet("/TweetCoolServlet")
public class TweetCoolServlet extends javax.servlet.http.HttpServlet {
    protected ArrayList<User> userArrayList = new ArrayList<User>();
    protected String messages;
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    String usrname = (String) request.getParameter("usrname");
    String usrcomment = (String) request.getParameter("comment");
    messages = "";
    userArrayList.add(new User(usrname,usrcomment));
        for(User users : userArrayList){
            System.out.println(users.getTime() + users.getName() + users.getComment());
            messages += users.getTime() + " " + users.getName() + " " + users.getComment() + "";

        }
        request.setAttribute("text",messages);
        RequestDispatcher rd = request.getRequestDispatcher("./index.jsp");
        rd.forward(request,response);

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
