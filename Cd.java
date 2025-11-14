package pruebaTecnica480;



public class Cd extends DispositivosDeAlmacenamiento implements Disco{
	
	public Cd(String TIPO, int capacidad, boolean dispositivoConectado, String nombre) throws Exception {
		super(TIPO, capacidad, dispositivoConectado, nombre);
		
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
	
