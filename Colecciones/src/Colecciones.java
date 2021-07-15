import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
			 * La collection set no puede contener elementos duplicados
			 * Solo tiene los metodos heredados de Collection
			 * Es la que mejor rendimiento tiene.
			 * Los elementos no tienen un orden 
			 * Existen diferentes tipos de implementaciones:
			 * 
			 * HashSet: Esta implementacion almacena los elementos
			 * en una tabla hash.
			 * 
			 * HashSet
			 * TreeSet
			 * LinkedHashSet
			 * 
			 * Los métodos más comunes que tienen estas clases son:
			   size: Retorna la cantidad de elementos del conjunto. 
			   clear: Elimina todos los elementos.
	           remove: Elimina el elemento si existe en el conjunto:
						lista1.remove(20);
			   isEmpty: Nos informa si la lista está vacía.
			   contains: Le pasamos como parámetro el dato a buscar en el conjunto:
			   if (conjunto1.contains(20))
		 --------------------------------------------------------------
		 
		 */
		
		
		Set<String>frutas=new LinkedHashSet();
		frutas.add("Manzana");
		frutas.add("Mango");
		frutas.add("Durazno");
		frutas.add("Pera");
		frutas.add("Cereza");
		frutas.add("Mandarina");
		frutas.add("Carambola");
		frutas.add("Maracuya");
		frutas.add("Platano");
		
		for(String fruta:frutas) {
			System.out.println(fruta);
		}
		System.out.println(frutas.contains("Guayaba"));//Preguntamos si contiene un elemento predeterminado
		System.out.println(frutas.size());//Para ver el tamaño de la coleccion
	
//---------------------------------------------------------------------------------		
		/*
			 *La interfaz List define una sucesion de elementos.
			 *Si admite elementos duplicados
			 *Añade nuevos metodos que podemos usar
			 *Acceso posicional a elementos: manipula elementos en función de su posición en la lista.
			 *Búsqueda de elementos: busca un elemento concreto de la lista y devuelve su posición.
			 *Rango de operación: permite realizar ciertas operaciones sobre ragos de elementos dentro de la propia lista.
			 
			 *Implementaciones:
			 *ArrayList
			 *LinkedList
		 */
		
		//ArrayList
		List<String>frutas2=new ArrayList<String>();
		frutas2.add("Manzana");
		frutas2.add("Mango");
		frutas2.add("Durazno");
		frutas2.add("Pera");
		frutas2.add("Cereza");
		frutas2.add("Mandarina");
		frutas2.add("Carambola");
		frutas2.add("Maracuya");
		frutas2.add("Platano");
		
		for(String fruta2:frutas2) {
			System.out.println(fruta2);
		}
		int pera=frutas2.indexOf("Pera");//Para sacar el indice de un lelement
		System.out.println(pera);
		System.out.println(frutas2.get(pera));//Para recuperar un elemento
		System.out.println(frutas.contains("Guayaba"));//Preguntamos si contiene un elemento predeterminado
		System.out.println(frutas.size());//Para ver el tamaño de la coleccion
	
		/*
			 * int dato primitivo
			 * Integer es un objeto
		*/
		List<Integer>agenda= new ArrayList<Integer>();
		agenda.add(123);
		agenda.add(420);
		agenda.add(530);
		
		for(Integer a:agenda) {
			System.out.println(a);
		}
		
		//LinkedList
		List<String>animales= new LinkedList<String>();
		animales.add("Perro");
		animales.add("Gato");
		animales.add("Conejo");
		animales.add("Tortuga");
		animales.add("Oso");
		animales.add("Quetzal");
		
		for (String animal:animales) {
			System.out.println(animal);
		}
//---------------------------------------------------------------------------		
		/*
		 La interfaz Map
			 * Conocidos como diccionarios
			 * Asocia claves a los valores
			 * No puede contener claves duplicadas y cada clve
			 * solo puede tener asociado un valor
			 
			 Implementaciones:
			 * HashMap:No importa el ordenamiento
			 * TreeMap: ordena dependiendo de las claves
			 * LinkedHashMap: ordena dependiendo de la insercion
			 * 
		 */
		
		Map <String,Integer>diccionario =new HashMap();
		diccionario.put("elemento1", 1245);
		diccionario.put("telefono",121212);
		diccionario.put("llave", 542);
		
		for (Map.Entry<String, Integer> entry : diccionario.entrySet()) {
		    System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		for (String key : diccionario.keySet()) {
		     System.out.println(key +" : "+diccionario.get(key));
		}
		
		System.out.println(diccionario.get("elemento1"));
		
		Map <String,String>diccionario2 =new TreeMap();
		diccionario2.put("String1", "123");
		diccionario2.put("String2","456");
		diccionario2.put("String3", "789");
		
		for (Map.Entry<String, String> entry : diccionario2.entrySet()) {
		    System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		for (String key : diccionario2.keySet()) {
		     System.out.println(key +" : "+diccionario2.get(key));
		}
		
		Map <String,String>diccionario3 =new LinkedHashMap();
		diccionario3.put("Link2", "1");
		diccionario3.put("Link3","2");
		diccionario3.put("Link4", "3");
		
		for (Map.Entry<String, String> entry : diccionario3.entrySet()) {
		    System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		for (String key : diccionario3.keySet()) {
		     System.out.println(key +" : "+diccionario3.get(key));
		}
	
	}

}
