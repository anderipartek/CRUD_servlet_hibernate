package com.ipartek.formacion.backoffice.pojo;

public class Pelicula {
	
	private int id;
	private String titulo;
	private String sinapsis;
	
	
	public Pelicula(String titulo) {
		super();
		setId (-1);
		setTitulo(titulo);
		this.sinapsis = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam sit amet velit sit amet odio mollis vestibulum. Sed iaculis cursus neque ac efficitur. Aenean ultrices, tortor a mollis cursus, mauris ante facilisis nisl, vitae volutpat lorem elit ac risus. Duis porttitor libero augue, ac tincidunt nisi dapibus non. Morbi tincidunt tellus id lorem condimentum, quis eleifend magna feugiat. Quisque a maximus metus. Suspendisse lacinia non mi ut dignissim. Nulla auctor ultricies elit, non pretium justo dapibus nec. Vestibulum in leo eget enim maximus sagittis vitae id libero. Duis eu imperdiet nunc, sit amet interdum leo. Maecenas egestas dui nisi, id aliquam ligula posuere ut. Interdum et malesuada fames ac ante ipsum primis in faucibus. Curabitur pulvinar vel tortor non sagittis.";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getSinapsis() {
		return sinapsis;
	}


	public void setSinapsis(String sinapsis) {
		this.sinapsis = sinapsis;
	}


	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", titulo=" + titulo + ", sinapsis="
				+ sinapsis + "]";
	}
	
	
	

}
