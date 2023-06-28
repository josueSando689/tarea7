package tarea7;

public class CienNumeros {
int suma=0;

public CienNumeros(){
}

public void sumaAlCien() {
	for (int i=1; i<=100; i++) { 
	suma  += i;
	System.out.println ("La suma de todos los numeros es " + suma);
		}
	}
}