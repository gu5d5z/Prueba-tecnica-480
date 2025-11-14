package pruebaTecnica480;



public class BlueRay extends DispositivosDeAlmacenamiento implements Disco {

	

	public BlueRay(String TIPO, int capacidad, boolean dispositivoConectado, String nombre)
			throws Exception {
		super(TIPO, capacidad, dispositivoConectado, nombre);
		
	}

	@Override
	public void girarDisco() 
	{
		System.out.println("El "+getNombre()+" esta girando");
			
	}

	@Override
	public String escribirDatos() {
		String resultado;
		
			resultado = "Los datos han sido escritos en el "+ getNombre();
			System.out.println(resultado);
	
		return resultado;
	}
	

	@Override
	public String leerDatos() {
		String resultado;
		
			resultado = "Los datos han sido leidos en el "+ getNombre();
			System.out.println(resultado);
		
		return resultado;
	}

	
}
