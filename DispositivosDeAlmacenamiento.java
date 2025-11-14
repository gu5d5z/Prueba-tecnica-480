package pruebaTecnica480;

import java.util.ArrayList;
import java.util.List;

public abstract class DispositivosDeAlmacenamiento {
	
	protected String nombre;
	protected final String TIPO;
	protected int capacidad;
	protected List<Archivo> contenidos;
	protected boolean dispositivoConectado = false;


	public DispositivosDeAlmacenamiento(String TIPO, int capacidad, boolean dispositivoConectado, String nombre) throws Exception {
		
		if (dispositivoConectado != true) {
			
			throw new Exception("POR FAVOR INSERTAR DISPOSITIVO");
		}
		
		this.TIPO= TIPO;
		this.capacidad = capacidad;
		this.dispositivoConectado = dispositivoConectado;
		this.nombre = nombre;
		this.contenidos = new ArrayList<>(); 
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTIPO() {
		return TIPO;
	}
	
	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public List<Archivo> getContenido() {
		return this.contenidos;
	}

	public void setContenido(List<Archivo> contenido) {
		this.contenidos = contenido;
	}
	
	public boolean getDispositivoConectado() {
		return dispositivoConectado;
	}

	public void setDispositivoConectado(boolean dispositivoConectado) {
		this.dispositivoConectado = dispositivoConectado;
	}


	public String almacenarDatos(Archivo archivo) 
	{
		
		String resultado = "";
			
			 if(archivo.tamanoContenido > getCapacidad()) 
			 {
				 
				 resultado = "Dispositivo "+getNombre()+" no tiene espacio de almacenamiento";
				 System.out.println(resultado);
			 }
			 else 
			 {
				 resultado = "La descarga han sido almacenados en "+getNombre();
				 System.out.println(resultado);
				 
				 contenidos.add(archivo);
				 setCapacidad(this.getCapacidad() - archivo.tamanoContenido);
			 }
			 
			 
		return resultado;
	}
	
	public void mostrarDatosAlmacenados() 
{
			for (Archivo archivo : contenidos) 
			{
				System.out.println(archivo.getContenido() +"("+archivo.getTamanoContenido()+"MB)");
			}
}
	public abstract String escribirDatos();
	public abstract String leerDatos();
	
	public String reportarInformacion() {
		String resultado;
	
			resultado = 
					"Nombre: "+ getNombre()+
					" Capacidad: "+ getCapacidad()+" MB"+
					" Contenido: "+getContenido()+
					" Tipo: "+getTIPO(); 
			
			System.out.println(resultado);
			System.out.println("");
		
		return resultado;
	}
	
	
	
	
	
}
