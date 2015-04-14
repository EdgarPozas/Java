
//Java esta orientado a objetos asi que tenemos que crear una clase publica
//con el nombre de la aplicacion
public class app{
	//creamos el metodo principal o constructor em main
	public static void main(String[] args) {
		//definir un arreglo entero de 10 posiciones
		//tipo nombre[]=new tipo[posiciones];
		int arreglo[] = new int[10];

		for (int i=0;i<=9 ; i++) {
			//lenamos el arreglo
			arreglo[i]=i;

		}
		//imprimimos los datos que tenga el arreglo
		for (int i=0;i<=9 ; i++) {
			System.out.println(arreglo[i]);
		}
	}
}
