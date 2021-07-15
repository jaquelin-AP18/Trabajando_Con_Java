import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Scanner leer=new Scanner(System.in);
	//Llamo a mi clase CuentaBancaria (hago la instancia)
	CuentaBancaria cuenta_personal= new CuentaBancaria("Jaquelin",2800);//Creo un nuevo objeto
	CuentaBancaria cuenta_personal2= new CuentaBancaria();
	cuenta_personal2.setSaldo(-1239.76f);
	System.out.println(cuenta_personal2.getSaldo());
	
	/*
	int opcion=0;
	do  {
	
		System.out.println("******Menú cuenta bancaria******");
		System.out.println("Selecciona una opcion: ");
		System.out.println("1.-Retiro");
		System.out.println("2.- Deposito");
		System.out.println("3.- Imprimir saldo");
		System.out.println("4.- Estado de cuenta");
		System.out.println("5.- Agregar beneficiario");
		System.out.println("6.- Salir");
		
		opcion=leer.nextInt();
		
		switch(opcion) {
			case 1:
				System.out.println("Ingresa el monto a retirar:");
				float monto=leer.nextFloat();
				cuenta_personal.retiros(monto);
				System.out.println("**********************");
				break;
			case 2:
				System.out.println("Ingresa el monto a depositar:");
				float deposito=leer.nextFloat();
				cuenta_personal.depositos(deposito);
				System.out.println("**********************");
				break;
			case 3:
				
				System.out.println("Tu saldo actual es:"+ 
						cuenta_personal.consultarSaldo());	
				System.out.println("**********************");
				break;
			case 4:
				System.out.println("El beneficiario es :"+ 
						cuenta_personal.beneficiario);
				break;
			case 5:
				System.out.println("Ungrese nombre del beneficiario");
				String nombre=leer.next();
				cuenta_personal.beneficiario=nombre;
				break;
			} 
	}  while(opcion!=6);
	
	
		System.out.println("Operacion finalizada");
		System.out.println("****Vuelve pronto****");
	*/
	/*
	cuenta_personal.beneficiario="Jaquelin";//Relleno los atributos de mi clase
	
	System.out.println("Ingresa monto a depositar");
	float deposito=leer.nextFloat();
	
	System.out.println("Ingresa monto a retirar");
	float retiro=leer.nextFloat();
	
	cuenta_personal.depositos(deposito);
	cuenta_personal.retiros(retiro);
	
	System.out.println("Tu saldo actual es:"+ cuenta_personal.consultarSaldo());
	System.out.println(cuenta_personal.beneficiario);
	
	
	
	CuentaBancaria cuenta_papa= new CuentaBancaria();
	cuenta_personal.beneficiario="Rodolfo";
	*/
	}

}
