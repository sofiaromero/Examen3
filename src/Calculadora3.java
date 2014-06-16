import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculadora3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		PrintWriter writer = response.getWriter();
 		response.setContentType("text/html");
 		int numero1, numero2, suma, resta, multiplicacion, division;
 		numero1 = Integer.parseInt(request.getParameter("numero1"));
 		numero2 = Integer.parseInt(request.getParameter("numero2"));
 		suma=numero1+numero2;
 		resta=numero1-numero2;
 		multiplicacion=numero1*numero2;
 		division=numero1/numero2;
 		writer.print("<html><body>Suma: "+ suma + "</br>Resta: " + resta + "</br>Multiplicacion: " + multiplicacion + "</br>Division: " + division + "</html></body>");
 	}
	
 }