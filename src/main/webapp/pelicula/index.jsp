<%@page import="com.ipartek.formacion.backoffice.pojo.Pelicula"%>
<%@page import="java.util.ArrayList"%>

<h1>Listado Peliculas</h1>

<table id="example" class="display" cellspacing="0" width="100%">
	<thead>
		<tr>
			<th>id</th>
			<th>titulo</th>
		</tr>
	</thead>
	
	<tbody>
		<%
			ArrayList<Pelicula> peliculas = (ArrayList<Pelicula>)request.getAttribute("peliculas");
			Pelicula p;
			for (int i=0; i < peliculas.size(); i++){
				p = peliculas.get(i);	
		%>
				<tr>
					<td><%=p.getId()%></td>
					<td><a href="peliculasController?id=<%=p.getId()%>"><%=p.getTitulo()%></a></td>
				</tr>
				
		<% }//endFor %>		
	</tbody>
</table>

<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.10/css/jquery.dataTables.min.css">
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="https://cdn.datatables.net/1.10.10/js/jquery.dataTables.min.js"></script>
<script>
	$(document).ready(function() {
	    $('#example').DataTable();
	} );
</script>
