//importamos una libreria para leer datos del teclado
import java.util.Scanner;
//Java esta orientado a objetos asi que tenemos que crear una clase publica
//con el nombre de la aplicacion
public class app{
	//creamos el metodo principal o constructor em main
	public static void main(String[] args) {
		/*
			para definir una variable primero ponemos de que tipo que va aser
			(int,String,double,Boolean)
		*/	
		int entero=10;
		String cadena="Hola";
		double doble=3.1416;
		Boolean bool=true;
		//Leer datos de el teclado
		Scanner leer=new Scanner(System.in);
		System.out.println("----------Leer teclado-------------");
		System.out.println("Ingresa tu nombre");
		//obtener datos string
		String datos=leer.nextLine();
		//obtener datos int
		//Int datos=leer.nextInt();
		//obtener datos double
		//double datos=leer.nextDouble();
		System.out.println("Tu nombre es : "+datos);
		System.out.println("-----------------------");

		System.out.println(entero);
		System.out.println(cadena);
		System.out.println(doble);
		System.out.println(bool);


	}
}
