package pruebaTecnica480;

public class Archivo {

	String contenido;
	int tamanoContenido;
	
	public Archivo(String contenido, int tamanoContenido) {
		
		this.contenido = contenido;
		this.tamanoContenido = tamanoContenido;
	}

	public String getContenido() {
		return this.contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getTamanoContenido() {
		return this.tamanoContenido;
	}

	public void setTamanoContenido(int tamanoContenido) {
		this.tamanoContenido = tamanoContenido;
	}
	
	@Override
	public String toString() {
		
	    return contenido + ", tamaño: " + tamanoContenido + " MB";
	    
	    
	}

	
	
	
}
