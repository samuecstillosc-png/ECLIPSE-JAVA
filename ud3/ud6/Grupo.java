package ud6;

public class Grupo {
	
	private Alumno [] alumnos;
	
	public int numAlumnos;
	
	public Grupo () {
		alumnos = new Alumno [20];
		numAlumnos=0;
		
		

	}
	
	public boolean darAlta (Alumno nuevoAlumno) {
		if (numAlumnos < alumnos.length) {
			alumnos[numAlumnos] =nuevoAlumno;
			numAlumnos++;
			return true;
		}
		return false;
	}
	
	public Alumno buscarAlumno (String nom) {
		for (int i =0;i<numAlumnos;i++) {
			if (alumnos[i].getNombre().equals(nom)) {
				return alumnos[i];
			}
		}
		return null;
	}
	
	public boolean modificarNota(String nom, double nota) {
		for (int i =0;i<numAlumnos;i++) {
			Alumno a = alumnos[i];
			if (a.getNombre().equals(a)) {
				a.setNota(nota);
				return true;
				
			}
			
		}
		return false;
			
		}
		
		public double realizaMedia () {
			if (numAlumnos==0) 
				return 0;
			double suma =0;
			for (int i =0;i<numAlumnos;i++) {
				suma += alumnos[i].getNota();
				
			}
			
	
			
			return suma/numAlumnos;
				
	}
		
		public double realizaMediaMenor () {
			double suma =0;
			int contSuspensos=0;
			for (int i =0;i<numAlumnos;i++) {
				if (alumnos[i].getNota()<5) {
					suma += alumnos[i].getNota();
					contSuspensos++;
					
					
				}
				
			}
			return contSuspensos;
		}
		
		public double mejorNota (){
			if (numAlumnos==0) 
				return 0;
			double notaMaxima =alumnos[0].getNota();
			for (int i =0;i<numAlumnos;i++) {
				if (alumnos[i].getNota() > notaMaxima) {
				notaMaxima = alumnos[i].getNota();
				
				
			}
		}
			return notaMaxima;
		
		
	}
		
		public double peorNota () {
			if (numAlumnos==0) 
				return 0;
			double peorNota=alumnos[0].getNota();
			for (int i =0;i<numAlumnos;i++) {
				if (alumnos[i].getNota()<5) {
					peorNota=alumnos[i].getNota();
				}
				
				
			}
			return peorNota;
		}
		
}


