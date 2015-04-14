
//Java esta orientado a objetos asi que tenemos que crear una clase publica
//con el nombre de la aplicacion
public class app{
	//creamos el metodo principal o constructor em main
	public static void main(String[] args) {
		//instanciamos la nueva clase
		Clase2 cl2 =new Clase2();
		Clase3 cl3=new Clase3();
		//con cl2 podemos usar los metodos de la clase2
		System.out.println(cl2.suma(1,3));
		System.out.println(cl2.resta(4,2));
		System.out.println(cl2.mult(1,10));
		System.out.println(cl2.div(12,4));
		//con cl23 podemos usar los metodos de la clase3
		System.out.println(cl3.suma(3,6));
		System.out.println(cl3.resta(6,7));
		System.out.println(cl3.mult(3,2));
		System.out.println(cl3.div(9,1));
	}
}
