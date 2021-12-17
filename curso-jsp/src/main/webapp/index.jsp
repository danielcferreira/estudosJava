
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Curso JSP </title>
</head>
<body>

<h1>Vamos testar um sistema de cadastro</h1>

<!-- aqui cria um formulario pra envio  -->

<form action="ServeletLogin" method="post">
 <input type="hidden" value="<%= request.getParameter("url") %>" name="url">
<!-- <input type="hidden" value="<%= request.getParameter("url") %>" name="url"> -->
<table>
<tr>
<td><label>Login</label>
<td><input name="login"  type="text"></td>
</tr>

<tr>
<td><label>Senha</label>
<td>
<input name="senha" type="password">
</td>

</tr>

<tr>
<td/>
<td><input type = "submit" value = enviar  ></td>
</tr>
</table>

</form>

<h4>${msg}</h4>

</body>
</html>