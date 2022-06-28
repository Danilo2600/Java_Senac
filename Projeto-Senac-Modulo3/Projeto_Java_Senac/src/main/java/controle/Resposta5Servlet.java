package controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDAO;
import model.Usuario;


@WebServlet("/Resposta5Servlet")
public class Resposta5Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Resposta5Servlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String Resposta = request.getParameter("resposta5");

		Usuario u = null;

		UsuarioDAO dao = new UsuarioDAO();

		u = dao.resposta5(Resposta);

		if (u != null) {
			response.sendRedirect("pergunta6.jsp");
		} else {
			response.sendRedirect("erro.jsp");
		}
	}

}
