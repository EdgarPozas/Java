
//Java esta orientado a objetos asi que tenemos que crear una clase publica
//con el nombre de la aplicacion
public class app{
	//creamos el metodo principal o constructor em main
	public static void main(String[] args) {
		int i=0;
		//mientras se cumpla la condicion
		while(i<=10){
			System.out.println("Dentro de while "+i);
			i++;
		}
		//do-while
		//primero se hacen las intrucciones y al final se evalua
		do{
			System.out.println("Dentro de do-while"+i);
			i++;
		}while(i<=20);
	}
}
