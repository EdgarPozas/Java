
//Java esta orientado a objetos asi que tenemos que crear una clase publica
//con el nombre de la aplicacion
public class app{
	//creamos el metodo principal o constructor em main
	public static void main(String[] args) {
		int numero=3;
		//va acomparar l variable numero
		switch(numero){
			//caso de que sea:
			case 1:{
				System.out.println("Es : "+1);
				//se termina de comparar
				break;
			}
			//caso de que sea:
			case 2:{
				System.out.println("Es : "+2);
				//se termina de comparar
				break;
			}
			//caso de que sea:
			case 3:{
				System.out.println("Es : "+3);
				//se termina de comparar
				break;
			}
			//caso de que sea:
			case 4:{
				System.out.println("Es : "+4);
				//se termina de comparar
				break;
			}
			//si no es ninguna se usa el default
			default:{
				System.out.println("Es : "+5);
				//se termina de comparar
				break;
			}
		}
	}
}
