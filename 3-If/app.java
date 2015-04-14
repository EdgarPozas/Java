
//Java esta orientado a objetos asi que tenemos que crear una clase publica
//con el nombre de la aplicacion
public class app{
	//creamos el metodo principal o constructor em main
	public static void main(String[] args) {
		// Creamos variables
		Boolean verdad=true,falso=false;
		// si verdad es igual a true
		if(verdad==true){
			System.out.println("Verdad");
		}
		//otra condicion, si verdad es diferente a true
		else if(verdad!=true){
			System.out.println("Falso");
		}
		//si no es ninguna
		else{
			System.out.println("Ninguna");
		}

		//operadores logicos
		//or
		//cualquiera de las dos que se cumplan
		//si verdad es true o falso es true
		if (verdad==true ||falso==true) {
			System.out.println("Una de las dos correcta");
		}
		//and
		//si verdad es true y falso es false
		if (verdad==true && falso==false) {
			System.out.println("Ambas correctas");
		}
		//not
		//	!= no es igual
		if (verdad!=false) {
			System.out.println("verdad no es falso");
		}


	}
}
