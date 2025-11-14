package pruebaTecnica480;



public class DiscoDuro extends DispositivosDeAlmacenamiento implements Disco {

	
	
	
	public DiscoDuro(String TIPO, int capacidad, boolean dispositivoConectado, String nombre)
			throws Exception {
		super(TIPO, capacidad = 700, dispositivoConectado, nombre);
		
	}

	@Override
	public void girarDisco() 
	{
		
	System.out.println(getNombre()+" esta girando");
	
	}

	@Override
	public String escribirDatos() 
	{
		String resultado;

			resultado = "Los datos han sido escritos en "+ getNombre();
			System.out.println(resultado);
		
		
		return resultado;
	}

	@Override
	public String leerDatos() 
	{
	String resultado;
		
			resultado = "Los datos han sido leidos en "+ getNombre();
			System.out.println(resultado);
		
		return resultado;
	}

	
}

	


