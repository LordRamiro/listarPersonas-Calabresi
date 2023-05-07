package segundaEntrega;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;



public class Main {
	
	public static void main(String[] args){
		
		

		Persona uno = new Persona("Juan","Pérez");
		Persona dos = new Persona("Maria","López");	
		Persona tres = new Persona("Pedro","García");	
		Persona cuatro = new Persona("Ana","Sánchez");	
		Persona cinco = new Persona("Susana","Gimenez");
		
		 List<Persona>lista = new ArrayList <Persona>();

		 lista.add(uno);
		 lista.add(dos);
		 lista.add(tres);
		 lista.add(cuatro);
		 lista.add(cinco);
		 
		 int aleatorio = (int)(Math.random()*5);
		 System.out.println("Nombre y apellido aleatorios: " + lista.get(aleatorio));
		 System.out.println("----------------------------");
		 System.out.println("Personas ordenadas por nombre: ");
		 for (int i =0; i< lista.size();i++) {
			 
			 System.out.println(lista.get(i).getNombre());
			 
		 }
		 System.out.println("----------------------------");
		 System.out.println("Personas ordenadas por apellido: ");
		 for (int i =0; i< lista.size();i++) {
			 
			 System.out.println(lista.get(i).getApellido());
			 
		 }
		 System.out.println("----------------------------");
		 for (int i =0; i< lista.size();i++) {
			 Collections.reverse(lista);			 
			 System.out.println("Orden inverso por apellido: "+lista.get(i).getApellido());
			 
		 } 
		 
			
			
		}
	
	
	
	

}

