package br.com.caelum.mvc.logica;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;


public class MostraContatoLogica implements Logica {

	public String executa(HttpServletRequest req, HttpServletResponse resp)
			throws Exception {

		long id = Long.parseLong(req.getParameter("id"));
		
		Connection connection = (Connection) req.getAttribute("connection");
		
		Contato contato = new ContatoDao(connection).pesquisar(id);
		
		req.setAttribute("contato", contato);
		
		return "/WEB-INF/jsp/adiciona-contato.jsp";
	
	}

}