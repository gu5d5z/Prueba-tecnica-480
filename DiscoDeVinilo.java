package pruebaTecnica480;



public class DiscoDeVinilo extends DispositivosDeAlmacenamiento implements Disco {

	
	public DiscoDeVinilo(String TIPO, int capacidad, boolean dispositivoConectado, String nombre) throws Exception {
		super(TIPO, capacidad, dispositivoConectado, nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void girarDisco() 
	{
		
	  System.out.println(getNombre()+" esta girando");
		
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
