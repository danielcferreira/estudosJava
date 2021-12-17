package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


//crt + shit + o para fazer todos os imports 
//aqui � onde faz acontecer a java 

/*Ochamando controller s�o as servLets ou servLet LoginController */
@WebServlet(urlPatterns = { "principal/ServLetLogin" , "/ServeletLogin"})//mapeamento de url que vem da tela

public class ServLetLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
     

  public ServLetLogin() {
      super();
      // TODO Auto-generated constructor stub
  }

	/*Recebe os dados  pela url em parametros*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
	}

	/*Recebe os dados enviados por um formulario */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*esses dados devem ser passas para um objeto */
		String  login =  request.getParameter("login");
		String senha =  request.getParameter("senha");
		String url = request.getParameter("url");
		
		/*se login e senha estiverem de acordo ele ira para o objeto para ir pra altentica��o*/
		/*aula 22.13*/
		if(login != null  &&  !login.isEmpty()  &&  senha != null && !senha.isEmpty() ) {
			
			ModelLogin modelLogin =  new ModelLogin();
			modelLogin.setLogin(login);
			modelLogin.setSenha(senha);
			
			//simulando login 
			if(modelLogin.getLogin().equals("admin")  
					&&  modelLogin.getSenha().equals("admin")) {
				
				
				request.getSession().setAttribute("usuario", modelLogin.getLogin());
				
				
				if(url == null || url.equals("null")) {
					url = "principal/principal.jsp";
				}

				RequestDispatcher redirecionar  = request.getRequestDispatcher(url);
				redirecionar.forward(request, response);
				
			}else {
				/*se a condi��o n�o satisfeita ele envia para a pagina inicial */
					RequestDispatcher redirecionar  = request.getRequestDispatcher("index.jsp");
					request.setAttribute("msg", "Informe o login e a senha corretamente tomar no cu ");
					redirecionar.forward(request, response);
			}
			
		}else {/*se a condi��o n�o satisfeita ele envia para a pagina inicial */
			RequestDispatcher redirecionar  = request.getRequestDispatcher("index.jsp");
			request.setAttribute("msg", "Informe o login e a senha corretamente ");
			redirecionar.forward(request, response);
		}	
		
	}

}
