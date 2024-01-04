

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pwriter=response.getWriter();
		pwriter.println("Uso del metodo GET");
		pwriter.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");
	     PrintWriter pwriter=response.getWriter();
	     String uname=request.getParameter("username");
	     String pw=request.getParameter("password");
	     String nombreCompleto=request.getParameter("nombre");
	     String apellido=request.getParameter("apellido");
	     String numeroDocumento=request.getParameter("numeroDocumento");
	     String telefono=request.getParameter("telefono");
	     pwriter.println("Detalles del Usuario:");
	     pwriter.println("Hola "+uname);
	     pwriter.println("Su contraseña es ***"+pw+"***");
	     pwriter.println("Registro datos de:  " +nombreCompleto);
	     pwriter.println(apellido+"***");
	     pwriter.println("Su número de documento es:  " +numeroDocumento+"***");
	     pwriter.println("Su numero de telefono es:   " +telefono+"***");
	    
	     pwriter.close();
	}

}
