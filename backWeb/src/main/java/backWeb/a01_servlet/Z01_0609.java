package backWeb.a01_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Z01_0609
 */
public class Z01_0609 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Z01_0609() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String []colors = {"빨","주","노","초","파","남","보"};
		for(int i=0; i<colors.length;i++) {
			out.print("<h2>"+colors[i]+"</h2>");
		}
		out.print("<script>function call(ob){ob.style.background='black';"
				+ "alert(ob.innerText+'번 안녕하세요.')}</script>");
		
		out.print("<table border>");
		int cnt=1;
		for(int i=0; i<4; i++) {
			out.print("<tr>");
			for(int j=0; j<4; j++) {
				out.print("<td onclick='call(this)'>"+cnt+"</td>");
				cnt++;
			}
			out.print("</tr>");
		}
		out.print("</table>");
		out.close();
		
		
	}

}
