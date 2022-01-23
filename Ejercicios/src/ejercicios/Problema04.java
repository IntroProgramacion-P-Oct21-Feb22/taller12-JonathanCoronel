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
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] bases = {100, 90, 80, 70, 60};
        double[] potencias = {2, 3, 2, 2, 1};
        int indi = 0;

        System.out.printf("\nLa sumas de todas las potencias es: %.1f\n",
                obtnerPotencias(bases, potencias, indi));

    }

    public static double obtnerPotencias(double[] arreglo1, double[] arreglo2,
            int i) {
        double[] resultado = new double[5];

        if (i < arreglo1.length) {
            resultado[i] = Math.pow(arreglo1[i], arreglo2[i]);
            System.out.printf("Valores en el arreglo resultado[%d] =%.1f\n",
                    i, resultado[i]);
            return resultado[i] + obtnerPotencias(arreglo1, arreglo2, i + 1);
        }
        return 0;
    }

}
