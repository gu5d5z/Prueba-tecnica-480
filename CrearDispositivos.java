package pruebaTecnica480;

public class CrearDispositivos {

	public static void main(String[] args) throws Exception {
		
	Cd cd1;
	DiscoDuro discoDuro1;
	Archivo archivo1, archivo2;
	
	cd1 = new Cd("CD-ROM", 700, true, "UNIDAD-CD-ROM");
	discoDuro1 = new DiscoDuro("HDD", 700, true, "UNIDAD-HDD" );
	archivo1 = new Archivo("Fifa 98", 500);
	archivo2 = new Archivo("Windows XP", 128);
	
	cd1.almacenarDatos(archivo1);
	cd1.escribirDatos();
	cd1.leerDatos();
	cd1.reportarInformacion();
	
	discoDuro1.almacenarDatos(archivo2);
	discoDuro1.escribirDatos();
	discoDuro1.leerDatos();
	discoDuro1.reportarInformacion();
	
	
	
		
		
		

	}

}
