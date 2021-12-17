package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ModelLogin;



//crt + shit + o para fazer todos os imports 
//aqui é onde faz acontecer a java 

/*Ochamando controller são as servLets ou servLet LoginController */
@WebServlet("/ServeletLogin")//mapeamento de url de vem da tela

public class ServeletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ServeletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/*Recebe os dados  pela url em parametros*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/*Recebe os dados enviados por um formulario */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*esses dados devem ser passas para um objeto */
		String  login =  request.getParameter("login");
		String senha =  request.getParameter("senha");
		
		/*se login e senha estiverem de acordo ele ira para o objeto para ir pra altenticação*/
		/*aula 22.13*/
		if(login != null  &&  !login.isEmpty()  &&  senha != null && !senha.isEmpty() ) {
			
			ModelLogin modelLogin =  new ModelLogin();
			modelLogin.setLogin(login);
			modelLogin.setSenha(senha);
			
			//simulando login 
			if(modelLogin.getLogin().equals("admin")  
					&&  modelLogin.getSenha().equals("admin")) {
				
				
				request.getSession().setAttribute("usuario", modelLogin.getLogin());
				
				RequestDispatcher redirecionar  = request.getRequestDispatcher("principal/principal.jsp");
				redirecionar.forward(request, response);
				
			}else {
				/*se a condição não satisfeita ele envia para a pagina inicial */
					RequestDispatcher redirecionar  = request.getRequestDispatcher("index.jsp");
					request.setAttribute("msg", "Informe o login e a senha corretamente tomar no cu ");
					redirecionar.forward(request, response);
			}
			
		}else {/*se a condição não satisfeita ele envia para a pagina inicial */
			RequestDispatcher redirecionar  = request.getRequestDispatcher("index.jsp");
			request.setAttribute("msg", "Informe o login e a senha corretamente ");
			redirecionar.forward(request, response);
		}
		
		
		
		
		
	}

}
