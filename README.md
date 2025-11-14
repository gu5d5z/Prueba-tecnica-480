# CREADOR DE DISPOSITIVOS

Mi proyecto ha sido desarrollado para una prueba técnica. En este proyecto he creado dos objetos: CD y Disco Duro. Estos objetos comparten atributos y métodos, por lo que he creado la clase abstracta DispositivosDeAlmacenamiento para aplicar uno de los conceptos más importantes de la OOP: el polimorfismo. También he creado la interfaz Disco, que será utilizada por los objetos que son discos pero no son dispositivos de almacenamiento, como un Frisbee o una rueda de coche.

## Tipos de clases e interfaz creadas y sus características

Archivo: contiene el contenido y su tamaño. // Clase común

DispositivosDeAlmacenamiento: contiene los atributos String nombre, String TIPO (constante), int capacidad, Array contenidos, boolean dispositivoConectado.

BlueRay: contiene todos los atributos de la clase DispositivosDeAlmacenamiento y la interfaz Disco. // Clase común

Cd: contiene todos los atributos de la clase DispositivosDeAlmacenamiento y la interfaz Disco. // Clase común

DiscoDuro: contiene todos los atributos de la clase DispositivosDeAlmacenamiento y la interfaz Disco. // Clase común

Frisbee: contiene la interfaz Disco. // Clase común

Disco: contiene el método girarDisco. // Interfaz

## Métodos de los objetos CD y Disco Duro

girarDisco(): es un método implementado por una interfaz para indicar el comportamiento de los objetos que son discos, como CD y Disco Duro. Algunos objetos, como un SSD, no tienen disco; por lo tanto, este método no se implementa en ellos.

AlmacenarDatos(): almacena datos de otra clase llamada Archivo. Esta clase, que también es un objeto, tiene su contenido y tamaño; cuando se añade este objeto a los CD o Disco Duro, ellos ahora contendrán esa información en su atributo contenido.

LeerDatos(): muestra en pantalla que se están leyendo los datos del archivo.

EscribirDatos(): muestra en pantalla que se están escribiendo los datos del archivo.

ReportarInformación(): muestra en pantalla la información de los objetos, incluyendo nombre, capacidad, contenido y tipo.