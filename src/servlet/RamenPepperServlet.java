package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RamenPepperServlet")
public class RamenPepperServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//index.jspにフォワード
		RequestDispatcher disp = request.getRequestDispatcher("/index.jsp");
		disp.forward(request, response);
	}


	//protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	//}

}
