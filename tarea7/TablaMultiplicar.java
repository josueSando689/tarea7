package tarea7;

public class TablaMultiplicar {
int []numeros_a_multiplicar = {1,2,3,4,5,6,7,8,9,10};

public void multiplicacion_siete() {
    for (int i = 0; i < numeros_a_multiplicar.length; i++) {
        int resultado = 7 * numeros_a_multiplicar[i];
       System.out.println("La tabla del sietes es " + resultado);
    }
  }
}