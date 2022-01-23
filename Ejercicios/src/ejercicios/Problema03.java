/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author JonathanCoronel
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] datos = {100, 90, 80, 70, 60};
        double[] datos2 = {200, 190, 180, 170, 160};
        int indice = 0;
        obtenerSuma(datos, datos2, indice);
    }

    public static double obtenerSuma(double[] arreglo1, double[] arreglo2, int ind) {
        double[] suma = new double[5];
        if (ind < arreglo1.length) {
            suma[ind] = arreglo1[ind] + arreglo2[ind];
            System.out.printf("Valores en el arreglo suma[%d] =%.1f\n",
                    ind, suma[ind]);
            return obtenerSuma(arreglo1, arreglo2, ind + 1);
        }
        return 0;
    }
}
