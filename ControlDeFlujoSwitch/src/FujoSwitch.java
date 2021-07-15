import java.util.Scanner;

public class FujoSwitch {
	
	//metodo que no devuelve valores y no tiene entrada de 
    static void menu (){
        System.out.println("\n*****Bienvenido*****\n");
        System.out.println("presiona el numero de la operacion:");
        System.out.println("1-Suma");
        System.out.println("2-Resta");
        System.out.println("3-División");
        System.out.println("4-Multiplicación");
        System.out.println("0. Salir\n");
        System.out.print("Seleccione Una Opcion: \n");
       
    }

  
    public static double Suma(double num1, double num2)
    {
    double suma=num1+num2;
    return suma;
    }
    
    public static double Resta(double num1, double num2)
    {
    double resta=num1-num2;
    return resta;
    }
    
    public static double Div(double num1, double num2)
    {
    double divi=num1/num2;
    return divi;
    }
    
    public static double Multi(double num1, double num2)
    {
    double multipli=num1*num2;
    return multipli;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Switch
		 * 	Switch(condicion){
		 * 	case valor:
		 * 		codigo
		 * 		codigo
		 * 		codigo
		 * 		break;
		 * 	case valor 2;
		 * 		codigo
		 * 		codigo
		 * 		codigo
		 * 		break;
		 * 	default:
		 * 		codigo por defecto
		 * 
		 * }
		 */
		
		/*int dia=1;
		String mensaje="";
		
		switch(dia) {
		case 1:
			mensaje="Lunes";
			break;
		case 2:
			mensaje="Martes";
			break;
		case 3:
			mensaje="Miercoles";
			break;
		case 4:
			mensaje="Jueves";
			break;
		case 5:
			mensaje="Viernes";
			break;
		case 6:
			mensaje="Sabado";
			break;
		case 7:
			mensaje="Domingo";
			break;
		default:
			mensaje="Día invalido";
			break;
		}
				
		System.out.println(mensaje);*/
		
		
		Scanner Teclear = new Scanner(System.in);
	       
	       //Declaracion de varibles
	        int opc=0;//usado para leer opcion
	        double num1,num2; 
	        
	        
	        boolean salir=false;
	        
	        //Ciclo while usado para repetir el menu las veces que sean necesarias
	        while(!salir)
	        {
	           //se invoca el metodo
	            menu();
	            opc=Teclear.nextInt();
	            
	            
	            //ciclo switch usado para seleccionar una opcion del menu
	        switch(opc)
	        {
	            case 1:
	                System.out.println("Suma"); 
	                System.out.print("Ingrese numero 1: ");
	                num1=Teclear.nextDouble();
	                System.out.print("Ingrese numero 2: ");
	                num2=Teclear.nextDouble();
	                        //Se invoca al metodo
	                System.out.println("\nLa suma de los numeros es: "+Suma(num1,num2));
	            break;
	            
	            case 2:
	            	System.out.println("Resta");
	                System.out.print("Ingrese numero 1: ");
	                num1=Teclear.nextDouble();
	                System.out.print("Ingrese numero 2: ");
	                num2=Teclear.nextDouble();
	                        //Se invoca al metodo
	                System.out.println("\nLa resta de los numeros es: "+Resta(num1,num2));
	            break;
	            
	            case 3:
	            	System.out.println("Divisón"); 
	                System.out.print("Ingrese numero 1: ");
	                num1=Teclear.nextDouble();
	                System.out.print("Ingrese numero 2: ");
	                num2=Teclear.nextDouble();
	                        //Se invoca al metodo
	                System.out.println("\nLa división de los numeros es: "+Div(num1,num2));
	            break;
	            
	            case 4:
	            	System.out.println("Multiplicación"); 
	                System.out.print("Ingrese numero 1: ");
	                num1=Teclear.nextDouble();
	                System.out.print("Ingrese numero 2: ");
	                num2=Teclear.nextDouble();
	                        //Se invoca al metodo
	                System.out.println("\nLa multiplicación de los numeros es: "+Multi(num1,num2));
	            
	            case 0:
	                salir=true;
	                System.out.println("\nEl Programa Ha Finalizado");
	            break;
	            
	            default:
	            	System.out.println("La Opcion Selecciona No Se Encuentra En El Menu");
	            break;
	        }
	        }
		
	}
	
}
