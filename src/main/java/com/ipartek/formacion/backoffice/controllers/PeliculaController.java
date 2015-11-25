package com.ipartek.formacion.backoffice.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.backoffice.model.ModeloDummy;
import com.ipartek.formacion.backoffice.pojo.Pelicula;

/**
 * Servlet implementation class PeliculaController
 */
public class PeliculaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ArrayList<Pelicula> peliculas = null;
	Pelicula pelicula = null;
	String parametroId = "-1";
	RequestDispatcher dispatcher = null;

	final static String JSP_PELICULAS_LISTADO = "pelicula/index.jsp";
	final static String JSP_PELICULAS_FORM = "pelicula/form.jsp";

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		super.service(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	
		// determinar la accion a realizar
		parametroId = request.getParameter("id");

		if (parametroId == null) {
			listar( request );
		} else {
			irFormulario( request );
		}

		dispatcher.forward(request, response);


	}

	private void irFormulario(HttpServletRequest request) {
		
		//obtener detalle de la pelicula solicitada
		//TODO llamar al modelo
		int id = Integer.valueOf(parametroId);
		pelicula = ModeloDummy.getById(id);
		
		//guardar como atributo en request
		request.setAttribute("pelicula", pelicula);
		
		//cargar dispatcher
		dispatcher = request.getRequestDispatcher(JSP_PELICULAS_FORM);
		

	}

	private void listar(HttpServletRequest request) {
		// llamar al modelo
		peliculas = ModeloDummy.getAll();

		// guardar en request
		request.setAttribute("peliculas", peliculas);

		// foward listado peliculas

		dispatcher = request.getRequestDispatcher(JSP_PELICULAS_LISTADO);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
