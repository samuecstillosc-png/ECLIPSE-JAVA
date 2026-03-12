package ud7;

public class Agenda {
	
	private Contacto [] contactos;
	private int totalContactos;
	
	public Agenda (int tamaño) {
		this.contactos=contactos;
		this.totalContactos=0;
	}
	
	public Agenda () {
		this(10);
	}
	
	public void añadirContacto(Contacto c) {
		if (existeContacto(c)) {
			System.out.println("El contacto ya existe");
		}else if (agendaLlena()) {
			System.out.println("La agenda esta llena");
			
		}else {
			contactos[totalContactos]=c;
			totalContactos++;
			System.out.println("El contacto se ha añadido correctamente");
			
		}
	}
	
	public boolean existeContacto (Contacto c) {
		for (int i =0;i<totalContactos;i++) {
			if (contactos[i].equals(c)) {
				System.out.println("El contacto ya existe");
			}else {
				System.out.println("El contacto no existe");
	
			}
		}
		return false;
		}
		
	public void listarAgenda () {
		if(totalContactos==0) {
			System.out.println("Agenda Vacia");
			
			for (int i=0;i<totalContactos;i++) {
				System.out.println("Agenda contactos: "+contactos[i]);
			}
		}
		}
		
	public void buscaContacto (String nombre) {
		for(int i=0;i<totalContactos;i++) {
			if(contactos[i].getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("Télefono: "+contactos[i].getTelefono());
				
			}
		}
		}
		
	public void eliminaContacto (Contacto c) {
		for (int i=0;i<totalContactos;i++) {
			if (contactos[i].equals(c)) {
				for (int j=0;j<totalContactos;j++) {
					if (contactos[j].equals(c)) {
						contactos[j]=contactos[i+1];
						
					}
					
					contactos[totalContactos-1]=null;
					totalContactos--;
					
					System.out.println("Contacto eliminado");
					
					
				}
			}
			
			}
		}
			
			
			public boolean agendaLlena() {
		        return totalContactos == contactos.length;
			
		        
		}
			
			
			public int huecosLibres() {
		        return contactos.length - totalContactos;
		
	
	
	
	}

}
